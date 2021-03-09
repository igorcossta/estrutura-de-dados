package com.github.igorcossta;

import com.github.igorcossta.list.LinkedListSimple;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> java = new LinkedList<>();
        LinkedListSimple<String> lista = new LinkedListSimple<>();

        String first = "first";
        String second = "second";
        String third = "third";

        lista.add(first);
        lista.add(second);
        lista.add(third);

        System.out.println("Lista Antes de Remover: \nQuantidade: " + lista.size());
        lista.print();

        lista.remove(first);
        System.out.println("Lista Depois de Remover: \nQuantidade: " + lista.size());
        lista.print();

        System.out.println("===");
        lista.clear();
        System.out.println(lista.size());
        lista.print();

        lista.clear();
    }
}
