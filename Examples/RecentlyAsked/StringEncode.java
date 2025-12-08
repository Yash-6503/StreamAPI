package com.classes;

import java.util.*;


public class StringEncode {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Input : ");
        String input = sc.next();

        StringBuffer firstPart = new StringBuffer();
        StringBuffer secondPart = new StringBuffer();
        StringBuffer thirdPart = new StringBuffer();

        if (input.length() == 9) {
            firstPart.append(input.substring(0, 3));
            secondPart.append(input.substring(3, 6));
            thirdPart.append(input.substring(6, 9));

            // System.out.println(input);
            // System.out.println(firstPart);
            // System.out.println(secondPart);
            // System.out.println(thirdPart);

            
            System.out.println("First part : "+encodeString(firstPart));
            System.out.println("Reverse String : "+reverseString(secondPart));
            System.out.println("First part : " + encodeString(thirdPart));

            StringBuffer op1 = encodeString(thirdPart);
            StringBuffer op2 = encodeString(firstPart);
            StringBuffer op3 = reverseString(secondPart);

            System.out.println("\noOutput : "+op1+""+op2+""+op3);
            // System.out.printf("\nOutput : \n", encodeString(thirdPart), encodeString(firstPart), reverseString(secondPart));

        } else {
            System.out.println("Invalid input..");
        }

        sc.close();

    }
    
    public static StringBuffer encodeString(StringBuffer input) {
        // ex. abc => 1b3
        int a = input.charAt(0);
        int b = input.charAt(2);
        StringBuffer result = new StringBuffer();

        for (int i = 0; i <= input.length() - 1; i++) {
            if (i == 1) {
                result.append(input.charAt(i));
            } else {
                // if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                //     result.append((int) input.charAt(i));
                // }

                result.append(alphabets().indexOf(input.charAt(i)) + 1);
            }

        }

        return result;
    }
    
    
    public static StringBuffer reverseString(StringBuffer input) {

        StringBuffer result = new StringBuffer();
        for (int i=input.length()-1; i >= 0; i--) {
            result.append(input.charAt(i));
        }
        return result;
    }

    public static List<Character> alphabets() {
        return List.of(
            'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'
        );
    }
}
