#include <stdlib.h>
#include <stdio.h>
#include <string.h>


typedef struct _nstring {
char *data;
int size;
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
for (int i = 1; i <= x; i++) {
char jfpvu[12];
snprintf(jfpvu, 12, "%d", i);
nstring *vyeil = (nstring *) malloc (sizeof(nstring));
vyeil->size = strlen (jfpvu)+12;
vyeil->data = (char *) malloc (vyeil->size);
strcpy(vyeil->data, "");
strcat(vyeil->data, jfpvu);
strcat(vyeil->data,  " Abracadabra");
prints(vyeil);
free(vyeil->data);
free(vyeil);
}


}