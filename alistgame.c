#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <math.h>

void main(){

	int n = 0;
	int c = 0;
	int d = 2;
    	int rr = scanf ("%d", &n);

	while(d*d <= n){
		if (n % d == 0){
			n/=d;
			c++;
		} else {
			d+= 1 + d % 2;
		}
	}
	if (n > 1) c++;
	printf("%d\n",c);

	


}
