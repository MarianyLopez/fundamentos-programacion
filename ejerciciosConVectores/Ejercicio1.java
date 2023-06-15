package ejerciciosConVectores;

import java.util.Scanner;

//Crear un arreglo con n numeros, ingresados por teclado y mostrar sus valores elevados al cuadrado.
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n, cuadrado;

        System.out.println("Ingrese el tamaño del vector");
        n = scanner.nextInt();
        int vector [] = new int [n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el "+ (i+1)+" elemento");
            vector[i]= scanner.nextInt();

            cuadrado = vector[i]*vector[i];
            vector[i]= cuadrado;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Cuadrado del elemento en posición "+(i+1)+": "+vector[i]);
        }
    }
}
