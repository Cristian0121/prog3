
package lab2;

public class OperacionesMatriciales {

   
    public static double[][] sumarMatrices(double[][] matriz1, double[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        double[][] resultado = new double[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }

   
    public static double[][] multiplicarMatrices(double[][] matriz1, double[][] matriz2) {
        int filas1 = matriz1.length;
        int columnas1 = matriz1[0].length;
        int filas2 = matriz2.length;
        int columnas2 = matriz2[0].length;
        double[][] resultado = new double[filas1][columnas2];

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                for (int k = 0; k < columnas1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return resultado;
    }

    
    public static double[][] multiplicarEscalarMatriz(double escalar, double[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        double[][] resultado = new double[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = escalar * matriz[i][j];
            }
        }

        return resultado;
    }

  
    public static double[][] obtenerTraspuesta(double[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        double[][] traspuesta = new double[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }

        return traspuesta;
    }
}

