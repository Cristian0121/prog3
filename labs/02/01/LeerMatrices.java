
package lab2;


import java.util.Scanner;

public class LeerMatrices {

   
    public static double[][] leerMatriz() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de filas de la matriz:");
        int filas = scanner.nextInt();
        System.out.println("Ingrese el número de columnas de la matriz:");
        int columnas = scanner.nextInt();

        double[][] matriz = new double[filas][columnas];

        System.out.println("Ingrese los elementos de la matriz:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }

        return matriz;
    }

   
    public static void imprimirMatriz(double[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        System.out.println("Matriz Resultante:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }


 public static void imprimirMatriz1(double[][] matriz1) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;

        System.out.println("Matriz 1:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println();
        }
    }


 public static void imprimirMatriz2(double[][] matriz2) {
        int filas = matriz2.length;
        int columnas = matriz2[0].length;

        System.out.println("Matriz 2:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
