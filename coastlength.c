#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int n, m;
char *array;
char *visited;

int dfs (int i, int j) {

    if (i < 0 || j < 0 || j >= m || i >= n) return 0;   //out of bounds
    if (visited[((m * i) + j)] == 1) return 0;          //visited
    if (array[((m * i) + j)] == 1) return 1;            //is land?
    visited[((m * i) + j)] = 1;

    int ret = 0;
    int top = dfs(i-1,j);
    int bottom = dfs (i+1,j);
    int left = dfs(i,j-1);
    int right = dfs(i,j+1);
    ret = top+bottom+left+right;

    return ret;

}

int main()
{
    scanf("%d %d\n", &n, &m);

    n+=2;
    m+=2;

    size_t array_size = sizeof(char) * n * m;
    array = (char *) malloc(array_size);
    visited = (char *) malloc(array_size);

    for (int k = 0; k < m; ++k) {
        array[k] = 0;
        array[(m*(n-1))+k] = 0;
    }
    for (int k = 0; k < n; ++k) {
        array[((m * k)+0)] = 0;
        array[((m * k)+m-1)] = 0;

    }

    for (int i = 1; i < n-1; ++i) {
        char string[m-2];
        fgets(&string,m+2,stdin);

        for (int j = 1; j < m-1; ++j) {
            array[((m * i) + j)] = string[j-1] - 48; //ascii
            visited[((m * i) + j)] = 0;
        }
    }

    int sum = dfs(0,0);
    printf("%d\n", sum);

    free(array);
    free(visited);
    return 0;
}