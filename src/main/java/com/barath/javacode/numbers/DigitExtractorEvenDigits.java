package com.barath.javacode.numbers;

import java.util.Scanner;

public class DigitExtractorEvenDigits {
    public static void main(String[] args) {
        System.out.println("Enter a number greater than zero:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int digit = 0;
        int sumEvenDigits = 0;

        while(num != 0) {
            digit = num % 10;
            System.out.print(digit + " ");
            num = num / 10;
            if (digit % 2 == 0) {
                sumEvenDigits = sumEvenDigits + digit;
            }
        }
        System.out.println();
        System.out.println("The sum of the even digits is: " + sumEvenDigits);

        scan.close();
    }
}
