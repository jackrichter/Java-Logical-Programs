package com.barath.javacode.numbers;

import java.util.Scanner;

public class CreditCardIssuer {
    public static void main(String[] args) {
        // 400-600 = Silver Card; 600-800 = Gold Card; 800-850 = Platinum Card; < 400 or > 850 = Not valid
        System.out.println("Enter a credit score:");
        try (Scanner scan = new Scanner(System.in);) {
            int creditScore = scan.nextInt();
            if (creditScore < 400 || creditScore > 850) {
                System.out.println("Invalid Credit Score");
            } else {
                if (creditScore >= 400 && creditScore < 600) {
                    System.out.println("Silver Card");
                } else if (creditScore >= 600 && creditScore < 850) {
                    System.out.println("Gold Card");
                } else {
                    System.out.println("Platinum Card");
                }
            }
        }
    }
}
