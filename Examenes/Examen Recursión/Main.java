import java.util.Arrays;

public class Main {

    // Nombres de los integrantes
    // Carlos Mario López Pestana
    // Daniel Morales Toro
    // Valentiana Morales Restrepo

    public static void main(String[] args) {
        // Primero: Dado un número n, necesitamos imprimir todos los números
        //binarios de n dígitos con la misma suma en las mitades izquierda y
        //derecha. Si n es impar, entonces el elemento medio puede ser 0 o 1.
        // Casos
        System.out.println("");
        System.out.println("Primer ejercicio");
        // #1
        int m = 4;
        generateBalancedBinaries(m);
        System.out.println("");
        System.out.println("Siguiente caso");
        // #2
        int n = 5;
        generateBalancedBinaries(n);

        // Segundo: Dado un arreglo de tamaño n, genere e imprima todas las
        //combinaciones posibles de r elementos en el arreglo. Por ejemplo, si
        //la matriz de entrada es {1, 2, 3, 4} y r es 2, entonces la salida debe
        //ser {1, 2}, {1, 3}, {1, 4}, {2, 3}, { 2, 4} y {3, 4}.
        // Caso
        System.out.println("");
        System.out.println("");
        System.out.println("Segundo ejercicio");
        // #1
        int[] arr = {1, 2, 3, 4};
        int r = 2;
        generateCombinations(arr, r);

        // Tercero: Dada una matriz de tamaño N x M, cree un algoritmo recursivo para
        //es recorrer esta matriz.
        //Caso
        System.out.println("");
        System.out.println("");
        System.out.println("Tercero ejercicio");
        // #1
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        traverseMatrix(matrix);
    }

    // Primero
    public static void generateBalancedBinaries(int n) {
        generateBalancedBinariesUtil(new int[n], n, 0);
    }
    private static void generateBalancedBinariesUtil(int[] binaryNumber, int n, int index) {
        if (index == n) {
            if (n % 2 == 0) {
                int[] leftHalf = Arrays.copyOfRange(binaryNumber, 0, n / 2);
                int[] rightHalf = Arrays.copyOfRange(binaryNumber, n / 2, n);

                if (sumArray(leftHalf, 0) == sumArray(rightHalf, 0)) {
                    System.out.print(binaryNumberToString(binaryNumber, n) + " - ");
                }
                return;
            }
            if (n % 2 == 1) {
                int[] leftHalf = Arrays.copyOfRange(binaryNumber, 0, n / 2);
                int[] rightHalf = Arrays.copyOfRange(binaryNumber, n / 2 + 1, n);

                if (sumArray(leftHalf, 0) == sumArray(rightHalf, 0)) {
                    System.out.print(binaryNumberToString(binaryNumber, n) + " - ");
                }
                return;
            }
        }

        binaryNumber[index] = 0;
        generateBalancedBinariesUtil(binaryNumber, n, index + 1);

        binaryNumber[index] = 1;
        generateBalancedBinariesUtil(binaryNumber, n, index + 1);
    }
    private static int sumArray(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + sumArray(arr, index + 1);
    }
    private static String binaryNumberToString(int[] binaryNumber, int n) {
        return binaryNumberToStringUtil(binaryNumber, n, 0, "");
    }
    private static String binaryNumberToStringUtil(int[] binaryNumber, int n, int index, String result) {
        if (index == n) {
            return result;
        }
        return binaryNumberToStringUtil(binaryNumber, n, index + 1, result + binaryNumber[index]);
    }

    //Segundo
    public static void generateCombinations(int[] arr, int r) {
        int[] combination = new int[r];
        generateCombinationsUtil(arr, 0, combination, 0, r);
    }

    public static void generateCombinationsUtil(int[] arr, int start, int[] combination, int index, int r) {
        if (index == r) {
            System.out.print(Arrays.toString(combination) + " - ");
            return;
        }

        if (start >= arr.length)
            return;

        combination[index] = arr[start];
        generateCombinationsUtil(arr, start + 1, combination, index + 1, r);
        generateCombinationsUtil(arr, start + 1, combination, index, r);
    }

    //Tercero
    public static void traverseMatrix(int[][] matrix) {
        traverseMatrixRecursive(matrix, 0, 0);
    }

    public static void traverseMatrixRecursive(int[][] matrix, int row, int col) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        // Caso base: hemos llegado al final de la matriz
        if (row == numRows) {
            return;
        }

        // Imprimir el elemento actual
        System.out.print((matrix[row][col] + " ") + " - ");

        // Mover a la siguiente columna o siguiente fila si llegamos al final de la fila actual
        int nextRow = row;
        int nextCol = col + 1;
        if (nextCol == numCols) {
            nextRow++;
            nextCol = 0;
        }

        // Llamada recursiva para el siguiente elemento
        traverseMatrixRecursive(matrix, nextRow, nextCol);
    }
}