package Lesson2;

public class Lesson2 {

    private static boolean checkArraySize(String[][] array) {
        if (array.length != 4) {
            throw new MyArraySizeException();
        }

        for (String[] row : array) {
            if (row.length != 4) {
                throw new MyArraySizeException();
            }
        }
        return true;
    }

    private static void sumArrayValues(String[][] array){
        int arraySum = 0;
        if (checkArraySize(array)) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    try {
                        arraySum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
        }
        System.out.println(arraySum);
    }

    public static void main(String[] args) {
        String[][] array1 = new String[4][4];
        array1[0][0] = "1"; array1[0][1] = "2"; array1[0][2] = "3"; array1[0][3] = "4";
        array1[1][0] = "5"; array1[1][1] = "6"; array1[1][2] = "7"; array1[1][3] = "8";
        array1[2][0] = "1"; array1[2][1] = "2"; array1[2][2] = "3"; array1[2][3] = "4";
        array1[3][0] = "5"; array1[3][1] = "6"; array1[3][2] = "7"; array1[3][3] = "8";

        String[][] array2 =  {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"}
        };

       sumArrayValues(array1);

    }

}
/*
3. В методе main() вызвать полученный метод,
обработать возможные исключения MySizeArrayException и MyArrayDataException, и вывести результат расчета
 */

/*-------------------------
    СДЕЛАЛ
    1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
        при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
        Если в каком-то элементе массива преобразование не удалось
        (например, в ячейке лежит символ или текст вместо числа),
        должно быть брошено исключение MyArrayDataException,
        с детализацией в какой именно ячейке лежат неверные данные.

 */