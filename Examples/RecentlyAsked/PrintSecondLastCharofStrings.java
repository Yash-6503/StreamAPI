/*
 * Program to print Strings 2nd last character using multiple techniques.
*/

package com.classes;

import java.util.*;

public class PrintSecondLastCharofStrings {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Dhoni", "Virat", "Sachin", "Rohit", "Yash"));

        System.out.println("List of Strings: " + list);

        System.out.print("Last 2nd character of each String using stream-API: ");
        list.stream().map(str -> str.charAt(str.length() - 2)).forEach(ch -> {
            System.out.print(ch + " ");
        });

        System.out.print("\nLast 2nd character of each String using For-Each Loop: ");
        for (String str : list) {
            System.out.print(str.charAt(str.length() - 2) + " ");
        }

        System.out.print("\nLast 2nd character of each String using For-Each Method: ");
        list.forEach(str -> {
            System.out.print(str.charAt(str.length() - 2) + " ");
        });

        System.out.print("\nLast 2nd character of each String using For Loop: ");
        for (int s = 0; s < list.size(); s++) {
            String str = list.get(s);
            System.out.print(str.charAt(str.length() - 2) + " ");
        }

        System.out.print("\nLast 2nd character of each String using Iterator: ");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            String str = (String) itr.next();
            System.out.print(str.charAt(str.length() - 2) + " ");
        }

        System.out.print("\nLast 2nd character of each String using List Iterator: ");
        ListIterator listItr = list.listIterator();
        while (listItr.hasNext()) {
            String str = (String) listItr.next();
            System.out.print(str.charAt(str.length() - 2) + " ");
        }
        System.out.print("\tReverse order : ");
        while (listItr.hasPrevious()) {
            String str = (String) listItr.previous();
            System.out.print(str.charAt(str.length() - 2) + " ");
        }

        System.out.print("\nLast 2nd character of each String using Spliterator: ");
        Spliterator<String> spli = list.spliterator();
        spli.forEachRemaining(str -> {
            System.out.print(str.charAt(str.length() - 2) + " ");
        });
        
        System.out.print("\nLast 2nd character of each String using Method Reference [::]: ");
        list.stream().map(str -> str.charAt(str.length() - 2)).forEach(System.out::print);

    }
    
}
