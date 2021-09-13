package org.example;

import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexandra Ramlogan
 */
public class App 
{
    public static void main( String[] args )
    {
        //Objective: A mad libs game!
        Scanner scan = new Scanner(System.in);
        String noun, verb, adverb, adjective; //4 strings
        //input
        System.out.print("Enter a noun: ");
        noun = scan.nextLine();
        System.out.print("Enter a verb: ");
        verb = scan.nextLine();
        System.out.print("Enter a adjective: ");
        adjective = scan.nextLine();
        System.out.print("Enter a adverb: ");
        adverb = scan.nextLine();
        //create the output
        String madlib = "You " +verb +" your " +adjective +" " +noun +" "+adverb +"? You're funny!";
        System.out.println(madlib);

    }
}
