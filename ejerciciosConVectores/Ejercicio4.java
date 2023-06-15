package ejerciciosConVectores;

import java.util.Scanner;

// Pedir por teclado el tamaño de un arreglo de números y pedir los valores numéricos con los
// que se rellena. Los valores no se pueden repetir, por lo tanto, deberá de encargarse de buscar
//cada número que lea y verificar que no se haya leído antes.Mostrar el arreglo con los valores al final.
public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tamano, num=0;

        System.out.println("Ingrese el tamaño del vector");
        tamano = scanner.nextInt();
        int vector [] = new int [tamano];

        for (int i = 0; i < tamano; i++) {
            System.out.println("Ingrese el número " + (i + 1));
            vector[i] = scanner.nextInt();
            if (i != 0)
                num = vector[i-1];

            if (num == vector[i])
                i--;
        }

        for (int i = 0; i < tamano; i++) {
            System.out.println("Número " + (i+1) + " en el array: " + vector[i]);
        }
    }
}
