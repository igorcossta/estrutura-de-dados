package com.github.igorcossta;

public class SelectionSort {

    public static int[] sort(int[] array) {
        // 10, 8, 7, 6, 4, 2, 0, 1, 5, 3, 9
        for (int indice = 0; indice < array.length; indice++) {

            int indiceMenor = indice;

            for (int indiceSeguinte = indice + 1; indiceSeguinte < array.length; indiceSeguinte++) {
                if (array[indiceSeguinte] < array[indiceMenor]) {
                    indiceMenor = indiceSeguinte;

                }
            }
            int auxiliar = array[indiceMenor];
            array[indiceMenor] = array[indice];
            array[indice] = auxiliar;
        }

        return array;
    }
}
