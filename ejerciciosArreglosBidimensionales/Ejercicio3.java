package ejerciciosArreglosBidimensionales;
//Diseñe una función que calcule y devuelva la suma de dos matrices.
public class Ejercicio3 {
    public static void main(String[] args) {
        int [][] matriz1 = new int[10][10];
        int [][] matriz2 = new int[10][10];

        System.out.println("Contenido de la matriz 1:");

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                matriz1[i][j] = (int) Math.round(Math.random()*100);
                System.out.print(matriz1[i][j] + " ");
            }

            System.out.println();
        }
        System.out.println("\nContenido de la matriz 2:");

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                matriz2[i][j] = (int) Math.round(Math.random() * 100);
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("La sumatoria de las dos matrices es: "+ sumarDosMatrices(matriz1,matriz2));
    }

    public static int sumarDosMatrices(int[][] m1, int[][] m2){
        int sumatoria1 = 0,sumatoria2 = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sumatoria1 += m1[i][j];
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sumatoria2 += m2[i][j];
            }
        }
        return sumatoria1+sumatoria2;
    }
}
