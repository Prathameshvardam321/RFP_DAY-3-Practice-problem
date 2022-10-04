package com.bridgelabz;

public class PrintElements {
    static void printArray(int [] arr){
        int result=0;
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }


        public static void main(String[] args) {
            int [] arr = {12,23,45,23,12,9,12};
           printArray(arr);
        }
    }

