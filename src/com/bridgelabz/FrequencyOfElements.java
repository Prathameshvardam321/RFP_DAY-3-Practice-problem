package com.bridgelabz;
import java.lang.reflect.Array;
public class FrequencyOfElements {
    static void countFrequencyElements(int [] arr){
        int [] arr2=new int[arr.length];
        int visited=-1;
        for (int i=0;i< arr.length;i++){
            int count=1;
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    arr2[j]=visited;
                    count++;
                }
            }
            if (arr2[i]!=visited){
                arr2[i]=count;
            }
        }
        for (int k=0;k< arr.length;k++){

                System.out.println(arr2[k]);

        }
    }
    public static void main(String[] args) {
        int [] arr = {12,34,12,45,32,45,12};
       countFrequencyElements(arr);
    }
}
