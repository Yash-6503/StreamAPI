package com.classes;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortAndDelete {
    
    public static void main(String... args) {
        
        List<Integer> arr = List.of(3, 5, 2, 1, 3, 4, 1);

        //displaying list
        System.out.println("List : " + arr);
        
        //sorting list by stream
        List<Integer> arr1 = arr.stream().sorted().collect(Collectors.toList());
        System.out.println("\nSorted List : " + arr1);
        

        //removing duplicate using stream
        List<Integer> arr2 = arr.stream().distinct().collect(Collectors.toList());
        System.out.println("\nAfter removing duplicates : " + arr2);
        
        

        //sorting manually
        int array[] = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            array[i] = arr.get(i);
        }

        System.out.println("\nConverted Array : "+Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j <= array.length - 1; j++) {
                if (array[i] >= array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("\nSorted Manually : " + Arrays.toString(array));
        
        // removing duplicates manually
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j <= array.length - 1; j++) {
                if (array[i] == array[j]) {
                    // int temp = array[i];
                    // array[i] = array[j];
                    // array[j] = temp;
                    array[j] = 0;
                }
            }
        }


        System.out.print("\nRemoved Duplicate Manually : [");
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > 0) {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("\b\b]");

    }
}
