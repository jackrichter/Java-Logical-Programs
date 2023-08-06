package com.barath.javacode.numbers;

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        System.out.println("Enter a number greater than zero:");
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        int count = 0;

        while(num != 0) {
            num = num / 10;
            count++;
        }
        System.out.println("The count of digits is: " + count);

        scan.close();
    }
}
