package ejerciciosArreglosBidimensionales;
//Diseñe un algoritmo que genere las tablas de multiplicar del uno al diez en un solo arreglo
//bidimensional y posteriormente imprima dicho arreglo
public class Ejercicio5 {
    public static void main(String[] args) {
        int [][] tablas = new int[10][10];

        System.out.println("TABLAS DE MULTIPLICAR");
        for (int i = 0; i < 10; i++) {
            System.out.println("Tabla del "+i +":");

            for (int j = 0; j < 10 ; j++) {
                tablas [i][j] = (i+1) * (j+1);
                System.out.println( (i+1) + "*" + (j+1) + "=" + tablas[i][j]);
            }
            System.out.println();
        }
    }
}
