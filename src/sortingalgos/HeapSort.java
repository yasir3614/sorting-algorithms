/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgos;
import java.util.Arrays;

public class HeapSort {
    int [] array;
    public void sort(int arr[],int size) {
        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(arr, size, i);
        for (int i=size-1; i>=0; i--) {
            int x = arr[0];
            arr[0] = arr[i];
            arr[i] = x;
            heapify(arr, i, 0);
        }
        array = arr;
    }

    void heapify(int arr[], int heapSize, int i) {
        int largest = i; // Initialize largest as root
        int leftChildIdx  = 2*i + 1; // left = 2*i + 1
        int rightChildIdx  = 2*i + 2; // right = 2*i + 2

        if (leftChildIdx  < heapSize && arr[leftChildIdx ] > arr[largest])
            largest = leftChildIdx ;
        if (rightChildIdx  < heapSize && arr[rightChildIdx ] > arr[largest])
            largest = rightChildIdx ;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, heapSize, largest);
        }
    }
    void printarray(){
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
    
}
