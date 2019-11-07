package com.company.programs;

// Given three input variables sort them and output them in order
public class SortThreeInts {

    public static void main(String[] args) {
        Out.print("Bitte eine Ganzzahl a ein!"); // Input prompt to user
        int a = In.readInt(); // Read input as integer
        Out.print("Bitte eine Ganzzahl b ein!");
        int b = In.readInt();
        Out.print("Bitte eine Ganzzahl c ein!");
        int c = In.readInt();

        if (a < b) {
            if (b < c) { // a < b && b < c
                Out.println(String.format("a %s b %s c %s", a, b, c));
            } else { // a < b && c <= b
                if (a < c) { // a < c && c <= b
                    Out.println(String.format("a %s c %s b %s", a, c, b));
                } else { // c <= a && a < b
                    Out.println(String.format("c %s a %s b %s", c, a, b));
                }
            }
            // b <= a
        } else {
            if (a < c) { // b <= a && a < c
                Out.println(String.format("b %s a %s c %s", b, a, c));
            } else { // b <= a && c <= a
                if (b < c) { // b < c && c <= a
                    Out.println(String.format("b %s c %s a %s", b, c, a));
                } else { // c <= b && b <= a
                    Out.println(String.format("c %s b %s a %s", c, b, a));
                }
            }
        }
    }
}
