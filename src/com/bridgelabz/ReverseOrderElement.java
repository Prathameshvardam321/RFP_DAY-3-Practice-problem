package com.bridgelabz;

public class ReverseOrderElement {
static void printArrayReverse(int[] arr){
    System.out.print("Reverse order element ");
    for (int i= arr.length-1;i>=0;i--){
        System.out.print(arr[i]+" ");
    }
}
    public static void main(String[] args) {
        int [] arr ={12,32,45,87,233,11,121,190};
       printArrayReverse(arr);
    }
}
