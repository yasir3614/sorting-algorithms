
package sortingalgos;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Hp
 */
public class SortingAlgos {
public static int[] randomArrayGenerator(int size){
    int [] array = new int[size];
    for(int i=0;i<size;i++){  
        int randomNum = ThreadLocalRandom.current().nextInt(1, size + 1);
         array[i] = randomNum;
        }
    return array;
}
    public static void main(String[] args) { 
        int[] size = {10,1000,10000,100000,1000000};
//        
        
        for(int i = 0 ; i<size.length;i++){
            
        QuickSort quick = new QuickSort();
        MergeSort merge = new MergeSort();
        InsertionSort insertion = new InsertionSort();
        BubbleSort bubble = new BubbleSort();
        HeapSort heap = new HeapSort();
        
        int[] array = new int[size[i]];
        array = randomArrayGenerator(size[i]); // generate random array
        int [] temp = new int[size[i]];
        temp = Arrays.copyOf(array, size[i]); // save that array in temp
        
        
        //////////////////SORTING/////////////////////////
        
//        /////////////////QUICK SORT////////////////////////
        long startTime = System.nanoTime();
        quick.quickSort(array, 0, size[i]-1);
        long endTime   = System.nanoTime();
        long totalTimeQuick = endTime - startTime;
//
//        //////////////////MERGE SORT/////////////////////
        
        long startTime2 = System.nanoTime();
        merge.mergeSort(array, size[i]);
        long endTime2   = System.nanoTime();
        long totalTimeMerge = endTime2 - startTime2;
        
        ///////////////INSERTION SORT///////////////////////
        long startTime3 = System.nanoTime();
        insertion.sort(array, size[i]);
        long endTime3   = System.nanoTime();
        long totalTimeInsertion = endTime3 - startTime3;
         
         ///////////////Bubble SORT///////////////////////
        long startTime4 = System.nanoTime();
        bubble.sort(array, size[i]);
        long endTime4   = System.nanoTime();
        long totalTimeBubble = endTime4 - startTime4;
        
        
        ///////////////Heap SORT///////////////////////
        long startTime5 = System.nanoTime();
        heap.sort(array, size[i]);
        long endTime5 = System.nanoTime();
        long totalTimeHeap = endTime5 - startTime5;
        
        /////////////////RESULTS/////////////////////
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
        System.out.println("Data Size: " + size[i]);
        System.out.println("---Time Durations:---"); 
        System.out.println("Merge Sort: " + totalTimeInsertion+" ns");
        System.out.println("Quick Sort: " + totalTimeQuick+" ns");
        System.out.println("Merge Sort: " + totalTimeMerge+" ns");
        System.out.println("Bubble Sort: " + totalTimeBubble+" ns");
        System.out.println("Heap Sort: "+totalTimeHeap+" ns");
        //////////////////////////////////////
        
    }
    }
}
