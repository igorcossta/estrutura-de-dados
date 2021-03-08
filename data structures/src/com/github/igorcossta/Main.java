package com.github.igorcossta;

import com.github.igorcossta.array.Vetor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // teste de adição de elemento
        Vetor<Integer> array0 = new Vetor<>(2);

        array0.add(1);
        array0.add(2);

        array0.add(3); // aumenta a capacidade do vetor
        System.out.println(array0.size() + " " + array0.length()); //   elementos = 3           tamanho vetor = 4

        System.out.println("");

        // teste de remoção de elemento
        Vetor<String> array = new Vetor<>(10);

        array.add("string 1");
        array.add("string 2");
        array.add("string 3");

        System.out.println("Pré remoção -> Elementos = " + array.size() + " Tamanho do vetor = " + array.length());
        System.out.print(array.valueOf(0) + ", " + array.valueOf(1) + ", " + array.valueOf(2) + "\n");

        array.remove(0);

        System.out.println("Pós remoção -> Elementos = " + array.size() + " Tamanho do vetor = " + array.length());
        System.out.print(array.valueOf(0) + ", " + array.valueOf(1) + ", " + array.valueOf(2) + "\n");

        System.out.println("");

        // teste de retornar índice ao buscar por elemento
        System.out.println("IndexOf Test -> " + array.indexOf("string 2"));

        // teste de retornar valor do índice
        System.out.println("ValueOf Test -> " + array.valueOf(0));

        // teste verificar se está vazia
        System.out.println("IsEmpty Test -> " + array.isEmpty());

        // teste limpar vetor
        array.clear();
        System.out.println("Clear Test -> " + array.isEmpty());
    }
}
