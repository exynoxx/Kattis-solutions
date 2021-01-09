#include <stdio.h>
#include <stdint.h>

int main()
{
    char string1[1000];
    char string2[1000];

    fgets(string1, sizeof(string1), stdin);
    fgets(string2, sizeof(string2), stdin);

    int i1 = 0;
    int i2 = 0;

    for (int i = 0; string1[i] != '\0'; ++i) {
        if (string1[i] == 'a') i1++;
    }
    for (int i = 0; string2[i] != '\0'; ++i) {
        if (string2[i] == 'a') i2++;
    }

    if (i1 >= i2) {
        printf("go\n");
    } else{
        printf("no\n");
    }

    return 0;
}