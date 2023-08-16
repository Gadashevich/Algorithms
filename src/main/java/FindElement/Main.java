package FindElement;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[]{15, 8, 7, 202, 17, 32, 49, 14, 33, 11, 5, 107};

        System.out.println("Минимальное число в массиве = " + findMinElementInArray(intArray));
        System.out.println("Максимальное число в массиве = " + findMaxElementInArray(intArray));
        System.out.println("Сумма всех чисел в массиве = " + findSumInArray(intArray));
        System.out.println("Среднее значение суммы всех чисел в массиве = " + findAvgSumInArray(intArray) +" (округлено до целого числа в меньшую сторону)");

    }

    // Алгоритм для нахождения минимального значения в числовом массиве
    private static int findMinElementInArray(int[] array) {
        int minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) minValue = array[i];
        }
        return minValue;
    }


    // Алгоритм для нахождения максимального значения в числовом массиве
    private static int findMaxElementInArray(int[] array) {
        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) maxValue = array[i];
        }
        return maxValue;
    }


    //Алгоритм для нахождения суммы всех элементов в массиве
    private static int findSumInArray(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }


    //Алгоритм для нахождения среднего значения от суммы всех элементов в массиве
    private static int findAvgSumInArray(int[] array) {
        int avg = 0;

        for (int i = 0; i <array.length ; i++) {
            avg +=array[i];
        }
        return avg / array.length;
    }
}
