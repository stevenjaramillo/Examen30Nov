package com.core.presentacion;

public class Ejercicio_Cuatro {
    public static void main(String[] args) {


        int[] numeros = {2, -4, - 13, 1, -3, 15, 1, 9, 6, -8, 4, 23, 7, -13, 13, 23, 15, -13, 9, 0};
        int numeroPequeno = 0;
        int numeroMayor = 0;

        int numeroPequeño = numeros[0];
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] < numeroPequeno) {
                numeroPequeno = numeros [i];
            }

        }
        System.out.println("El numero mas pequeño es -> " + numeroPequeno);

    }
}
