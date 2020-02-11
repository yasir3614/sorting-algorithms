package sortingalgos;

import java.util.Arrays;

public class QuickSort {
    public int [] finalArray = new int[10];
    
    public void swap(int i, int j, int[] arr) {
    int t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;

}
    
    public int partition(int[] array,int start,int end){
        int temp, temp2;//for swapping
        int pivot = array[end];
        int partitionIndex = start;
        for(int i=start;i<end ;i++){
            //System.out.println("PI Before: "+partitionIndex);
            if(array[i]<=pivot){
                temp=array[i];
                array[i]=array[partitionIndex];
                array[partitionIndex]=temp;
                partitionIndex++;
//                 System.out.println("PI After: "+partitionIndex);
            }
           // System.out.println(Arrays.toString(array));
                        

        }
        //for greater than pivot
               temp2=array[partitionIndex];
               array[partitionIndex]=array[end];
               array[end]=temp2;
              
               return partitionIndex;
    }  
    
    public void quickSort(int[] array,int start,int end){
        int partitionIndex;
        if(start<end){
           partitionIndex = partition(array,start,end);
           quickSort(array,start,partitionIndex-1);
           quickSort(array,partitionIndex+1,end);  
        } 
    }
 }
