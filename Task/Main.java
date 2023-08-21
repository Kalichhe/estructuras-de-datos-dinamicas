public class Main {
    public static void main(String[] args){
        // Pruebas para el multiplo
        // System.out.println("La cantidad de dígitos que son multiplos de 2 y 4 son: " + Digit(44,0));

        // Pruebas para el invertir

        /*System.out.println(Invert("Hola"));
        System.out.println(Invert("ay muchachos!"));
        System.out.println(Invert("Carlos"));
        System.out.println(Invert("Estructuras"));
        System.out.println(Invert(""));*/

        // Pruebas para la sumatoria
        /*int [][] matrix = {
                {1,2,3},{4,5,6},{7,8,9}
        };
        int [][] matrix2 = {
                {1,2,3,4},{1,2,3,4},{5,6,7,8},{1,1,1,1}
        };
        System.out.println(SumMatrix(matrix2, 0, 0, 0));*/

        // Pruebas para encontrar
        /*String [] prueba = {"a", "b", "c", "d", "e", "f"};
        int [] prueba2 = {1, 2, 3};

        System.out.println("El elemento string fue encontrado? " + elemtentString(prueba,"a",0));
        System.out.println("El elemento number fue encontrado? " + elementNumber(prueba2,0, 0));*/

        // Pruebas para alfanumerico

        /*System.out.println(extractNumber("a1b2c3",0,""));
        System.out.println(extractNumber("0j0j0j0j",0,""));
        System.out.println(extractNumber("1111",0,""));
        System.out.println(extractNumber("k6k79090",0,""));*/


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