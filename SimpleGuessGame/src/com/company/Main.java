package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(30);
        System.out.println("Welcome to Guess Game! You Have 5 Chances to Find The Number. Enter Number Between 0 and 30.");
        int c = 5;
        while (true)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Number: ");
            int b = scanner.nextInt();
            if (b > a && c != 0)
            {
                System.out.println("Decrease");
                c = c - 1;
                System.out.println("You Have Left " + c + " Chances");
            }
            if (b < a && c != 0)
            {
                System.out.println("Increase");
                c = c - 1;
                System.out.println("You Have Left " + c + " Chances");
            }
            if (c == 0)
            {
                System.out.println("You Lose! You Used Your Chances and You Cant Find.");
                System.exit(0);
            }
            if (b == a)
            {
                System.out.println("  You Win!");
                System.out.println("____________");
                System.exit(0);
            }
        }
    }
}
