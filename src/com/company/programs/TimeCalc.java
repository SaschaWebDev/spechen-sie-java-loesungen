package com.company.programs;

// Anzahl in Sekunden in Stunden:Minuten:Sekunden zurückgeben
public class TimeCalc {

    public static void main(String[] args) {
        Out.print("Bitte eine Ganzzahl als Sekunden angeben!"); // Gebe Ausgabeaufforderung aus
        int x = In.readInt(); // Lese Eingabe als Integer ein
            Out.println((x / 3600) + ":" + (x % 3600 / 60) + ":" + (x % 60)); // Sekunden in Stunden Division 3600, dann nur den Restwert Division in Minuten und dann nur den Restwert Division in Sekunden
    }
}
