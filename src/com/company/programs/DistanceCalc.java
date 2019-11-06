package com.company.programs;

// Calculate distance between x and y values as points
public class DistanceCalc {

    public static void main(String[] args) {
        int x1, y1, x2, y2; // Declare all the value for two points
        x1 = In.readInt(); // Read one by one the values for the coordinates
        y1 = In.readInt();
        x2 = In.readInt();
        y2 = In.readInt();
        Out.println((int) Math.sqrt((int)Math.pow(x2 - x1, 2) + (int)Math.pow(y2 - y1, 2))); // Print and calculate the distance
    }
}
