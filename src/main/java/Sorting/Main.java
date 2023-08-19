package Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[]{15, 8, 7, 202, 17, 32, 49, 14, 33, 11, 5, 107};

     //   System.out.print("Сортировка пузырьком = ");
     //   printArray(bubbleSort(intArray));

        System.out.println();

     //  System.out.print("Сортировка расчесткой = ");
     //   printArray(combSort(intArray));

        System.out.println();
        System.out.println("Сортировка выбором = ");
        for (int i = 0; i < args.length; i++) {
          printArray(intArray);
            int index = choiceSort(intArray,i);

            int tmp =intArray[i];
            intArray[i] = intArray[index];
            intArray[index] = tmp;
        }


    }


    // распечатывание массива
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
    }


    // Сортировка пузырьком
    private static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int element = array[j];
                    array[j] = array[i];
                    array[i] = element;
                }
            }
        }
        return array;
    }


    // Сортировка расчесткой
    private static int[] combSort(int[] array) {
        int gap = array.length;

        boolean isSorted = false;
        while (!isSorted || gap != 1) {

            if (gap > 1) {
                gap = gap * 10 / 13;
            } else {
                gap = 1;
            }

            isSorted = true;
            for (int i = gap; i < array.length; i++) {
                if (array[i - gap] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i - gap];
                    array[i - gap] = tmp;
                    isSorted = false;
                }
            }
        }
        return array;
    }


    // сортировка выбором
    private static int choiceSort(int[] array, int start) {
        int startIndex = start;
        int min = array[start];

        for (int i = start +1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                startIndex = i;
            }
        }

        return startIndex;
    }
}
