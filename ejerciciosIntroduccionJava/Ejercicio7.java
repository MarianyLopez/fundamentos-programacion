package ejerciciosIntroduccionJava;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int edad;

        System.out.println("Ingrese la edad");
        edad = a.nextInt();

        for (int i=1;i<=edad;i++)
            System.out.println(i);
    }
}
