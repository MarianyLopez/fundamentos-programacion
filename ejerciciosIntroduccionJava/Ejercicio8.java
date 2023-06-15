package ejerciciosIntroduccionJava;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        String calificacion;
        char cal;

        System.out.println("Ingrese su calificación");
        calificacion = a.next().toUpperCase();
        cal= calificacion.charAt(0);

        switch (cal){
            case 'A':
                System.out.println("La evaluación de "+cal+ "es: 0");
                break;
            case 'B':
                System.out.println("La evaluación de "+cal+ "es: 1");
                break;
            case 'C':
                System.out.println("La evaluación de "+cal+ "es: 2");
                break;
            case 'D':
                System.out.println("La evaluación de "+cal+ "es: 3");
                break;
            case 'E':
                System.out.println("La evaluación de "+cal+ "es: 4");
                break;
            case 'F':
                System.out.println("La evaluación de "+cal+ "es: 5");
                break;
            default:
                System.out.println("La calificación "+cal+ " no es correcta");
        }

    }
}
