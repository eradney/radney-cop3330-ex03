/**
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 * Copyright 2021 Emily Radney
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);
        String quote;
        String name;

        System.out.print("What is the quote? ");
        quote = scnr.next();
        System.out.print("Who said it? ");
        name = scnr.next();
        System.out.println(name + " says, " + '\"' + quote + '\"');
    }
}
