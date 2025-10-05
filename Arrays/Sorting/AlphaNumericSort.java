package com.classes;


/*
 * Sort AlphaNumeric Array
 * [4,'c',5,-1,3,2,'b',1,'a']
 */

import java.util.*;

public class AlphaNumericSort {
    public static void main(String[] args) {

        int arr[] = { 4, 'c', 5, -1, 3, 2, 'b', 1, 'a' };
        int n = arr.length - 1;

        System.out.println("Array is : " + Arrays.toString(arr));
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.println("\nSorted Array is : " + Arrays.toString(arr));

        Object arr1[] = new Object[arr.length];

        for (int i = 0; i <= n; i++) {
            if (arr[i] == 97) {
                arr1[i] = 'a';
            } else if (arr[i] == 98) {
                arr1[i] = 'b';
            } else if (arr[i] == 99) {
                arr1[i] = 'c';
            } else {
                arr1[i] = arr[i];
            }
        }

        System.out.println("\nSorted Array is : "+Arrays.toString(arr1));
        
    }    
}
