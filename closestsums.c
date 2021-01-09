#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <math.h>
#include <unistd.h>

void main(){

    for(int cc = 1;;cc++){

        int n = 0;
        int rr = scanf ("%d\n", &n);
        if (rr == EOF){
            break;
        }
        long long *inn = (long long *) malloc(n*sizeof(long long));

        for(int i = 0; i<n;i++){
            long long num = 0;
            scanf ("%lld\n", &num);
            inn[i]=num;
        }

        int m = 0;
        scanf ("%d\n", &m);
        printf("Case %d:\n", cc);
        for(int q = 0; q<m;q++){
            long long x = 0;
            scanf ("%lld\n", &x);


            long long best = 922337203685477580;

            for (int i = 0; i < n; i++){
                for (int j = i+1; j < n; j++){
                    if (inn[i]==inn[j]){
                        continue;
                    }
                    long long s = inn[i]+inn[j];
                    if (abs(x-s)<abs(x-best)){
                        best = s;
                    }
                }
            }

            printf("Closest sum to %lld is %lld.\n",x,best);

        }
        free(inn);
    }
}