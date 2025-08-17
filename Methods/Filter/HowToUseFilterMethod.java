// How to use Filter Method in stream api

package com.classes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class HowToUseFilterMethod{
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Numbers : " + numbers);
        
        System.out.println("Even Numbers : ");
        numbers.stream().filter(num -> num % 2 == 0).forEach(System.out::println);
        
        System.out.println("Odd Numbers : ");
        Stream<Integer> stream = numbers.stream().filter(num -> num % 2 != 0);
        stream.forEach(System.out::println);
    }
}

/* Output:
 * Numbers : [1, 2, 3, 4, 5, 6, 7, 8, 9]
 * Even Numbers :
 * 2
 * 4
 * 6
 * 8
 * Odd Numbers :
 * 1
 * 3
 * 5
 * 7
 * 9
 */