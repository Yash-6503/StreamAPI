package com.classes;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        
        String sentence = "Kya hai 10 Bhikmangya 2.5 Hello.";

        System.out.println("\nSentence : " + sentence);

        StringBuffer reversedSentence = new StringBuffer();

        String arr[] = sentence.split(" ");

        for (int i = arr.length - 1; i >= 0; i--) {
            reversedSentence.append(arr[i]);
            if(i != 0){
                reversedSentence.append(" ");
            }
        }
        
        System.out.println("\nReversed Sentence : " + reversedSentence);
        
        //caluclate words, int, floats
        System.out.println("\nSentence Array : "+Arrays.toString(arr));
        int num = 0;
        int decimals = 0;
        int words = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].contains(".")) {
                try{
                    Double.parseDouble(arr[i]);
                    decimals++;
                } catch (Exception e) {
                    words++;
                }
            } else {
                try{
                    Integer.parseInt(arr[i]);
                    num++;
                } catch (Exception e) {
                    words++;
                }
            }

            // else if (i > '0' && i < '9') {
            //     num++;
            // } else if (i > '.' && i < 9.9) {
            //     decimals++;
            // } else {
            //     words++;
            // }
        }
        
        System.out.println("\nNumbers in Sentence : "+num);
        System.out.println("Decimals in Sentence : "+decimals);
        System.out.println("Words in Sentence : "+words);
    }
}

/*
 * Output:
 * Sentence : Kya hai 10 Bhikmangya 2.5 Hello.
 * 
 * Reversed Sentence : Hello. 2.5 Bhikmangya 10 hai Kya
 * 
 * Sentence Array : [Kya, hai, 10, Bhikmangya, 2.5, Hello.]
 * 
 * Numbers in Sentence : 1
 * Decimals in Sentence : 1
 * Words in Sentence : 4
 */