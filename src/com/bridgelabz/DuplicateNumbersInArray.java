package com.bridgelabz;

public class DuplicateNumbersInArray {
    static void findDuplicateNumber(int[] arr) {
        int[] result = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    result[j] = visited;
                    count++;
                }
            }
            if (result[i] != visited) {
                result[i] = count;
            }
        }
        System.out.print("Duplicate Elements are : ");
        for (int k = 0; k < arr.length; k++) {
            if (result[k] > 1) {
                System.out.print(arr[k] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr ={12,1,3,5,12,1,3,4,12,1,2,31,2,3,43};
        findDuplicateNumber(arr);
        }
    }


