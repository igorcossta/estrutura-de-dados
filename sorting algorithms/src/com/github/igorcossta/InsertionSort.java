package com.github.igorcossta;

public class InsertionSort {

    public static int[] sort(int[] array) {

        for (int indice = 1; indice < array.length; indice++) {

            int auxiliar = array[indice];
            int chave = indice;

            while ((chave > 0) && array[chave - 1] > auxiliar) {
                array[chave] = array[chave - 1];
                chave--;
            }
            array[chave] = auxiliar;
        }
        return array;
    }
}
