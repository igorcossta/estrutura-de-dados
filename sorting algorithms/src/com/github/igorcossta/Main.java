package com.github.igorcossta;

public class Main {
    private static int[] numbers = {10, 8, 7, 6, 4, 2, 0, 1, 5, 3, 9};

    public static void main(String[] args) {
        print(numbers);
        numbers = BubbleSort.sort(numbers);
        print(numbers);
    }

    public static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
