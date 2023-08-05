using System;


namespace estructuraDeDatos
{
    class Program
    {
        static void Main(string[] args)
        {
            int[,] matriz1 = {
            { 1, 2, 3 },
            { 4, 5, 6 }
        };

            int[,] matriz2 = {
            { 9, 8 },
            { 6, 5 },
            { 3, 2 }
        };

            try
            {
                int[,] matrizSuma = SumarMatricesRecursivo(matriz1, matriz2, matriz1.GetLength(0), matriz2.GetLength(1), 0, 0);

                Console.WriteLine("Matriz 1:");
                ImprimirMatriz(matriz1);

                Console.WriteLine("Matriz 2:");
                ImprimirMatriz(matriz2);

                Console.WriteLine("Matriz resultante:");
                ImprimirMatriz(matrizSuma);
            }
            catch (ArgumentException e)
            {
                Console.WriteLine(e.Message);
            }
        }

        static int[,] SumarMatricesRecursivo(int[,] matriz1, int[,] matriz2, int filas, int columnas, int fila, int columna)
        {
            if (fila < filas)
            {
                if (columna < columnas)
                {
                    int suma = 0;
                    for (int k = 0; k < matriz1.GetLength(1); k++)
                    {
                        suma += matriz1[fila, k] * matriz2[k, columna];
                    }

                    int[,] matrizSuma = SumarMatricesRecursivo(matriz1, matriz2, filas, columnas, fila, columna + 1);
                    matrizSuma[fila, columna] = suma;
                    return matrizSuma;
                }
                else
                {
                    return SumarMatricesRecursivo(matriz1, matriz2, filas, columnas, fila + 1, 0);
                }
            }
            else
            {
                return new int[filas, columnas];
            }
        }

        static void ImprimirMatriz(int[,] matriz)
        {
            int filas = matriz.GetLength(0);
            int columnas = matriz.GetLength(1);

            for (int i = 0; i < filas; i++)
            {
                for (int j = 0; j < columnas; j++)
                {
                    Console.Write(matriz[i, j] + " ");
                }
                Console.WriteLine();
            }
            Console.WriteLine();
        }
    }

}

