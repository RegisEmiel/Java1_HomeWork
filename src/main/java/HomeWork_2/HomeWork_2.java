package HomeWork_2;

import java.util.Arrays;

public class HomeWork_2 {
    public static void task1() {
        // Revers items of array
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        System.out.print("Source array:\t");
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++)
            a[i] = a[i] ^ 1;

        System.out.print("Result array:\t");
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        System.out.println("Java 1 Homework 2");

        //task 1
        System.out.println("Task 1");
        task1();
        System.out.println();

    }
}
