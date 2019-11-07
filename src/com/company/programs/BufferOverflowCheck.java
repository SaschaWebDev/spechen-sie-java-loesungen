package com.company.programs;

// Given two input numbers check for addition that no overflow would be created for int
public class BufferOverflowCheck {

    public static void main(String[] args) {
        Out.print("Bitte eine Ganzzahl für a ein!"); // Input prompt to user
        int a = In.readInt(); // Read input as integer
        Out.print("Bitte eine Ganzzahl für b ein!");
        int b = In.readInt();

        if (a > 0 && b > 0 && a > 2147483647 - b)  // if a + b > maxInt
            Out.println("Overflow");
        else if (a < 0 && b < 0 && a < -2147483648 - b)  // if a + b < minInt
            Out.println("Underflow");
        else
            Out.println("Ok");
    }
}
