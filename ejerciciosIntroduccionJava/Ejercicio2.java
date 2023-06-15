package ejerciciosIntroduccionJava;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int num1,num2;

        System.out.println("Ingrese el primer número");
        num1 = a.nextInt();

        System.out.println("Ingrese el segundo número");
        num2 = a.nextInt();

        if (num1<num2)
            System.out.println("El primer número "+ num1+" es el menor");
        else if (num2<num1) {
            System.out.println("El segundo número "+ num2+" es el menor");
        }else
            System.out.println("Los números son iguales");

    }
}
