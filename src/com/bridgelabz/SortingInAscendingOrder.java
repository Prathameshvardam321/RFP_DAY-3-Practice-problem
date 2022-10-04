package com.bridgelabz;

public class SortingInAscendingOrder {
    static void arrayInAscending(int[] arr){
        int temp=0;
        for ( int i=0;i<arr.length;i++){
            for (int j=0;j< arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print(" Sorted array is : ");
        for (int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String[] args) {
        int[]arr = {426,100,2332,776,2,111};
       arrayInAscending(arr);
    }
}
