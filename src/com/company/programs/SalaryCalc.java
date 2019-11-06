package com.company.programs;

// Calculate the salary
public class SalaryCalc {

    public static void main(String[] args) {
        int metresUsed = In.readInt(); // Declare and initialize the metres of cable used
        int hoursWorked = In.readInt(); // Declare and initiliaze the hours worked
        int coils = metresUsed / 500;
        int rest = metresUsed % 500;
        int cost = coils * 1000 + rest * 3;
        int overtime;
        if (hoursWorked > 40) overtime = hoursWorked - 40;
        else overtime = 0;
        cost = cost + hoursWorked * 50 + overtime * 50;
        Out.println("Verlegte Kabelmeter: " + metresUsed);
        Out.println("Arbeitszeit in Std.: " + hoursWorked);
        Out.println("Kosten:");
        Out.println("  " + coils + " ganze Kabelrollen: " + (coils * 1000));
        Out.println("  " + rest + " angefangene Meter: " + (rest * 3));
        if (hoursWorked > 40) {
            Out.println("  Arbeitszeit:  " + 40 * 50);
            Out.println("  Ueberstunden: " + overtime * 100);
        } else
            Out.println("  Kosten f.Arbeitszeit: " + hoursWorked * 50);
        Out.println("  Gesamtkosten: " + cost);
    }
}
