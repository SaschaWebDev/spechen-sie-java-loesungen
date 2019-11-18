package com.company.programs;

// Given a binary number outputs the sets as ints of this number
public class BinaryToInt {

    public static void main(String[] args) {
        Out.print("Bitte eine Binaerzahl ein!"); // Input prompt to user
        int binary = In.readInt(); // Read input as integer

            Out.print('{');
            int pos = 0;
            boolean first = true;
            while (binary > 0) {
                if (binary % 2 == 1) {
                    if (first) first = false; else Out.print(',');
                    Out.print(pos);
                }
                binary = binary / 2; pos++;
            }
            Out.println('}');
    }
}
