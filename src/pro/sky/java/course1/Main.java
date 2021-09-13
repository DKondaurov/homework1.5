package pro.sky.java.course1;

import java.util.Arrays;

public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        taskFromTheFirstToTheThird();
        // Задание 4
        task4();
        // Задание 5
        task5();
        // Задание 6
        task6();
        // Задание 7
        task7();
        // Задание 8
        task8();
        // Задание 9
        task9();
    }

    private static void task9() {
        int[] arrayToSearch = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < arrayToSearch.length; i++) {
            for (int i1 = i; i1 < arrayToSearch.length; i1++) {
                if (arrayToSearch[i] + arrayToSearch[i1] == -2) {
                    System.out.println("Сумма чилсел " + arrayToSearch[i] + " и " + arrayToSearch[i1] + " равно -2");
                }
            }
        }
    }

    private static void task8() {
        int[] arrayToSearch = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        boolean a = true;
        for (int i = 0; i < arrayToSearch.length && a; i++) {
            for (int i1 = i; i1 < arrayToSearch.length; i1++) {
                if (arrayToSearch[i] + arrayToSearch[i1] == -2) {
                    System.out.println("Сумма чилсел " + arrayToSearch[i] + " и " + arrayToSearch[i1] + " равно -2");
                    a = false;
                }
            }
        }
    }

    private static void task7() {
        int[] array = {5, 8, 2, 3, 9};
        System.out.println(Arrays.toString(array));
        for (int start = 0, finish = array.length - 1; start < finish; start++, finish--) {
            int variable = array[start];
            array[start] = array[finish];
            array[finish] = variable;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void task6() {
        int [] array = {5, 4, 3, 2, 1};
        int length = array.length - 1;
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[length - i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));
    }

    private static void task5() {
        int[][] matrix = new int[3][3];
        int arrayLong = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][arrayLong - i] = 1;
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    private static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length; i > 0; i--) {
            System.out.print(reverseFullName[i - 1]);
        }
        System.out.println();
    }

    private static void taskFromTheFirstToTheThird() {
        int[] arr = generateRandomArray();
        // Задание 1
        int amountPayments = 0;
        for (int i = 0; i < arr.length; i++) {
            amountPayments += arr[i];
        }
        System.out.println(amountPayments);
        // Задание 2
        int maximumPayout = 0;
        int minimumPayout = 200_000;
        for (int i = 0; i < arr.length; i++) {
            if (minimumPayout > arr[i]) {
                minimumPayout = arr[i];
            }
            if (maximumPayout < arr[i]) {
                maximumPayout = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minimumPayout + " рублей. Максимальная сумма" +
                " трат за день составила " + maximumPayout + " рублей.");
        /* Задание 3
        Если в первом задании я считаю общую сумму, то можно использовать значение из первого задания и разделить длину.*/
        float averageExpenditure = 0f;
        averageExpenditure = amountPayments / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpenditure + " рублей.");
    }
}