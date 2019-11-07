package com.company.programs;

class LineInersectionCalc {

    public static void main(String[] arg) {
        int ax1 = In.readInt();  // line a: [(ax1,ay1), (ax2,ay2)]
        int ay1 = In.readInt();
        int ax2 = In.readInt();
        int ay2 = In.readInt();
        int bx1 = In.readInt();  // line b: [(bx1,by1), (bx2,by2)]
        int by1 = In.readInt();
        int bx2 = In.readInt();
        int by2 = In.readInt();

        // check for valid input data
        if (ax1 != ax2 && ay1 != ay2) Out.println("a muss horizontal oder vertikal sein");
        else if (bx1 != bx2 && by1 != by2) Out.println("b muss horizontal oder vertikal sein");
        else {

            // normalize so that x1 <= x2 and y1 <= y2
            int h;
            if (ax1 > ax2) {h = ax1; ax1 = ax2; ax2 = h;} // ay1 == ay2
            if (ay1 > ay2) {h = ay1; ay1 = ay2; ay2 = h;} // ax1 == ay1

            // check if a and b intersect
            Out.print("[("+ax1+","+ay1+"),("+ax2+","+ay2+")] schneidet ");
            Out.print("[("+bx1+","+by1+"),("+bx2+","+by2+")] ");
            if (bx1 > ax2 || bx2 < ax1 || by1 > ay2 || by2 < ay1)
                Out.println("nicht");
            else
                Out.println();

        }
    }
}