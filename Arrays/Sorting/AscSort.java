package com.classes;

import java.util.Arrays;
import java.util.*;

public class AscSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Enter How many elements into Array : ");
        n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("\nEnter " + n + " Elements in array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("\nArray is : " + Arrays.toString(arr));
        
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("\nSorted Array is : " + Arrays.toString(arr));
    }    
}
