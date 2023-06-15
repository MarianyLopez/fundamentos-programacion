package ejerciciosIntroduccionJava;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un número");
        num = a.nextInt();

        if (num%2==0)
            System.out.println("El número "+num+ " es par");
        else
            System.out.println("El número "+num+ " es impar");

    }
}
