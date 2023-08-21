
// ----------------------------------------------------------------
// Para poder ejecutar los ejercicios, solo hay que borrar /* */ o //.
// Los ejercicios estan debajo de los titulos y estan enumerados
// ----------------------------------------------------------------

public class Main {
    public static void main(String[] args){
        // ----------------------------------------------------------------
        // 1) Pruebas para el multiplo
        // ----------------------------------------------------------------
        // System.out.println("La cantidad de dígitos que son multiplos de 2 y 4 son: " + Digit(44,0));

        // ----------------------------------------------------------------
        // 2) Pruebas para el invertir
        // ----------------------------------------------------------------
        //System.out.println(Invert("Palabra-a-invertir"));

        // ----------------------------------------------------------------
        // 3) Pruebas para la sumatoria
        // ----------------------------------------------------------------
        /*int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int [][] matrix2 = {
                {1,2,3,4},
                {4,3,2,1},
                {5,6,7,8},
                {9,8,7,6}
        };
        System.out.println(SumMatrix(matrix2, 0, 0, 0));*/

        // ----------------------------------------------------------------
        // 4) Pruebas para encontrar
        // ----------------------------------------------------------------
        /*String [] pruebaString = {"a", "b", "c", "d", "e", "f"};
        int [] pruebaNumber = {1, 2, 3};

        System.out.println("El elemento string fue encontrado? " + elemtentString(pruebaString,"a",0));
        System.out.println("El elemento number fue encontrado? " + elementNumber(pruebaNumber,0, 0));*/

        // ----------------------------------------------------------------
        // 5) Pruebas para alfanumerico
        // ----------------------------------------------------------------
        /*System.out.println(extractNumber("C1a2r3l4o5s6",0,""));
        System.out.println(extractNumber("M0a9r8i7o6",0,""));
        System.out.println(extractNumber("L9o9p8e8z7",0,""));
        System.out.println(extractNumber("P1e2s3t1a2n3a4",0,""));*/
    }

    // ----------------------------------------------------------------
    // Aquí estan todos los ejercicios del taller.

    /* Cree una función recursiva que reciba un entero y retorne cuantos digitos de este número
        son multiplos de 2 y de 4 e ignorar el 0.*/
    public static int Digit(int number, int count){
        if(number == 0){
            return count;
        }
        if(number % 2 == 0 && number % 4 == 0){
            count++;
        }
        return Digit(number / 10, count);
    }

    /* Cree una función no recursiva que invierta solo la mitad de un String (la segunda mitad). */
    public static String Invert(String text){
        int length = text.length();
        int middle = length / 2;

        String firstHalf = text.substring(0, middle);
        String secondHalf = text.substring(middle);

        StringBuilder reversedSecondHalf = new StringBuilder(secondHalf);
        reversedSecondHalf.reverse();

        return firstHalf + reversedSecondHalf.toString();
    }

    /* Cree una función recursiva que calcule las sumatoria de todos los números impares de una matrix cuadrada*/
    public static int SumMatrix(int[][] matrix, int i, int j, int sum) {
        if (i == matrix.length) {
            return sum;
        }
        if (matrix[i][j] % 2 != 0) {
            sum += matrix[i][j];
        }
        if (j < matrix[i].length - 1) {
            return SumMatrix(matrix, i, j + 1, sum);
        } else {
            return SumMatrix(matrix, i + 1, 0, sum);
        }
    }

    /* Cree una funcion recursiva que reciba una lista, un elemento y un indice y retorne si el
    elemnento esta en la lista y en la posición dada*/
    public static Boolean elemtentString(String [] list, String element, int position) {
        if (position < 0 || position >= list.length){
            return false;
        }
        if(list[position] == element){
            return true;
        }
        if (list[position]!= element){
            return false;
        }
        return elemtentString(list, element, position + 1);
    }

    public static Boolean elementNumber(int [] list, int element, int position) {
        if (position < 0 || position >= list.length){
            return false;
        }
        if(list[position] == element){
            return true;
        }
        if (list[position] != element){
            return false;
        }
        return elementNumber(list, element, position + 1);
    }

    /* Cree una función recursiva que reciva un String alfanumerico (letra y número) y que
    * extraiga los dígitos del string y retorne el número formado por todos los dígitos */

    public static String extractNumber(String stringNumber, int index, String concat) {
        if (index == stringNumber.length()) {
            return concat;
        }
        if (Character.isDigit(stringNumber.charAt(index))) {
            concat += stringNumber.charAt(index) - '0';
        }
        return extractNumber(stringNumber, index + 1, concat);
    }
}