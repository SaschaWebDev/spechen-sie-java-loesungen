package com.company.programs;

// Given seconds by a user input return hours:minutes:seconds
public class TimeCalc {

    public static void main(String[] args) {
        Out.print("Bitte eine Ganzzahl als Sekunden angeben!"); // Give our prompt to user
        int x = In.readInt(); // Read input as integer
        Out.println((x / 3600) + ":" + (x % 3600 / 60) + ":" + (x % 60)); // Divide seconds by 3600 into hours, then only take the remainder through modulo and divide in minutes, then only take the remainder and divide in seconds
    }
}
