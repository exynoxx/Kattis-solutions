#include <stdio.h>
#include <stdlib.h>

#define boolean int
#define true    1
#define false   0

typedef struct node_prototype {
    int v;
    int parentidx;
    int rank;
} node;

node *array;
int n;
int m;

int find(int x) {

    if (array[x].parentidx != x) {
        array[x].parentidx = find(array[x].parentidx);
    }
    return array[x].parentidx;
}

void makeUnion (int x, int y){

    int rootx = find(x);
    int rooty = find(y);

    if (rootx == rooty)
        return;

    if (array[rootx].rank > array[rooty].rank) {
        array[rootx].parentidx = rooty;

    } else if (array[rootx].rank > array[rooty].rank) {
        array[rooty].parentidx = rootx;
    } else {
        array[rootx].parentidx = rooty;
        array[rooty].rank++;
    }
}

boolean isJoint(int x, int y) {
    int rootx = find(x);
    int rooty = find(y);

    if (rootx == rooty) {
        return true;
    } else {
        return false;
    }
}

int main()
{

    scanf("%d %d",&n,&m);

    node stack[n];
    array = &stack;

    for (int i = 0; i < n; ++i) {
        array[i].v = i+1;
        array[i].parentidx = i;
        array[i].rank = 0;
    }

    for (int i = 0; i < m; ++i) {

        int a, b;

        scanf("%d %d",&a,&b);
        makeUnion(a-1, b-1);
    }


    boolean noOne = true;
    for (int k = 1; k < n; ++k) {
        if (!isJoint(0, k)) {
            printf("%d\n", array[k].v);
            noOne = false;
        }
    }

    if (noOne) {
        printf("Connected\n");
    }
    return 0;
}