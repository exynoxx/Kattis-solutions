#include <stdio.h>
#include <stdint.h>

int main()
{
    int n;

    scanf("%d",&n);

    int a[n];
    int bmax[n];

    int max = 0;
    int min = INT32_MAX;
    int count = 0;


    for (int i = 0; i < n; ++i) {

        scanf("%d",&a[i]);

        if (a[i] > max) {
            max = a[i];
        }

        bmax[i] = max;
    }

    for (int i = n-1; i >= 0; --i) {

        if (a[i] < min) {
            min = a[i];
        }

        if (bmax[i] == min) {
            count++;
        }
    }

    printf("%d\n", count);

    return 0;
}