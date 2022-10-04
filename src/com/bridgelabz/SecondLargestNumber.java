package com.bridgelabz;

public class SecondLargestNumber {
    static int secondLargestElement(int[] array){
        int largestNumber=0;
        int secondLargest=0;
        for (int i=0;i<array.length;i++){
            if (array[i]>largestNumber){
                secondLargest=largestNumber;
                largestNumber=array[i];
            } else if (array[i]>secondLargest) {
                secondLargest=array[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] array = {12,6,0,789,12,1000};
        int result = secondLargestElement(array);
        System.out.println(result);

    }
}
