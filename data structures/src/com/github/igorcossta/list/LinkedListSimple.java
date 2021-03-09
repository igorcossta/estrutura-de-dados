package com.github.igorcossta.list;

public class LinkedListSimple<T> {

    private Node<T> head;
    private int size;

    public LinkedListSimple() {
        this.head = new Node<>();
        this.size = 0;
    }

    public void add(T data) {
        Node<T> node = new Node<>(data, null);

        if (head.data == null) head.data = data;
        else if (head.next == null) head.next = node;
        else {
            Node<T> miniNode = head;
            while (miniNode.next != null) {
                miniNode = miniNode.next;
            }
            miniNode.next = node;
        }
        size++;
    }

    public void remove(T object) {
        if (object == null) {
            System.out.println("do something here");

        } else {
            Node<T> temp = head, prev = null;

            while (!object.equals(temp.data)) {
                prev = temp;
                temp = temp.next;
            }
            unlink(temp, prev);
        }
    }

    private T unlink(Node<T> node, Node<T> prev) {
        final T item = node.data;

        if (prev == null) {
            head = node.next;
        } else {
            prev.next = node.next;
            node.next = null;
        }

        node.data = null;
        size--;
        return item;
    }

    public T peek() {
        final Node<T> f = head;
        return (f == null) ? null : f.data;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        Node<T> miniNode = head;
        Node<T> next;

        while (miniNode != null) {
            next = miniNode.next;
            miniNode.next = null;
            miniNode.data = null;
            miniNode = next;
        }
        size = 0;
        head = null;
    }

    public void print() {
        Node<T> miniNode = head;
        while (miniNode != null) {
            System.out.println(miniNode.data);
            miniNode = miniNode.next;
        }
    }

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node() {
        }

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

}
