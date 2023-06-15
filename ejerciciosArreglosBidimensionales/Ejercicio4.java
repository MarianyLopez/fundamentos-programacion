package ejerciciosArreglosBidimensionales;

public class Ejercicio4 {
    public static void main(String[] args) {
        int [][] matriz = new int[5][5];
        crearArreglo(matriz);
    }
    public static void crearArreglo(int [][] matriz){
        for (int i = 0; i < 5; i++) {
            matriz[i][i]=1;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
        }
    }
}
