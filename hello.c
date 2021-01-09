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
nstring *propw = (nstring *) malloc (sizeof(nstring));
propw->data = (char *) malloc (50);
propw->allocsize = 50;
propw->size = 12;
strcpy(propw->data, "Hello World!");
prints(propw);

free(propw->data);
free(propw);

}