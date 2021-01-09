#include <stdlib.h>
#include <stdio.h>


typedef struct _nstring {
char *data;
int size;
int allocsize;
} nstring;

void prints(nstring * x) {
printf("%s\n", x->data);
}
 void printi(int x) {
printf("%d\n", x);
}

void main () {
int x = 0;
scanf ("%d", &x);
if(x % 2 == 0){
nstring *tdngk = (nstring *) malloc (sizeof(nstring));
tdngk->data = (char *) malloc (50);
tdngk->allocsize = 50;
tdngk->size = 3;
strcpy(tdngk->data, "bob");
prints(tdngk);
free(tdngk->data);
free(tdngk);

}else {
nstring *jbcgs = (nstring *) malloc (sizeof(nstring));
jbcgs->data = (char *) malloc (50);
jbcgs->allocsize = 50;
jbcgs->size = 5;
strcpy(jbcgs->data, "alice");
prints(jbcgs);
free(jbcgs->data);
free(jbcgs);

}

}