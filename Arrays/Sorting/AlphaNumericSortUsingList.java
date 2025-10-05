package com.classes;

import java.util.*;

public class AlphaNumericSortUsingList {
    public static void main(String[] args) {

        Object arr[] = { 4, 'c', 5, -1, 3, 2, 'b', 1, 'a' };

        List<Integer> numList = new ArrayList<>();
        List<Character> charList = new ArrayList<>();

        for (Object o : arr) {
            if (o instanceof Character) {
                charList.add((char) o);
            } else {
                numList.add((int) o);
            }
        }

        Collections.sort(charList);
        Collections.sort(numList);

        List<Object> sortedList = new ArrayList<>();
        sortedList.addAll(numList);
        sortedList.addAll(charList);

        System.out.println("\nSorted Array is : "+sortedList);
    }
}
