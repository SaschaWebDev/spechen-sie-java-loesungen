# Chapter 2 - Exercises

### 1) Welche Namen sind gültig in Java?
- maxvalue (Syntaktisch korrekt Convention Nein)
- maxValue (Syntaktisch korrekt Convention Ja)
- max_value (Syntaktisch korrekt Convention Nein)
- max value (Syntaktisch inkorrekt keine Leerzeichen erlaubt)
- end (Syntaktisch korrekt Convention Nein)
- End (Syntaktisch korrekt Convention Nein)
- 10%ofSum (Syntaktisch inkorrekt keine Operatoren in Variablennamen)
- sum10 (Syntaktisch korrekt Convention evtl präziser benennen)
- _10PercentOfSum (Syntaktisch korrekt Convention Nein

### 2) Ausdrücke gegeben long a=3; int b=4; short c=5; byte d=6; Welche Werten liefern folgende Ausdrücke und welchen Datentyp?
- d / b * a  -> Komma wird nicht genutzt Punkt vor Strich, Links nach Rechts 1*2=**long 3** 
- c + b * (d + 1) -> Erst Klammer dann Punkt vor Strich **int 33**
- d / (c-1) * b / 2 -> Komma nicht genutzt (1 * 4) / 2 ist **int 2**
- d % b -> 6 Module 4 Rest ist **int 2**
- -c % b -> -5 Modulo 4 ist **int -1**
- c++ % d -> 5 Modulo 6 ist **int 5** ++ wird erhöht erst danach c um 1

### 3) Welche Zuweisungen sind in Java erlaubt?
- a = b + 3 * (d + 1) -> erlaubt
- b = c * c -> erlaubt
- c = b / 3 -> muss zu short gecasted werden
- d = (byte) a + b -> Cast muss beides jeweils umklammern
- d = (byte)(a + b) -> erlaubt

### 4) Schreiben Sie den Ausdruck x % 8 * 4 so rum, dass der statt % und * den Shift-Operator nutzt.
- (x-(x>>3<<3))<<2  Modulo 8 ist Division und Mulitiplikation mit dritter Zweiterpotenz, abzug x von zweiter Zweierpotenz als Multiplikation.

### 5) Schreibe einen Java Ausdruck der eine Zahl x auf das nächstliegende Vielfache von 100 rundet. Wert 149 soll zu 100 werden und 150 auf 200 aufgerundet werden.

- (x + 50) / 100 * 100 -> 50 für Klassifizierung in 50er Block, Teilen des int schneidet Nachkommastellen ab und erhöht den Wert in gleiches Niveau ohne Rest.

### 6) Schreibe einen Java Ausdruck der eine Zahl x mittels Shift-Operation auf das nächstgrößere Vielfache von 8 rundet. Wenn bereits durch 8 teilbar soll Wert erhalten bleiben.

- (x + 7) >> 3 << 3 -> +7 um in die nächste Vielfache von 8 Klasse zu pushen. Danach dritte Zweierpotenz als Modulo 8, gibt bei durch 8 teilbar Rest 8 zurück.

### Programme

### 7) Schreiben Sie ein Java-Programm, das eine Anzahl von Sekunden einliest und die Anzahl von Stunden, Minuten und Sekunden umrechnet und ausgibt. DIe Eingabe 1234 soll also zur Ausgabe von 0:20:34 führen. Testen Sie mit 0, 59, 60, 100, 3600 und 4000.

```
// Given seconds by a user input return hours:minutes:seconds
public class TimeCalc {

    public static void main(String[] args) {
        Out.print("Bitte eine Ganzzahl als Sekunden angeben!"); // Give our prompt to user
        int x = In.readInt(); // Read input as integer
        Out.println((x / 3600) + ":" + (x % 3600 / 60) + ":" + (x % 60)); // Divide seconds by 3600 into hours, then only take the remainder through modulo and divide in minutes, then only take the remainder and divide in seconds
    }
}
```

### 8) Schreiben Sie ein Programm zur Polynomberechnung für Koeffizienten a, b, c, d und x des Polynomns und als Ergebnis y ausgibt. y = a * x^3 + b * x^2 + c * x + d
```
// Polynom Calculation
public class PolynomCalc {

    public static void main(String[] args) {
            int a, b, c, d, x, y; // Declaring all the used variables
                 Out.print("Bitte eine Ganzzahl für a eingeben!");
                a = In.readInt(); // Read each variable Input as user
                Out.print("Bitte eine Ganzzahl für b eingeben!");
                b = In.readInt();
                Out.print("Bitte eine Ganzzahl für c eingeben!");
                c = In.readInt();
                Out.print("Bitte eine Ganzzahl für d eingeben!");
                d = In.readInt();
                Out.print("Bitte eine Ganzzahl für x eingeben!");
                x = In.readInt();
                Out.println((int)Math.pow(a, 3) + (int)Math.pow(b, 2) + c * x + d); // Print and calculate the polynom division with Math.pow
    }
}

```

### 9) Berechne Abstand zwischen Punkten von zwei eingelesenen Werten x und y. Die ganzzahlige Wurzel kann man als (int)Math.sqrt(x) berechnen

```
// Calculate distance between x and y values as points
public class DistanceCalc {

    public static void main(String[] args) {
        int x1, y1, x2, y2; // Declare all the value for two points
        x1 = In.readInt(); // Read one by one the values for the coordinates
        y1 = In.readInt();
        x2 = In.readInt();
        y2 = In.readInt();
        Out.println((int) Math.sqrt((int)Math.pow(x2 - x1, 2) + (int)Math.pow(y2 - y1, 2))); // Print and calculate the distance
    }
}
```

### 10) Gebe an wie viele Meter Kabel und wie viele Stunden genutzt worden sind. Kostenberechnung daraus: 500 Meter Kabel 2€ angefangene Kabeltrommel 3€ pro Meter, Stundensatz 50 €, mehr als 40 Stunden gearbeitet, bei Überstunden doppelter Stundensatz.

```
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
```

### 11) Grundeinkommen von 100000 €, Zuschäge von 40000 € Herr Clever und 50000 € Frau Clever. Jede Rede sind 500 €, aber der 6. Rede 700€. Sekreatariatsarbeit 200€. Schreibe Programm das aus Reden und Arbeit das Einkommen berechnet.
```
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
```

### 12) Welche Behauptungen sind richtig? Benannte Konstanten static final int PI = 3.14 sollte man benutzen weil

- Programme dadurch leichter änderbar werden
- Programme lesbarer werden









