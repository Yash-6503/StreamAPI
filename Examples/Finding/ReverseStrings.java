/*
 * Make a string reverse from list
*/

package com.classes;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseStrings {
    public static void main(String[] args) {
        
        List<String> strings = List.of(
            "Yash", "Harsh", "JAVA", "Mango", "Madam", "Virat", "Latop", "Nitin", "Spring", "Developer"
        );

        System.out.println("\nStrings are : "+strings);

        String rev = "";

        List<String> revStrings = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {
            int len = strings.get(i).length();
            for (int j = len - 1; j >= 0; j--) {
                rev = rev + strings.get(i).charAt(j);
            }
            revStrings.add(rev);
            rev = "";
        }

        // strings.stream().map(str  -> new StringBuilder(str).reverse().toString()).forEach(str -> System.out.print(str+", "));
        
        System.out.println("\nReversed Strings are : "+revStrings);
        
    }
}


/*
 * Strings are : [Yash, Harsh, JAVA, Mango, Madam, Virat, Latop, Nitin, Spring, Developer]
 * 
 * Reversed Strings are : [hsaY, hsraH, AVAJ, ognaM, madaM, tariV, potaL, nitiN, gnirpS, repoleveD]
*/