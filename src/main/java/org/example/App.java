package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Yeshwanth Mandava
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your age: ");
        int Age = input.nextInt();
        String NoDrive = "You are not old enough to legally drive.";
        String Drive = "You are old enough to legally drive.";

        String output = (Age < 16) ? NoDrive : Drive;
        System.out.println(output);

    }
}
