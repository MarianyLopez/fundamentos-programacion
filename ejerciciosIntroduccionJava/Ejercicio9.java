package ejerciciosIntroduccionJava;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int numSilla;
        double valorTotal;

        System.out.println("Ingrese el número de sillas a comprar");
        numSilla = a.nextInt();

        if (numSilla <= 5)
            valorTotal = numSilla*40000;
        else if (numSilla <=12)
            valorTotal = (numSilla*40000)*0.9;
        else if (numSilla <= 40)
            valorTotal = (numSilla*40000)*0.8;
        else
            valorTotal = (numSilla*40000)*0.7;

        System.out.println("El total a pagar por "+ numSilla+ " es "+valorTotal);
    }
}
