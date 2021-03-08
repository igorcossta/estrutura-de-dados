package com.github.igorcossta.array;

public class Vetor<T> {
    private T array[];
    private int size;

    public Vetor(int capacity) {
        if (capacity != 0) {
            this.array = (T[]) new Object[capacity];
            this.size = 0;
        } else {
            throw new ArrayStoreException("The array size must be greater than zero.");
        }
    }

    public boolean add(T object) {
        increase();
        if (size < array.length) {
            this.array[size] = object;
            this.size++;
            return true;
        }
        return false;
    }

        private void increase() {
        if (this.size == this.array.length) {
            T[] newArray = (T[]) new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            this.array = newArray;
        }
    }

    public int indexOf(T object) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }

    public T valueOf(int index) {
        return array[index];
    }

    public void remove(int index) {

        if (isEmpty()) throw new RuntimeException("there is nothing to remove");

        if (index > array.length || index < 0) throw new ArrayIndexOutOfBoundsException();

        for (int i = index; i < array.length - 1; i++) {
            this.array[i] = array[i + 1];
        }
        size--;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        isEmpty();
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        size = 0;
    }

    /***
     * method to return the size of the array
     * @return array size
     */

    public int length() {
        return array.length;
    }

    /***
     * method to return the number of elements
     * @return number of elements
     */

    public int size() {
        return size;
    }
}
