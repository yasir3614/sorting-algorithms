
package sortingalgos;

import java.util.Arrays;

public class MergeSort {
    public void mergeArrays(int[] right,int[] left,int[] orignal,int number_right,int number_left){

        int i,j,k;
        i=j=k=0;

        while(i<number_left && j<number_right){
            if(left[i]<=right[j]){
                orignal[k] = left[i];
                i++;
            }else
            {
                orignal[k]=right[j];
                j++;
            }
            k++;
        }
        
        //filling leftovers
        while(i<number_left){
            orignal[k] = left[i];
            i++;k++;
        }
        
        while(j<number_right){
            orignal[k]=right[j];
            j++;
            k++;
            
        }

    }
    public void mergeSort(int[] passedArray,int lengthOfPassedArray){
        int n = lengthOfPassedArray-1;
        //array sorted if less than 2 elements
//        System.out.println("n: " + n);
        if(n<2){
//            System.out.println("Array already sorted/Only One Element n<2");
//            System.out.println(Arrays.toString(passedArray));
            return;
        }
        
        int middle = n/2;
        
//        System.out.println("middle: "+middle);
        
        int[] leftArray = new int[middle]; //System.out.println("Left Array Length: " +leftArray.length);
        int[] rightArray= new int[n-middle];//System.out.println("Right array length: " +rightArray.length);
              
        
        for(int i=0;i<middle;i++){
            leftArray[i] = passedArray[i];
        }
        
         for(int i=middle;i<n;i++){
            rightArray[i-middle] = passedArray[i];
        }
        
        mergeSort(leftArray,middle);
        mergeSort(rightArray,middle);
        mergeArrays(rightArray,leftArray,passedArray,rightArray.length,leftArray.length);
        //System.out.println(Arrays.toString(passedArray));
        
    }
}
