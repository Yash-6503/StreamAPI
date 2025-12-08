package com.classes;

public class StringPatterns {
    public static void main(String[] args) {
        
        String sentence = "Kya 50 hai Bhikmangya 1.1 Hello.";

        int wordCount = 0;
        int numberCount = 0;
        int decimalCount = 0;

        //apply regex patterns
        wordCount = sentence.split("\\b[A-Za-z]+\\b").length-1;
        numberCount = sentence.split("\\b\\d+\\ \\b").length-1;
        decimalCount = sentence.split("\\b\\d+\\.\\d+\\b").length-1;

        System.out.println("\nSentence : " + sentence);
        System.out.println("\nNumbers in Sentence : "+numberCount);
        System.out.println("\nDecimals in Sentence : "+decimalCount);
        System.out.println("\nWords in Sentence : " + wordCount);
        
    }   
}

/*
 * Sentence : Kya 50 hai Bhikmangya 1.1 Hello.
 * 
 * Numbers in Sentence : 2
 * 
 * Decimals in Sentence : 1
 * 
 * Words in Sentence : 4
 */