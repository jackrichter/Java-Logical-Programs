package com.barath.javacode.numbers;

import java.util.Scanner;

public class DigitOccurrenceCounter {
    public static void main(String[] args) {
        System.out.println("Enter a number greater than zero and a digit to search:");
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        int digitToSearch = scan.nextInt();
        int digit = 0;
        int count = 0;

        while(num != 0) {
            digit = (int) (num % 10);
            if (digit == digitToSearch) {
                count++;
            }
            num = num / 10;
        }
        System.out.println();
        System.out.println("The occurrence count of the sought digit  is: " + count);

        scan.close();
    }
}
