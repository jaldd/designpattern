package org.shaotang.design.pattern.strategy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorter<T> {

    public void sort(T[] arr, Comparator<T> comparator) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
//                min = arr[j].compareTo(arr[min]) < 0 ? j : min;
                min = comparator.compare(arr[min], arr[j]) < 0 ? j : min;
            }
            if (i != min) {
                swap(arr, i, min);
            }
        }
    }

    public void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Cat compa = new Cat(1, 2);
        Sorter<Cat> sort = new Sorter<Cat>();
        sort.sort(new Cat[]{new Cat(1, 2)}, compa);
        sort.sort(new Cat[]{new Cat(1, 2)}, Comparator.comparingInt(Cat::getWeight));
    }

}
