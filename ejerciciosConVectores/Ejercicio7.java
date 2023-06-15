package ejerciciosConVectores;

import java.util.Scanner;

//Realizar la operación para llenar de forma aleatoria un vector de
//números enteros y contar cuantos números que están
//almacenados en el vector son números primos.
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamano, contador =0;

        System.out.println("Ingrese la longitud o tamaño del vector");
        tamano = scanner.nextInt();

        int [] vector = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            vector[i] = (int) Math.round(Math.random()*100);
            int cant = 0;
            if (vector[i] > 1) {
                for (int j = 1; j <= vector[i]; j++) {
                    if (vector[i] % j == 0)
                        cant++;
                }
            }
            if (cant == 2)
                contador++;

            System.out.print(vector[i]+ " ");
        }

        System.out.println("\n"+"La cantidad de números primos en el vector es: "+ contador);
    }
}
