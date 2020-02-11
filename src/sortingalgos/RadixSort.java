/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgos;

public class RadixSort {
  public int countDigits(int number){  
      int temp=number;
      int digits=0;
      while(temp!=0){
          temp=temp/10;
          digits++;
      }
      return digits;
}
public int findNthDigit(int number,int findDigit){
    
    int ten = (int)Math.pow(10, findDigit-1);
    int result = number;
    
    result = (result/ten)%10;
    return result;
}  
  
  
}
