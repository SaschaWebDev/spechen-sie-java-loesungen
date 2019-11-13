package com.company.programs;

// Given one input variable as a positive integer the program prints the amount of numbers it contains
public class IntCountNumber {

    public static void main(String[] args) {
        Out.print("Bitte eine Ganzzahl für die Nummer ein!"); // Input prompt to user
        int input = In.readInt(); // Read input as integer
        int amount = 1;

        while (input > 10) {
            amount++;
            input = input / 10;
        }
        Out.print(amount);
    }
}