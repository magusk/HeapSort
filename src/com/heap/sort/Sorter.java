package com.heap.sort;

class Sorter {

    void heapSort(int[] numeros) {
        for (int i = numeros.length / 2; i >= 0; --i) {
            heapifyDown(numeros, i, numeros.length);
        }

        for (int i = numeros.length - 1; i > 0; --i) {
            int tmp = numeros[0];
            numeros[0] = numeros[i];
            numeros[i] = tmp;
            heapifyDown(numeros, 0, i);
        }
    }

    private void heapifyDown(int[] numeros, int index, int length) {
        int leftChild = index * 2 + 1;
        int rightChild = index * 2 + 2;

        int maxIndex = index;

        if (leftChild < length && numeros[leftChild] > numeros[index]) {
            maxIndex = leftChild;
        }

        if (rightChild < length && numeros[rightChild] > numeros[maxIndex]) {
            maxIndex = rightChild;
        }

        if (maxIndex != index) {
            int tmp = numeros[maxIndex];
            numeros[maxIndex] = numeros[index];
            numeros[index] = tmp;
            heapifyDown(numeros, maxIndex, length);
        }
    }
}
