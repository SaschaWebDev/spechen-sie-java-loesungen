# Programmieren mit Java Chapter 2

## Einfache Programme
- Java ist eine moderne Programmiersprache
- Weite Verbreitung und sehr portabel für alle Maschinen dank jvm
- Objektierung, Komponenten, Parallelität und Exceptions werden unterstützt

## Grundsymbole
- Programme bestehen aus Namen, Keywords, Zahlen, Zeichenketten etc

### Namen

- Für Variablen, Konstanten, Typen und Methoden
- Bestehen aus Buchstaben oder Ziffern
- Erster Buchstabe muss Zeichen, _ oder $ sein (x x12 totalSum total_Sum)

### Keywords

- Es gibt reservierte Wörter wie if oder while die nicht als Variablennamen genutzt werden können
- Alle Keywords sind lowercase
- Folgende Worte sind in Java reserviert:

![](assets/keywords.PNG)

### Zahlen

- Ganze Zahlen können Dezimal, Hexadezimal, Binärkonstanten sein
- Dezimalzahl (0, 1000, 376)
- Hexadezimalzahl (0-9 für A-F) beginnen mit 0x (0x1A5 = 1 * 16^2 + 10 * 16^1 + 5 * 16^0) und entspricht 421
- Binärzahlen (0-1) beginnen mit 0b (0b101 = 1 * 2^2 + 0 * 2^1 + 1 * 2^0 = 5)
- Man darf in Zahlen Unterstriche einfügen, die ignoriertwerden aber zum lesen helfen (1_000_000 0x1a_c0 0b1000_0010)

### Zeichen

- Buchstaben, Ziffern und Sonderzeichen mit single quotes umklammert ('x' '+' '3')

### Zeichenketten

- Strings werden durch DoubleQuotes eingeklammert ("hallo")
- Strings dürfen Leerzeichen und Sonderzeichen enthalten
- Strings dürfen Zeilenenden nicht überschreiten
- NewLine \n 
- Escaping \"
- Inverser Schrägstrich \\

## Variablendeklaration

- Variablen müssen vor zuweisung deklariert werden int x; z.B. als Ganzzahl
- Es wird genügend Speicher für die Variable reserviert
- Es können auch viele Variablen in einer Zeile deklariert werden short x, y, z;

## Datentypen

- Datentypen definieren eine Menge von Werten die zum Typ gehören wie alle Ganzzahlen
- Datentypen definieren eine Menge von Operation die auf die Werte erlaubt sind
- Compiler kann sicherstellen nur erlaubte Werte zu erhalten und Programmierfehler vermeiden
- Je nach Datentypen können bei Zahlen nur begrenzte Werte gespeichert werden
- byte 8-Bit-Zahl: -2^7 - 2^7-1 (-128 bis 127)
- short 16-Bit-Zahl: -2^15 - 2^15-1 (-32768 bis 32767)
- int 8-Bit-Zahl: -2^31 - 2^31-1 (-2147483648 bis 2147483647)
- long 8-Bit-Zahl: -2^63 - 2^63-1
- long beinhaltet alle int beinhaltet alle short beinhaltet alle byte

## Initialisierung von Variablen

- Deklaration geht auch mit direkter Zuweisung int x = 100;
- Multiinitialisierung möglich mit int x = 100, y = 200;

## Kommentare

- Kommentare beschreiben Code und Programmstellen
- Wird vom Compiler ignoriert und verlangsamt ein Programm nicht
- Englische Kommentar sind oft kürzer, präziser, besser im Kontext und verbreiteter nutzbar
- Single Line Kommentar //
- Multi Line Kommentar /* */

## Zuweisung

- Eine Zuweisung gibt einer Variable einen berechneten Wert x = y + 1; // "x wird zu y plus 1"
- Der Zuweisungsoperator ist das =
- Nicht initialisierte und nur deklarierte Variablen können nicht zugewiesen werden
- Statische Typprüfung testet ob Variable nur erlaubte Wert enthält und Werte nur erlaubte Operationen ausführen

## Arithmetische Ausdrücke

- (3 + x * y)

### Binäre Operation
- Addition mit +
- Substration mit -
- Multiplikation mit *
- Division mit /
- Modulo mit %
- Es gilt Klammern vor Punktrechnung (Mal, Division, Modulo) vor Strichrechnung (+, -)
- Gleichrangiges wird von links nach rechts ausgeführt (3-2-1 (3-2) -1 = 0)
- Operanden eines ganzahligen Ausdrucks müssen vom Typ long, int, short oder byte sein
- Ist mindestens ein Operand long ist das Ergebnis long, ansonsten ist es int
- Zahlenkonstanten sind immer int
- Casten von Typen durch short s = (short)(i +2)
- Beim Casten werden von int zu short die ersten zwei Bytes abgeschnitten, bei ints mit mehr als zwei Bytes werden diese verstümmelt

### Unäre Operation

- Arithmetische Ausdrücke können nur mit + und - als unäre Operatoren ausgeführt werden
- Identitätsoperator +, ein +x ist ein x
- Vorzeichenumkehrer -, ein -x ist negativ

### Inkrement und Dekrement

- x++ Postfix, erst Operationen ausführen dann Wert von x um eins inkrementieren
- x-- Postfix, erst Operationen ausführen dann Wert von x um eins dekrementieren
- ++x Präfix, erst Wert von x um eins inkrementieren, dann Operation ausführen
- --xPräfix, erst Wert von x um eins dekrementieren, dann Operation ausführen
- Können nur auf Variablen und nicht auf ganze Statements angewendet werden (x*y)++ ist falsch

### Multiplikation und Division mittels Shift-Operator

- Mit den Shift-Operatoren sind schnelle Multiplikation und Division für Zweierpotenzen (2, 4, 8, 16) möglich
- << Shift left (Multiplikation mit 2^i) (3 << 2 = 12) (0011 << 2 = 1100)
- << Shift right (Division durch 2^i) (7 >> 1 = 3) (0111 >> 1 = 0011)
- 3<<2 schiebt das Bitmuster von 3 um zwei Stellen nach link und entspricht damiit Multiplikation 2^2
- 7>>1 schiebt das Bitmuster von 7 um eine Stelle nach recht was Division durch 2^1 entspricht
- Ist schneller als eine echte Multiplikation aber unlesbarer

### Zuweisungsoperator
- x = x + y wäre eine Zuweisung mit Berechnung
- Es gibt die Operatoren + - * / %
- Kurzform der Zuweisung ist x+=y x-=y x*=y x/=y x%=y
