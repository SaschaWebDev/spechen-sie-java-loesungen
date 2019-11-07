package com.company.programs;

// Given three input variables check them for their attributed of a geometric triangle
public class TriangleCalc {

    public static void main(String[] args) {
        Out.print("Bitte eine Ganzzahl x als Seitenlänge des Dreiecks ein!"); // Input prompt to user
        int x = In.readInt(); // Read input as integer
        Out.print("Bitte eine Ganzzahl y als Seitenlänge des Dreiecks ein!");
        int y = In.readInt();
        Out.print("Bitte eine Ganzzahl z als Seitenlänge des Dreiecks ein!");
        int z = In.readInt();
        if (x + y <= z || x + z <= y || y + z <= x) { // case invalid triangle
            Out.println("Eingabe eines ungültigen Dreiecks, zwei Seitenlängen kumuliert kleinergleich dritter Seitenlänge.");
        } else if (x == y && y == z) { // all triangle lengths are the same
            Out.println("Eingabe eines gleichseitigen Dreiecks.");
        } else if ((x == y || x == z || y == z) && (x * x + y * y == z * z || x * x + z * z == y * y || y * y + z * z == x * x)) { // isosceles and right triangle
            Out.println("Eingabe eines gleichschenkligen und rechtwinklingen Dreiecks.");
        } else if (x == y || x == z || y == z) { // isosceles triangle
            Out.println("Eingabe eines gleichschenkligen Dreiecks.");
        } else if (x * x + y * y == z * z || x * x + z * z == y * y || y * y + z * z == x * x) { // right triangle
            Out.println("Eingabe eines rechtwinkligen Dreiecks.");
        } else {
            Out.println("Eingabe eines sonstig gültigen Dreiecks."); // valid triangle
        }
    }
}
