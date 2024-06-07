/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.subtractionapplication;

/**
 *
 * @author DAVID'S-PC
 */
import java.util.Random;
import java.util.Scanner;

public class Subtraction {

    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random rand = new Random();
        
        // Generate two single-digit integers
        int number1 = rand.nextInt(10); // Generates a number between 0 and 9
        int number2 = rand.nextInt(10); // Generates a number between 0 and 9

        // Ensure number1 >= number2, if not, swap them
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // Prompt the student with the subtraction question
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        int studentAnswer = scanner.nextInt();

        // Check the student's answer and display whether it is correct
        int correctAnswer = number1 - number2;
        if (studentAnswer == correctAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + correctAnswer);
        }

        // Close the scanner
        scanner.close();
    }
}

