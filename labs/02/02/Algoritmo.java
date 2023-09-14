package parte2;
public class Algoritmo {
    public static void main(String[] args) {
        int[] arreglo = {100, 500, 1000, 5000, 10000};

        System.out.println("Tamaño\t Burbuja\t Inserción\t Selección\t Mergesort");
        for (int tamaño : arreglo) {
            double[] randomArreglo = Operaciones.generateRandomArray(tamaño);

            long bubbleTiempo1 = System.nanoTime();
            Operaciones.bubbleSort(randomArreglo);
            long bubbleTiempo2 = System.nanoTime();

            double[] insertionArreglo = Operaciones.generateRandomArray(tamaño);
            long insertionTiempo1 = System.nanoTime();
            Operaciones.insertionSort(insertionArreglo);
            long insertionTiempo2 = System.nanoTime();

            double[] selectionArreglo = Operaciones.generateRandomArray(tamaño);
            long selectionTiempo1 = System.nanoTime();
            Operaciones.selectionSort(selectionArreglo);
            long selectionTiempo2 = System.nanoTime();

            double[] mergeArreglo = Operaciones.generateRandomArray(tamaño);
            long mergeTiempo1 = System.nanoTime();
            Operaciones.mergeSort(mergeArreglo);
            long mergeTiempo2 = System.nanoTime();

            System.out.println(tamaño + "\t" +
                    (bubbleTiempo2 - bubbleTiempo1) + " ns\t" +
                    (insertionTiempo2 - insertionTiempo1) + " ns\t" +
                    (selectionTiempo2 - selectionTiempo1) + " ns\t" +
                    (mergeTiempo2 - mergeTiempo1) + " ns");
        }
    }
}



