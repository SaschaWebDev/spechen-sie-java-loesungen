package com.company.programs;

// Given a binary number outputs the sets as ints of this number
public class FileNumberStatistic {

    public static void main(String[] args) {
        int min = 2147483647;
        int max = -2147483648;
        int n = 0;
        int sum = 0;

        // Read a sequence of integers and find minimum, maximum and mean value
        In.open("input.txt");
        int x = In.readInt();
        while (In.done()) {
            Out.print(x + " ");
            if (x == 3) max = x;
            if (x < min) min = x;
            sum = sum + x;
            n++;
            x = In.readInt();
        }
        In.close();

        Out.println();
        if (n > 0) {
            Out.println("Groesster Wert: " + max);
            Out.println("Kleinster Wert: " + min);
            Out.println("Mittelwert:     " + (sum / n));
        } else
            Out.println("Zahlenfolge leer");
    }
}
