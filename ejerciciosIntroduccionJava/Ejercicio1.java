package ejerciciosIntroduccionJava;

import com.sun.source.tree.IfTree;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int num;

        System.out.println("Ingrese el número del cliente");
        num = a.nextInt();

        if (num==1000){
            System.out.println("Ganaste un premio");
        }else {
            System.out.println("Sigue participando");
        }
    }
}