#include <stdio.h>
#include <math.h>

int main()
{
    int c;
    scanf("%d",&c);

    int a[1000];

    for (int k = 0; k < c; ++k) {

        int n;
        scanf("%d",&n);

        /* avg */
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            scanf("%d",&a[i]);
            sum += a[i];
        }
        double avg = sum / n;

        /* elements > avg */
        double amounts = 0;
        for (int j = 0; j < n; ++j) {
            if (a[j] > avg) {
                amounts++;
            }
        }
        amounts = amounts * 100.0 / n ;

        printf("%.3lf%\n", amounts);

    }


    return 0;
}