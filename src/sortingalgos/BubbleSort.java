/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgos;

/**
 *
 * @author Hp
 */
public class BubbleSort {
    public void sort(int[] arr,int size){
        int array[] = arr;  
        int temp;  
         for(int i=0; i < size; i++){  
                 for(int j=1; j < (size-i); j++){  
                          if(array[j-1] > array[j]){  
                                 //swap elements  
                                 temp = array[j-1];  
                                 array[j-1] = array[j];  
                                 array[j] = temp;  
                         }  
                          
                 }  
         } 
    }
}
