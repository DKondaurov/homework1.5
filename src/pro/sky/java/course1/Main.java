package pro.sky.java.course1;

import java.util.Arrays;
import java.util.Objects;

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
        // Задание 1
        task1();
        // Задание 2
        task2();
        // Задание 3
        task3();
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

    private static void task8() {
        int [] arrayToSearch = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
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

    private static void task9() {
        int [] arrayToSearch = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < arrayToSearch.length; i++) {
            for (int i1 = i; i1 < arrayToSearch.length; i1++) {
                if (arrayToSearch[i] + arrayToSearch[i1] == -2) {
                    System.out.println("Сумма чилсел " + arrayToSearch[i] + " и " + arrayToSearch[i1] + " равно -2");
                }
            }
        }
    }

    private static void task7() {
        int [] array = {5, 8, 2, 3, 9,};
        int length = array.length;
        System.out.println(Arrays.toString(array));
        System.out.print("[");
        for (int i = 1; i < array.length; i++) {
            System.out.print(array[length-1] + ", ");
            length--;
        }
        System.out.print(array[length-1] + "]");
        System.out.println();
    }

    private static void task6() {
        int [] array = {5, 4, 3, 2, 1};
        int length = array.length;
        int[] newArray = new int[length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[length - 1];
            length--;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));
    }

    private static void task5() {
        int[][] matrix = new int[3][3];
        int arrayLength = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][arrayLength] = 1;
            arrayLength--;
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    private static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int arrayLength = reverseFullName.length;
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[arrayLength-1]);
            arrayLength--;
        }
        System.out.println();
    }

    private static void task3() {
        float averageExpenditure = 0f;
        int i = 0;
        for (; i < generateRandomArray().length; i++) {
            averageExpenditure += generateRandomArray()[i];
        }
        averageExpenditure /= i;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpenditure + " рублей.");
    }

    private static void task2() {
        int maximumPayout = 0;
        int minimumPayout = 200_000;
        for (int i = 0; i < generateRandomArray().length; i++) {
            if (minimumPayout > generateRandomArray()[i]) {
                minimumPayout = generateRandomArray()[i];
            }
            for (int i1 = 0; i1 < generateRandomArray().length; i1++) {
                if (maximumPayout < generateRandomArray()[i]) {
                    maximumPayout = generateRandomArray()[i];
                }
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minimumPayout + " рублей. Максимальная сумма" +
                " трат за день составила " + maximumPayout + " рублей.");
    }

    private static void task1() {
        int amountPayments = 0;
        for (int i = 0; i < generateRandomArray().length; i++) {
            amountPayments = generateRandomArray()[i] + amountPayments;
        }
        System.out.println(amountPayments);
    }
}