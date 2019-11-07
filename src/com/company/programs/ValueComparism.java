package com.company.programs;

// Given three input variables check them for equal, difference and if two are the same
public class ValueComparism {

    public static void main(String[] args) {
        Out.print("Bitte eine Ganzzahl x ein!"); // Input prompt to user
        int x = In.readInt(); // Read input as integer
        Out.print("Bitte eine Ganzzahl y ein!");
        int y = In.readInt();
        Out.print("Bitte eine Ganzzahl z ein!");
        int z = In.readInt();
        if (x == y && y == z) { // case all are the same
            Out.println("The given inputs are all of the same value.");
        } else if ( x != y && y != z) { // case none are the same
            Out.println("All the given inputs are distinct values.");
        } else { // only three given so this needs to be the case otherwise
            Out.println("Two given input values are of the same value.");
        }
    }
}
