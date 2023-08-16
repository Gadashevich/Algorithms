package Sorting;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[]{15, 8, 7, 202, 17, 32, 49, 14, 33, 10, 5, 107};

        System.out.println("Минимальное число в массиве = " + findMinElementInArray(intArray));
        System.out.println("Максимальное число в массиве = " + findMaxElementInArray(intArray));

    }

    private static int findMinElementInArray(int[] array) {
        int minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) minValue = array[i];
        }
        return minValue;
    }

    private static int findMaxElementInArray(int[] array) {
        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) maxValue = array[i];
        }
        return maxValue;
    }


}
