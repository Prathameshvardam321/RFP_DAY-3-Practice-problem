package com.bridgelabz;

public class ElementsAtOddPosition {
    static void arrayElementsOddPosition(int[] arr){
        for (int i=0;i<arr.length;i++){
            if (i%2==1){
                System.out.println("Element at position "+i+" is "+arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int [] arr ={543,45,87,233,11,121,190,678,908};
arrayElementsOddPosition(arr);
        }
    }

