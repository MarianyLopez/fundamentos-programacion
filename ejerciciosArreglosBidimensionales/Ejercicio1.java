package ejerciciosArreglosBidimensionales;

import java.util.Scanner;

//Diseñe un subalgoritmo que permita leer el contenido de un arreglo bidimensional.
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamano;

        System.out.println("Ingrese la longitud del vector");
        tamano = scanner.nextInt();
        int [] vector = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            vector[i] = (int) Math.round(Math.random()*100);
        }
        leerContenidoArreglo(vector,tamano);
    }
    public static void leerContenidoArreglo(int [] vector,int tamano){
        System.out.println("Contenido del arreglo:");
        for (int i = 0; i < tamano; i++) {
            System.out.print(vector[i]+" ");
        }
    }
}
