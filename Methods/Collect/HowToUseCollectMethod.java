// How to use collect method in stream api.

package com.classes;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;

public class HowToUseCollectMethod {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9);
        System.out.println("Numbers List: " + numbersList);

        List<Integer> positiveNumbers = numbersList.stream().filter(num -> num > 0).collect(Collectors.toList());
        System.out.println("Positive Numbers List : "+positiveNumbers);
        
        List<Integer> negativeNumbers = numbersList.stream().filter(num -> num < 0).collect(Collectors.toList());
        System.out.println("Negative Numbers List : "+negativeNumbers);

    }
}

/* Output:
 * Numbers List: [1, 2, 3, 4, 5, 6, 7, 8, 9, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9]
 * Positive Numbers List : [1, 2, 3, 4, 5, 6, 7, 8, 9]
 * Negative Numbers List : [-1, -2, -3, -4, -5, -6, -7, -8, -9]
 */