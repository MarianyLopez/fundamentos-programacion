package ejerciciosArreglosBidimensionales;

import java.util.Scanner;

//Diseñe un algoritmo que calcule y muestre la cantidad de números pares que hay en un
//arreglo bidimensional de m x n elementos enteros.
public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m,n,pares =0;

        System.out.println("Ingrese el número de filas de la matriz" );
        m = scanner.nextInt();

        System.out.println("Ingrese el número de columnas de la matriz" );
        n = scanner.nextInt();

        int [][] matriz = new int[m][n];

        System.out.println("Contenido de la matriz:");
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j]= (int) Math.round(Math.random()*100);
                System.out.print(matriz[i][j]+ " ");
                if (matriz[i][j] % 2 == 0)
                    pares++;
            }
            System.out.println();
        }
        System.out.println("La cantidad de números pares que hay en la matriz es: "+ pares);
    }
}
