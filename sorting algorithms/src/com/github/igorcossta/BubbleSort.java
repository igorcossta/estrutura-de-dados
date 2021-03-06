package com.github.igorcossta;

public class BubbleSort {

    public static int[] sort(int[] array) {
        // 10, 8, 7, 6, 4, 2, 0, 1, 5, 3, 9
        for (int i = 0; i < array.length; i++) {

            for(int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int auxiliar = array[j];
                    array[j] = array[i];
                    array[i] = auxiliar;
                }
            }
        }
        return array;
    }
}
