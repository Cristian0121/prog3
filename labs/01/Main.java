
package lab2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        System.out.println("Operaciones Matriciales:");
        System.out.println("1. Suma de matrices");
        System.out.println("2. Producto de matrices");
        System.out.println("3. Producto de un escalar con una matriz");
        System.out.println("4. Traspuesta de una matriz");

        int opcion = new Scanner(System.in).nextInt();
        
             double[][] matriz1 = LeerMatrices.leerMatriz();
             double[][] matriz2 = LeerMatrices.leerMatriz();
                 
        
        switch (opcion) {
      
            case 1:
                if (matriz1.length == matriz2.length && matriz1[0].length == matriz2[0].length) {
                    LeerMatrices.imprimirMatriz1(matriz1);
                      LeerMatrices.imprimirMatriz2(matriz2);
                    double[][] suma = OperacionesMatriciales.sumarMatrices(matriz1, matriz2);
                    LeerMatrices.imprimirMatriz(suma);
                } else {
                    System.out.println("No se pueden sumar las matrices debido a dimensiones diferentes.");
                }
                break;
            case 2:
                if (matriz1[0].length == matriz2.length) {
                    LeerMatrices.imprimirMatriz1(matriz1);
                      LeerMatrices.imprimirMatriz2(matriz2);
                    double[][] producto = OperacionesMatriciales.multiplicarMatrices(matriz1, matriz2);
                    LeerMatrices.imprimirMatriz(producto);
                } else {
                    System.out.println("No se pueden multiplicar las matrices debido a dimensiones incompatibles.");
                }
                break;
            case 3:
                System.out.println("Ingrese el escalar:");
                double escalar = new Scanner(System.in).nextDouble();
                double[][] productoEscalar = OperacionesMatriciales.multiplicarEscalarMatriz(escalar, matriz1);
                LeerMatrices.imprimirMatriz1(matriz1);
                LeerMatrices.imprimirMatriz(productoEscalar);
                break;
            case 4:
                
                double[][] traspuesta = OperacionesMatriciales.obtenerTraspuesta(matriz1);
                LeerMatrices.imprimirMatriz1(matriz1);
                LeerMatrices.imprimirMatriz(traspuesta);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
    }

