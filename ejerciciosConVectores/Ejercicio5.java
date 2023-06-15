package ejerciciosConVectores;

import java.util.Scanner;

//Haz un vector numérico de 10 posiciones dados por el usuario y
//muestre los elementos que son mayores al numero dado por el
//usuario.
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int vector [] = new int [10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el "+ (i+1)+" elemento");
            vector[i]= scanner.nextInt();
        }
        System.out.println("Ingrese el número a validar");
        num = scanner.nextInt();

        System.out.println("Los números mayores que " + num + " son:");
        for (int i = 0; i < 10; i++) {
            if (num < vector[i])
                System.out.println(vector[i]);
        }
    }
}
