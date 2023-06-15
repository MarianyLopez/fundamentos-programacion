package ejerciciosConVectores;

import java.util.Scanner;

//Ingresar 10 valores numéricos a un array y mostrar cuantos son pares y cuantos son impares.
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int par=0,impar=0;

        int vector [] = new int [10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el "+ (i+1)+" elemento");
            vector[i]= scanner.nextInt();

            if (vector[i] % 2 ==0)
                par++;
            else
                impar++;
        }
        System.out.println("En el array hay "+par+" números pares y "+impar+" impares");
    }
}
