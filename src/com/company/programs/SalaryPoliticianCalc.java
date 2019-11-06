package com.company.programs;

// Calculate the salary of a politician
public class SalaryPoliticianCalc {

    public static void main(String[] args) {
        int basicIncome = 100000; // Declare and initialize the metres of cable used
        Out.print("Bitte geben Sie das Geschlecht für männlich mit 1 und weiblich mit 0 an.");
        int gender = In.readInt();
        Out.print("Bitte geben Sie die Anzahl der Reden an.");
        int talks = In.readInt();
        Out.print("Bitte geben Sie die Anzahl Stunden der Sekretariatsarbeit an.");
        int bureacraticWork = In.readInt();
        int bonus = gender == 1 ? 40000 : 50000; // different bonus depending on the gender male gets less
        int talkBonus = talks > 5 ? (5 * 500) + ((talks - 5) * 700) :  talks * 500; // talks are higher paid after the 6th one
        Out.println(basicIncome + bonus + (bureacraticWork) * 200 + talkBonus);
    }
}
