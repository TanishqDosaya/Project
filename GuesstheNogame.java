package com.tanishq.game;
 
import java.util.Random;
import java.util.Scanner;
 
public classNoGuessingGame {
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        Random random = new Random();
        int secretNo = random.nextInt(100) + 1;
        int attempts = 0;
        int guess;
 
        System.out.println("Welcome to the No Guessing Game!");
        System.out.println("Try to guess the secret no between 1 and 100.");
 
        while (true) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
 
            if (guess == secretNo) {
                System.out.println(
                        "Congratulations! You guessed the no " + secretNo + " in " + attempts + " attempts!");
                break;
            } else if (guess < secretNo) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
