package org.example.commonclass;

import java.util.Arrays;

public class OddLeftEvenRight {
    public static void main(String[] args) {
        int[] arr = {26,67,49,38,52,66,7,71,56,87};
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            while (arr[left] % 2 != 0){
                left ++;
            }
            while (arr[right] % 2 == 0){
                right --;
            }
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        Arrays.sort(arr, 0, left);
        Arrays.sort(arr,right+1, arr.length);
        System.out.println(Arrays.toString(arr));

    }
}
