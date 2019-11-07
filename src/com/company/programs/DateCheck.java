package com.company.programs;

// Given three input variables for day, month, year validate the date with leap-years in mind
public class DateCheck {

    public static void main(String[] args) {
        Out.print("Bitte eine Ganzzahl für den Tag ein!"); // Input prompt to user
        int day = In.readInt(); // Read input as integer
        Out.print("Bitte eine Ganzzahl für den Monat ein!");
        int month = In.readInt();
        Out.print("Bitte eine Ganzzahl das Jahr ein!");
        int year = In.readInt();

        if ((day > 31 || day < 1) || (month > 12 || month < 1) || year < 1) {
            Out.print("Das Datum ist nicht gültig!"); // invalidate all out of plausibility date structures
        } else if (((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) || month == 2 && day > 29) {
            Out.print("Das Datum ist nicht gültig!"); // invalidate wrong days for month with only 30 days and february over 29
        } else if ((year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) && day == 29) {
            Out.print("Das Datum ist nicht gültig!"); // invalidate 29 days for not leap-years
        } else {
            Out.print("Das Datum ist gültig!");
        }
    }
}
