package com.company.programs;

// Given three input variables for day, month, year and a another for first day calculate first day of the year
// SIEHE MUSTERLÖSUNG
public class DateWeekCalc {

    public static void main(String[] args) {
        Out.print("Bitte eine Ganzzahl für den Tag ein!"); // Input prompt to user
        int day = In.readInt(); // Read input as integer
        Out.print("Bitte eine Ganzzahl für den Monat ein!");
        int month = In.readInt();
        Out.print("Bitte eine Ganzzahl das Jahr ein!");
        int year = In.readInt();
        int first = In.readInt() - 1;

        // compute the day of the week for the date day.month.year
        Out.print(day + "." + month + "." + year + ": ");

        // compute the day number of the given date
        int n = first + day-1; // 1.1.xxxx should give n == first
        switch (month) {
            case 1:            break;
            case 2:  n += 31;  break;
            case 3:  n += 59;  break;
            case 4:  n += 90;  break;
            case 5:  n += 120; break;
            case 6:  n += 151; break;
            case 7:  n += 181; break;
            case 8:  n += 212; break;
            case 9:  n += 243; break;
            case 10: n += 273; break;
            case 11: n += 304; break;
            case 12: n += 334; break;
        }

        // check for leap years
        if (month > 2 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
            n++;

        // compute the day of the week
        n = n % 7;
        switch (n) {
            case 0: Out.println("Montag");     break;
            case 1: Out.println("Dienstag");   break;
            case 2: Out.println("Mittwoch");   break;
            case 3: Out.println("Donnerstag"); break;
            case 4: Out.println("Freitag");    break;
            case 5: Out.println("Samstag");    break;
            case 6: Out.println("Sonntag");    break;
        }
    }
}