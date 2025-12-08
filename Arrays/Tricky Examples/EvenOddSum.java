package com.classes;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EvenOddSum {
    public static void main(String[] args) {
        
        int arr[] = { 8, 5, 6, 3, 1, 2, 4, 7 };
        int evenSum = 0, oddSum = 0;
        
        System.out.println("Array : " + Arrays.toString(arr));
        
        //manually calculating even and odd sum
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }

        System.out.println("\nSum of Even Array elements : "+evenSum);
        System.out.println("\nSum of Odd Array elements : " + oddSum);
        
        //calculating even and sum by stream
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            array.add(arr[i]);
        }

        System.out.println("\nList of elements : " + array);
        int sum = 0;
        List<Integer> evenList = array.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);
        System.out.println(evenList.stream().count());
    }
}
