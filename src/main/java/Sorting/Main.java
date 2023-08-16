package Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[]{15, 8, 7, 202, 17, 32, 49, 14, 33, 11, 5, 107};

        printArray(bubbleSort(intArray));

    }

    private static void printArray(int[] array){
        for (int i = 0; i <array.length ; i++) {
            if(i != array.length-1){
                System.out.print(array[i]+ ", ");
            } else {
                System.out.print(array[i]);
            }
        }
    }

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

}
