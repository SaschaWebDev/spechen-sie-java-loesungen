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

### 7) Schreiben Sie ein Java-Programm, das eine Anzahl von Sekunden einliest und die Anzahl von Stunden, Minuten und Sekunden umrechnet und ausgibt. DIe Eingabe 1234 soll also zur Ausgabe von 0:20:34 führen. Testen Sie mit 0, 59, 60, 100, 3600 und 4000.

### Programme

### 8) Programm zur Eingabe von Sekundenanzahl zur Ausgabe in Stunden:Minuten:Sekunden
```
// Anzahl in Sekunden in Stunden:Minuten:Sekunden zurückgeben
public class TimeCalc {

    public static void main(String[] args) {
        Out.print("Bitte eine Ganzzahl als Sekunden angeben!"); // Gebe Ausgabeaufforderung aus
        int x = In.readInt(); // Lese Eingabe als Integer ein
            Out.println((x / 3600) + ":" + (x % 3600 / 60) + ":" + (x % 60)); // Sekunden in Stunden Division 3600, dann nur den Restwert Division in Minuten und dann nur den Restwert Division in Sekunden
    }
}
```

### 12) Welche Behauptungen sind richtig? Benannte Konstanten static final int PI = 3.14 sollte man benutzen weil

- Programme dadurch leichter änderbar werden
- Programme lesbarer werden









