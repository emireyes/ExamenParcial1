//programa que si le das un entero te da todos sus impares hasta el numero que le indiques 


#include <stdio.h>

int main() {
    int numero;

    printf("Ingrese un numero entero: ");
    scanf("%d", &numero);

    if (numero <= 0) {
        printf("El numero debe ser positivo.\n");
    } else {
        printf("Los numeros impares desde 1 hasta %d son:\n", numero);

        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                printf("%d ", i);
            }
        }

        printf("\n");
    }

    return 0;
}

