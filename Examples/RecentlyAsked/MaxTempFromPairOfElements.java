/*
 * arr = [32,30,28,31,36,30]
 * k = 3
 * from above array it should compare 3[k] pairs and print its Max temp.
 * [32,30,28] -> 32
 * [30,28,31] -> 31
 * [28,31,36] -> 36
 * [31,36,30] -> 36
 * 
 * output : [32,31,36,36]
*/

import java.util.Arrays;

public class MaxTempFromPairOfElements {
    public static void main(String[] args) {
        
        int arr[] = { 32, 30, 28, 31, 36, 30};
        int k = 3;
        int pairs = arr.length - 2;
        int output[] = new int[pairs];

        for (int i = 0; i <= arr.length - k; i++) {
            int max = arr[i];
            for (int j = i; j < i + k; j++) {
                if (arr[j] > max) {
                    System.out.print(arr[i] + " ");
                    max = arr[j];
                }

            }
            output[i] = max;
        }
        System.out.println("\nOutput : "+Arrays.toString(output));
    }
}
