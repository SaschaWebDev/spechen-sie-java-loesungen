package com.company.programs;

// Given one input variable as a positive integer the program prints of the numbers left to right
public class IntCountSum {

    public static void main(String[] args) {
        Out.print("Bitte eine Ganzzahl für die Nummer ein!"); // Input prompt to user
        int input = In.readInt(); // Read input as integer
        int sum = 0;

        while (input > 0) {
            sum += input % 10;
            input /= 10;
        }
        Out.print(sum);
    }
}