package ejerciciosConVectores;

import java.util.Scanner;

// Hacer un programa que permita ingresar 10 valores a un array
//seguido muestre cuantos son positivos, cuantos negativos y
//cuantos son nulos.
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos=0,negativos=0, nulos=0;

        int vector [] = new int [10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el "+ (i+1)+" elemento");
            vector[i]= scanner.nextInt();

            if (vector[i]<0)
                negativos++;
            else
                if (vector[i]==0)
                    nulos++;
                else
                    positivos++;
        }
        System.out.println("En el array hay "+positivos+" números positivos, "+negativos
                +" negativos y "+nulos+" nulos");
    }
}
