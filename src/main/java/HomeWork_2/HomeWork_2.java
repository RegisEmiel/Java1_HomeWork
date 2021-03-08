package HomeWork_2;

import java.util.Arrays;
import java.util.Random;

public class HomeWork_2 {
    public static void task1() {
        // Изменить элементы массива на обратные

        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        System.out.print("Исходный массив:\t");
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++)
            a[i] = a[i] ^ 1;

        System.out.print("Измененный массив:\t");
        System.out.println(Arrays.toString(a));
    }

    public static void task2() {
        // Заполнить массив элементами с шагом 3

        int[] a = new int[8];

        for (int i = 0; i < 8; i++)
            a[i] = i * 3;

        System.out.println(Arrays.toString(a));
    }

    public static void task3() {
        //Умножить на два элементы массива меньшие шести

        int[] a = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.print("Исходный массив:\t");
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++)
            if (a[i] < 6)
                a[i] = a[i] * 2;

        System.out.print("Измененный массив:\t");
        System.out.println(Arrays.toString(a));
    }

    public static void task4() {
        // Заполнить диагонали матрицы единицами

        final int ROW_COUNT = 5;

        int[][] a = new int[ROW_COUNT][ROW_COUNT];

        for (int i = 0; i < ROW_COUNT; i++) {
            a[i][i] = 1;
            a[i][ROW_COUNT - i - 1] = 1;
        }

        System.out.println("Массив:\t");

        for (int i = 0; i < ROW_COUNT; i++)
            System.out.println(Arrays.toString(a[i]));
    }

    public static void task5() {
        // Поиск минимального и максимального элемента

        final int ELEMENT_COUNT = 15;
        final int MAX_RANDOM_VALUE = 50;

        Random random = new Random();

        int[] a = new int[ELEMENT_COUNT];

        for (int i = 0; i < ELEMENT_COUNT; i++)
            a[i] = random.nextInt(MAX_RANDOM_VALUE);

        int minElement = a[0];
        int maxElement = a[0];

        for (int i = 1; i < ELEMENT_COUNT; i++) {
            if (minElement > a[i])
                minElement = a[i];

            if (maxElement < a[i])
                maxElement = a[i];
        }

        System.out.print("Массив:\t");
        System.out.println(Arrays.toString(a));
        System.out.printf("Минимальный элемент: %d\n", minElement);
        System.out.printf("Максимальный элемент: %d\n", maxElement);
    }

    // Функция определяет, есть ли граница в массиве с одинаковой суммой элементов левой и правой части
    public  static  boolean borderExist(int[] a) {
        int elementCount = a.length;

        int leftSum = 0;
        int rightSum;

        for (int i = 0; i < elementCount - 1; i++) {
            leftSum += a[i];

            rightSum = 0;
            for (int j = i + 1; j < elementCount; j++)
                rightSum += a[j];

            if (leftSum == rightSum)
                return true;
        }

        return false;
    }

    public static void task6() {
        int[] a1 = new int[] {6, 1, 2, 7, 2};
        System.out.println("Массив: ");
        System.out.println(Arrays.toString(a1));
        System.out.println("Граница с одинаковой суммой элементов левой и правой части существует: " + borderExist(a1));

        int[] a2 = new int[] {1, 1, 5};
        System.out.println("Массив: ");
        System.out.println(Arrays.toString(a2));
        System.out.println("Граница с одинаковой суммой элементов левой и правой части существует: " + borderExist(a2));

        int[] a3 = new int[] {1, 4, 5, 2, 2, 3, 3};
        System.out.println("Массив: ");
        System.out.println(Arrays.toString(a3));
        System.out.println("Граница с одинаковой суммой элементов левой и правой части существует: " + borderExist(a3));
    }

    public static void main(String[] args) {
        System.out.println("Java 1 Homework 2");

        //task 1
        System.out.println("Задание 1");
        task1();
        System.out.println();

        //task 2
        System.out.println("Задание 2");
        task2();
        System.out.println();

        //task 3
        System.out.println("Задание 3");
        task3();
        System.out.println();

        //task 4
        System.out.println("Задание 4");
        task4();
        System.out.println();

        //task 5
        System.out.println("Задание 5");
        task5();
        System.out.println();

        //task 6
        System.out.println("Задание 6");
        task6();
        System.out.println();
    }
}