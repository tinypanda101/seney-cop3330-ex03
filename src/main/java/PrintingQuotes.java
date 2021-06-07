/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Seney
 */

import java.util.Scanner;

public class PrintingQuotes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the quote?");

        String quote = scanner.nextLine();

        System.out.println("Who said it?");

        String author = scanner.nextLine();

        System.out.println(author + " says, \"" + quote + "\"");

    }
}
