/*
 * arr[] = { 5, 2, 1, 7, -1, 5 };
 * k = 6
 * [5,1], [1,5], [7,-1]
 * all pairs sum is 6.
 * so find it and print the pairs.
*/

package com.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FindPairSum {
    public static void main(String[] args) {
        
        //solved using for loop.
        int arr[] = { 5, 2, 1, 7, -1, 5 };
        int k = 6, count = 0, sum = 0, c = 0;

        System.out.print("Array : "+Arrays.toString(arr)+"\n");
        System.out.print("Output Pairs: [");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                sum = arr[i] + arr[j];
                if (sum == k) {
                    System.out.print("[" + arr[i] + "," + arr[j] + "]");
                    count++;
                }
            }
            sum = 0;
        }
        System.out.println("]\nTotal Pairs are "+count+" whose sum is " + k);


        // Solved using forEach method.
        System.out.println("\nSolved using ForEach Method...");
        List<Integer> list = new ArrayList<>(List.of(5, 2, 1, 7, -1, 5));
        int n=6; 
        list.forEach(i -> {
            list.forEach(j -> {
                if (list.indexOf(i) < list.indexOf(j) && i + j == n) {
                    System.out.print("[" + i + "," + j + "]");
                }
            });
        });

    }
}

/*
 * Array : [5, 2, 1, 7, -1, 5]
 * Output Pairs: [[5,1][1,5][7,-1]]
 * Total Pairs are 3 whose sum is 6
 * 
 * Solved using ForEach Method...
 * [5,1][7,-1][5,1]
 */