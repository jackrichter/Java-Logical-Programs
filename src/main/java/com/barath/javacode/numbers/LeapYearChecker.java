package com.barath.javacode.numbers;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        System.out.println("Enter a year:");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a Leap year");
        }
        scan.close();
    }
}
