package ru.geekbrains.HW6.part3;

import java.util.Arrays;

public class CompositionArray {
    public static void main(String[] args) {
        int[] array = {1, 0, 1, 1};
        int value1 = 1;
        int value2 = 4;
        System.out.println("Array: " + Arrays.toString(array));
        checkArray(array, value1, value2);
    }

    public static void checkArray(int[] array, int value1, int value2) {
        boolean test1 = false;
        boolean test2 = false;
        for (int element : array) {
            if (element == value1)
                test1 = true;
            else if(element == value1)
                test2 = true;
        }
        System.out.println("Is " + value1 + " and " + value2 + " present in the array: " + (test1 && test2));
    }
}
