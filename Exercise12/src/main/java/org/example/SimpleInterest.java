package org.example;
import java.util.Scanner;
/*
 *   UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
public class SimpleInterest {
    public static void main(String[] args){
        double principal, interest, amount;
        int years;
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter the principal ");
        principal = scnr.nextDouble();
        String strPrincipal = String.format("%.2f", principal);
        System.out.print("Enter the rate of interest ");
        interest = scnr.nextDouble();
        String strInterest = String.format("%.2f", interest);
        System.out.print("Enter the number of years ");
         years = scnr.nextInt();
         amount = (principal*((interest/100)*years+1));
         String strAmount = String.format("%.2f", amount);
        System.out.print("After " + years + " at " + strInterest + "%, the investment will be worth $" + strAmount);

    }
}
