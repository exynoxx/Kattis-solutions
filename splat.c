#include <stdio.h>
#include <stdlib.h>
#include <math.h>

typedef struct prototype {
    double x;
    double y;
    double r;
    char color[20];
} circle;

double dist (double a, double b, double x, double y) {
    return sqrt(pow(fabs(a-x), 2)+pow(fabs(b-y), 2));
}

int main()
{
    int casen;
    scanf("%d", &casen);

    for (int t = 0; t < casen; ++t) {
        int n;
        scanf("%d", &n);

        circle c[100];
        int idx = 0;

        for (int i = 0; i < n; ++i) {
            double x,y,v;
            scanf("%lf %lf %lf %s", &x,&y,&v, c[idx].color);

            double r = sqrt(v / M_PI);

            c[idx].r = r;
            c[idx].x = x;
            c[idx].y = y;
            idx++;
        }

        int m;
        scanf("%d", &m);

        for (int k = 0; k < m; ++k) {
            double a,b;
            scanf("%lf %lf", &a, &b);

            int white = 1;
            for (int j = idx-1; j >= 0; --j) {
                if (dist(a, b, c[j].x, c[j].y) <= c[j].r) {
                    printf("%s\n", c[j].color);
                    white = 0;
                    break;
                }
            }
            if (white) {
                printf("white\n");
            }
        }





    }
}
