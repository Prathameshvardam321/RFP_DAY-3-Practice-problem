package com.bridgelabz;

public class SmallestNumber {
    static int smallestElement(int[] array){
        int smallestNumber = array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]<smallestNumber){
                smallestNumber=array[i];
            }
        }
        return smallestNumber;
    }
    public static void main(String[] args) {
        int[] array = {1221,42,2,12,2,34,100,1345,34,21};
        int result = smallestElement(array);
        System.out.println("Smallest number : "+result);
    }
}
