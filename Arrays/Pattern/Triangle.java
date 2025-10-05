package com.classes;

public class Triangle {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("\nWishing you a Happy Diwali in Advance!!!\n");

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                if (i == 4 && j == 4) {
                    System.out.print("  ");
                } else if ((i == 5 && j == 4) || (i == 5 && j == 6) || (i == 5 && j == 5)) {
                    System.out.print("  ");
                } else {
                    System.err.print("* ");
                }
            }

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                if (i == 4 && j == 4) {
                    System.out.print("  ");
                } else if ((i == 5 && j == 4) || (i == 5 && j == 6) || (i == 5 && j == 5)) {
                    System.out.print("  ");
                } else {
                    System.err.print("* ");
                }
            }

            System.out.println();
        }

        int n1 = 10;
        
        for (int i = n1; i >= 1; i--) {

            for (int j = 1; j <= n1 - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
               System.out.print("# ");
            }

            System.out.println();
        }

    }
}

/*
        * 
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
*/

/*
        * 
      * * *
    * * * * *
  * * *   * * *
* * *       * * *
* * *       * * *
  * * *   * * *
    * * * * *
      * * *
        *
* * * * * * * * * * * * * * * * * * *      
  * * * * * * * * * * * * * * * * *        
    * * * * * * * * * * * * * * *
      * * * * * * * * * * * * *
        * * * * * * * * * * *
          * * * * * * * * *
            * * * * * * *
              * * * * *
                * * *
                  * 
*/
