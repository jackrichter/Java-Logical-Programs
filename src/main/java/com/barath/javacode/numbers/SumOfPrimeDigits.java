package com.barath.javacode.numbers;

import java.util.Scanner;

/**
 * The prime digits in the series 1 -9 are 2, 3, 5 or 7
 */
public class SumOfPrimeDigits {
    public static void main(String[] args) {
        System.out.println("Enter a number greater than zero:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int digit = 0;
        int sumPrimeDigits = 0;

        while(num != 0) {
            digit = num % 10;
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                sumPrimeDigits = sumPrimeDigits + digit;
            }
            System.out.print(digit + " ");
            num = num / 10;
        }
        System.out.println();
        System.out.println("The sum of prime digits is: " + sumPrimeDigits);

        scan.close();
    }
}
