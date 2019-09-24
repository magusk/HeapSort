package com.heap.sort;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        Random random = new Random();

        for (int i = 0; i < numeros.length; ++i) {
            numeros[i] = Math.abs(random.nextInt() % 100);
        }

        Sorter sorter = new Sorter();
        sorter.heapSort(numeros);

        for (int i = 0; i < numeros.length; ++i) {
            System.out.println(numeros[i]);
        }

    }
}
