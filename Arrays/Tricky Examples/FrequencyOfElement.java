package com.classes;

import java.security.KeyStore.Entry;
import java.util.*;


public class FrequencyOfElement {
    public static void main(String... args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter how many elements in array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        
        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are : " + Arrays.toString(arr));
        
        Map<String, Integer> freqMap = new HashMap<>();

        //now calculating frequency of array elements
        for (int i = 0; i < arr.length - 1; i++) {
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > 0) {
                freqMap.put("Frequency of " + arr[i], count);
                System.out.println(arr[i] + " " + count);
            }
        }

        Set<Map.Entry<String, Integer>> values = freqMap.entrySet();
        
        values.forEach(System.out::println);

        System.out.println("\n\n"+freqMap.entrySet());
    }
}
