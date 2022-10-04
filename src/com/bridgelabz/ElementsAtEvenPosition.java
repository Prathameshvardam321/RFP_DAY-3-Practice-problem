package com.bridgelabz;

public class ElementsAtEvenPosition {
    static void arrayElementsEvenPosition(int[] arr){
        for (int i=0;i<arr.length;i++){
            if (i%2==0){
                System.out.println("Element at position "+i+" is "+arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int [] arr ={12,32,45,87,233,11,121,190};
       arrayElementsEvenPosition(arr);
    }
}
