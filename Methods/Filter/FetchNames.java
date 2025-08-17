// Fetch names using given conditions.

package com.classes;

import java.util.Arrays;
import java.util.*;

public class FetchNames {
    public static void main(String... args) {

        List<String> nameList = Arrays.asList("Yash", "Harsh", "Nitin", "Raj", "Abhi", "Rajesh", "Sakshi");
        
        System.out.println("Names : " + nameList);

        //print names starts with R
        System.out.println("\nNames Starts with R: ");
        nameList.stream().filter(name -> name.startsWith("R")).forEach(System.out::println);
        
        //print names which contains a
        System.out.println("\nNames which contains a: ");
        nameList.stream().filter(name -> name.contains("a")).forEach(System.out::println);
        
        //print names ends with h
        System.out.println("\nNames Ends with h: ");
        nameList.stream().filter(name -> name.endsWith("h")).forEach(System.out::println);
        
    }
}


/* Output:
 * Names : [Yash, Harsh, Nitin, Raj, Abhi, Rajesh, Sakshi]
 * 
 * Names Starts with R:
 * Raj
 * Rajesh
 * 
 * Names which contains a:
 * Yash
 * Harsh
 * Raj
 * Rajesh
 * Sakshi
 * 
 * Names Ends with h:
 * Yash
 * Harsh
 * Rajesh
 */