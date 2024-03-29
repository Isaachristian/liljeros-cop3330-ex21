/*
 *  UCF COP3330 Summer 2021 Assignment 21 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        int input;

        System.out.print("Enter the month (as a number): ");
        input = scanner.nextInt();

        if (input < 0) {
            System.out.println("Negatives are not allowed");
            return;
        }

        switch (input) {
            case 1:
                System.out.println("The month is January");
                break;
            case 2:
                System.out.println("The month is February");
                break;
            case 3:
                System.out.println("The month is March");
                break;
            case 4:
                System.out.println("The month is April");
                break;
            case 5:
                System.out.println("The month is May");
                break;
            case 6:
                System.out.println("The month is June");
                break;
            case 7:
                System.out.println("The month is July");
                break;
            case 8:
                System.out.println("The month is August");
                break;
            case 9:
                System.out.println("The month is September");
                break;
            case 10:
                System.out.println("The month is October");
                break;
            case 11:
                System.out.println("The month is November");
                break;
            case 12:
                System.out.println("The month is December");
                break;
            default:
                System.out.printf("There is no %dth month%n", input);
        }

    }
}
