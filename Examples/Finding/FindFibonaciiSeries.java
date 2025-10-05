/* 
 * Find fibonacii series between range of numbers
 * Fibonacii Series Ex. - 0 1 1 2 3 5 8 13 21
*/

package com.classes;

import java.util.*;

public class FindFibonaciiSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nEnter from which number you want to find Fibonacii series: ");
        int num1 = sc.nextInt();
        
        System.out.println("\nEnter upto which number you want to find Fibonacii series: ");
        int num2 = sc.nextInt();
        
        List<Integer> fibonaciiSeries = new ArrayList<>();

        int prev = 0, next = 1, sum;

        while (prev <= num2) {
            if (prev >= num1) {
                fibonaciiSeries.add(prev);
            }
            sum = prev + next;
            prev = next;
            next = sum;
        }

        System.out.print("\nFibonacii Series from " + num1 + " to " + num2 + " is : ");
        fibonaciiSeries.stream().forEach(num -> System.out.print(num+" "));
    }
}


/*
 * Enter from which number you want to find Fibonacii series:
 * 1
 * 
 * Enter upto which number you want to find Fibonacii series:
 * 5
 * 
 * Fibonacii Series from 1 to 5 is : 1 1 2 3 5
*/

/*
 * Enter from which number you want to find Fibonacii series:
 * 5
 * 
 * Enter upto which number you want to find Fibonacii series:
 * 50
 * 
 * Fibonacii Series from 5 to 50 is : 5 8 13 21 34
 */
