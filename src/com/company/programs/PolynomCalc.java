package com.company.programs;

// Polynom Calculation
public class PolynomCalc {

    public static void main(String[] args) {
            int a, b, c, d, x, y; // Declaring all the used variables
                 Out.print("Bitte eine Ganzzahl für a eingeben!");
                a = In.readInt(); // Read each variable Input as user
                Out.print("Bitte eine Ganzzahl für b eingeben!");
                b = In.readInt();
                Out.print("Bitte eine Ganzzahl für c eingeben!");
                c = In.readInt();
                Out.print("Bitte eine Ganzzahl für d eingeben!");
                d = In.readInt();
                Out.print("Bitte eine Ganzzahl für x eingeben!");
                x = In.readInt();
                Out.println((int)Math.pow(a, 3) + (int)Math.pow(b, 2) + c * x + d); // Print and calculate the polynom division with Math.pow
    }
}
