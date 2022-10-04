package com.bridgelabz;

public class ThirdLargestNumber {
    static int thirdLargestElement(int[] arr){
        int largest=0,secondLargest=0,thirdLargest=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>largest){
                thirdLargest=secondLargest;
                secondLargest=largest;
                largest=arr[i];
            } else if (arr[i]>secondLargest) {
                thirdLargest=secondLargest;
                secondLargest=arr[i];
            }else if (arr[i]>thirdLargest){
                thirdLargest=arr[i];
            }
        }
        return thirdLargest;
    }
    public static void main(String[] args) {
        int[] arr={1219,54,12,541,99,331,1,2,1221};
    int result=thirdLargestElement(arr);
        System.out.println("Third largest element is "+result);
    }
}
