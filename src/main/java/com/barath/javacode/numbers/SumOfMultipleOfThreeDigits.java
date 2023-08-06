package com.barath.javacode.numbers;

import java.util.Scanner;

/**
 * The prime digits in the series 1 -9 are 2, 3, 5 or 7
 */
public class SumOfMultipleOfThreeDigits {
    public static void main(String[] args) {
        System.out.println("Enter a number greater than zero:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int digit = 0;
        int sum3MultipleDigits = 0;

        while(num != 0) {
            digit = num % 10;
            if (digit == 3 || digit == 6 || digit == 9) {
                sum3MultipleDigits = sum3MultipleDigits + digit;
            }
            System.out.print(digit + " ");
            num = num / 10;
        }
        System.out.println();
        System.out.println("The sum of multiple of three digits is: " + sum3MultipleDigits);

        scan.close();
    }
}
