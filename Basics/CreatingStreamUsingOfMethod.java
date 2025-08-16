// how to create stream using Stream.of() method.

package com.classes;

import java.util.stream.Stream;

public class CreatingStreamUsingOfMethod {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(new Integer[] { 10, 20, 30, 40, 50 });
        stream.forEach(System.out::println);
    }
}

/* Output
 * 10
 * 20
 * 30
 * 40
 * 50
 */
