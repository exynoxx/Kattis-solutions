#include <stdio.h>
#include <stdlib.h>

int array_n[1000000];
int array_m[1000000];

int binary_search (int *array, int left, int right, int x) {

    int mid = (left+right)/2;

    int val = array[mid];
    if (val == x) {
        return mid;
    }
    if (left >= right) return -1;

    //move here
    if (val > x) {
        return binary_search(array,0,mid-1,x);
    }

    if (val < x) {
        return binary_search(array,mid+1,right,x);
    }
}

int main () {

    int n, m;
    while (1) {
        scanf("%d %d", &n, &m);

        if (n == 0 && m == 0) {
            break;
        }

        for (int i = 0; i < n; ++i) {
            scanf("%d", &array_n[i]);
        }
        for (int i = 0; i < m; ++i) {
            scanf("%d", &array_m[i]);
        }

        int count = 0;
        for (int i = 0; i < n; ++i) {
            if (binary_search(array_m,0,m,array_n[i]) >= 0) {
                count++;
            }
        }
        printf("%d\n", count);
    }

    return 0;
}