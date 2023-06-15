package ejerciciosConVectores;

// Elaborar un programa que ingrese 20 números aleatorios a un
//array y mostrar una lista de los números menores o iguales que
//10 que hayan sido ingresados.
public class Ejercicio6 {
    public static void main(String[] args) {

        int vector[] = new int[20];

        for (int i = 0; i < 20; i++) {
            vector[i] = (int) Math.round(Math.random() * 30);
            if (vector[i]<=10)
                System.out.print(vector[i]+ " ");
        }


    }
}
