package com.bridgelabz;

public class LargestNumberInArray {
    static String largestElementInArray(int [] array){
        int largestNumber=array[0];
        int smallestNumber =array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]>largestNumber){
                largestNumber=array[i];
            }
            if (array[i]<smallestNumber){
                smallestNumber=array[i];
            }
        }
        return "Largest number is : "+largestNumber+" and Smallest number is : "+smallestNumber;
    }

    public static void main(String[] args) {
        int[] array ={1221,42,34,4,100,1345,34,21,10,12341};
        String result = largestElementInArray(array);
        System.out.println(result);
    }
}
