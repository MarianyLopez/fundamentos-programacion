package ejerciciosArreglosBidimensionales;

import java.util.Scanner;

//Diseñe un subalgoritmo que permita escribir el contenido de un arreglo bidimensional.
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filas,columnas;

        System.out.println("Ingrese el numero de filas de la matriz");
        filas = scanner.nextInt();
        System.out.println("Ingrese el numero de columnas de la matriz");
        columnas = scanner.nextInt();

        int [][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas ; j++) {
                matriz[i][j] = (int) Math.round(Math.random()*100);
            }
        }
        leerContenidoMatriz(matriz,filas,columnas);
    }
    public static void leerContenidoMatriz(int [][] matriz, int filas, int columnas){
        System.out.println("Contenido de la matriz:");
        for (int i = 0; i < filas; i++) {
            System.out.println(" ");
            for (int j = 0; j < columnas ; j++) {
                System.out.print(matriz[i][j]+" ");
            }
        }
    }
}
