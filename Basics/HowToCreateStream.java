// How to create a Stream using stream()

package com.classes;

import java.util.*;
import java.util.stream.*;

public class HowToCreateStream {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Orange");
        items.add("Mango");
        items.add("Apple");

        Stream<String> stream = items.stream();
        stream.forEach(System.out::println);
    }
}

/* output
 * Orange
 * Mango
 * Apple
 */