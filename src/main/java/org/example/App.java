/*
 * UCF COP3330 Fall 2021 Assignment 13 Solution
 * Copyright 2021 Noah Taylor
 */

package org.example;

import java.util.Scanner;
import java.lang.Math;

public class App {

    public static double GetInterest(double P, double r, int t, int n) {
        double A = P * Math.pow((1 + (r / n)), (n * t));

        return Math.round(A * 100) / 100.0;
    }

    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);

        System.out.println( "What is the principal amount?" );
        double P = input.nextDouble();
        System.out.println( "What is the rate?" );
        double user_r = input.nextDouble();
        System.out.println( "What is the the number of years?" );
        int t = input.nextInt();
        System.out.println( "What is the number of times the interest is compounded per year?" );
        int n = input.nextInt();

        double r = user_r / 100;
        double A = GetInterest(P, r, t, n);

        System.out.println("$" + P + " invested at " + user_r + "% for " + t +
                " years compounded " + n + " times per year is " + "$" + A);
    }
}
