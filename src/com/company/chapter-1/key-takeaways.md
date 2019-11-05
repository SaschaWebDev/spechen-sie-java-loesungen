# Programmieren mit Java

## Allgemein Programmieren
- Programmieren ist kreative Tätigkeit
- Programme sind wie gebaute Objekte, nur immateriell
- Computer arbeiten sequentiell, daher müssen Anweisen sehr präzise sein
- Programmierer denken mit Variablen und Objekten in höherer Abstraktion als Binärform oder Maschinencode
- Tests können keine Korrektheit eines Algoritmus beweisen, nur Fehlerhäufigkeit

## Daten und Befehle
- Ein Programm ist Daten + Befehle
- Daten können Zahlen, Text, Bild oder Video sein
- Befehle sind Operationen auf Daten
- Befehle sind eingeschränkt lassen aber unglaublich komplexe Zusammensetzung zu
- Daten werden im Speicher abgelegt, der mit Adressen angesprochen wird
- Speicher besteht aus Zellen, die Adresse als Name haben und Werte in sich tragen
- 0= 0000 1= 0001 2= 0010 3= 0011 4= 0100 5= 0101 6= 0110 7= 0110 8= 1000 9= 1001 10= 1010 11= 1011 12= 1100 13= 1101 13= 1110 15= 1111
- Ein Bit ist entweder 0 oder 1 und 8 Bits sind ein Byte
- Ein Word sind 2 oder 4 Bytes und 2 Worte sind ein Doppelwort
- Wertzuweiseungen können mit x <- 1 notiert werden
- Programme können auch die Befehle über Wertzuweisung als Daten betrachten
- Entstehen eines Programmes 1. Spezifikation/Lösungsidee -> Programm in Programmiersprache schreiben -> Compiler übersetzt in Maschinensprache -> Binder/Lader speichert es in den Speichert und führt es auf dem Computer aus

## Algorithmen
- Jedes Programm definiert eigenen Algorithmus
- Ein Algorithmus ist wie ein Rezept für das Kochen und ist schrittweise und präzise Formel für das Lösen eines Problems
- Alle Schritte müssen der Reihe nach definiert und eindeutig genau beschrieben werden
- Ein Beispielalgorithmus zum Addieren aller Zahlen bis MaxValue würde lauten:

```Summiere Zahlen
SummiereAlleZahlenBisMax(↓max ↑sum)
1. sum <- 0
2. counter <- 1
3. While counter <= max
        sum <- sum + counter
        counter += counter
```
- Bestandteile eines Algorithmus sind Name, Eingangswerte, Ausgangswerte, Folge von Schritten
- Algorithmen sind universell, können als Pseudocode definiert und in vielen Sprachen umgesetzt werden

## Variablen
- Variablen sind Behälter für Werte und speichern Daten
- Variablen haben Datentypen
- Variablen sind mehrfach zuweisbar
- In der Notation werden Variablen als Rechteckt dargestellt und Zeichen als Kreise und Werte in diese hinengeschrieben

![](assets/variablen.PNG)
## Anweisungen
- Anweisungen nutzen Werte von Variablen um Berechnungen auszuführen

### Wertzuweisung
- Häuftigste Art der Anweisung ist Wertzuweisung y <- x + 1 (Wert von y wird neu zugewiesen)
- Falsche Zuweisungen wären 3 <- x  oder x + y <- x + 1

### Folge (Sequenz)
- Anweisungen werden untereinandergeschrieben in Folge ausgeführt
- In der Notation wird der Kontrollfluss durch einen durchlaufenden Pfeil angedeutet
- Assertions sind Zuwsicherungen die beschreiben welchen Wert eine Variable zu einem Zeitpunkt hat
- Assertions werden mit einer gestrichelten Linie nebem dem Ablaufpfeil angezeigt

![](assets/sequenz.PNG)

### Verzweigung
- Mit Verzweigungen kann man Anweisungen in Entweder-Oder Abläufe teilen
- Bestimmte Anweisungen werden nur ausgeführt wenn die Bedingung der Verzweigung wahr ist
![](verzweigung.PNG

### Schleife(Iteration)
- Schleifen führen dazu das bestimmte Anweisungen bedingt mehrfach ausgeführt werden können
- Schleifen benötigen eine Abbruchsbedingung um die Iteration zu beenden

![](assets/schleife.PNG)
= ![](assets/schleife_kompakt.PNG)

## Beispiele Algorithmen

### Vertauschen von Variablen
- Name und Parameter des Algorithmus werden angegeben
- Dreieck deutet Anfang des Algorithmus an
- Doppelpfeile zeigen das Parameter Ein- und Ausgangsvariablen sind
- h ist eine Hilfsvariable als Zwischenspeicher

![](assets/swap.PNG)
 
 ### Maximum von drei Zahlen berechnen
 - Geschachtelte Verzweigungen können durch mehrere Abfragen komplexe System erzeugen
 
![](assets/max_drei_zahlen.PNG)
  
 ### Anzahl der Ziffern einer Zahl bestimmen
 
![](assets/anzahl_zahl.PNG)
  
### Größter gemeinsamer Teiler zweier Zahlen (GGT)
- Euklidischer Algorithmus der Jahrhunderte Bestand hält
- Erst Rest von Division x durch y
- Wenn Rest=0 dann ist y der GGT
- Ansonsten x durch y teilen und y durch den Rest ersetzen
- Erneut Rest der Division x durch y berechnen

![](assets/ggt.PNG)

- **Der größte gemeinsame Teiler von x und y ist auch der größte gemeinsame Teiler von y und dem Rest von x/y**

### Quadratwurzel aus x berechnen
- Computer rechnen auch mit Gleitkommazahlen
- Genauigkeit der Nachkommastellen wir begrenzt
- Reelle Zahlen kann man nur mit unendlich großen Zahlen von Kommastellen beschreiben
- Computer hat aber begrenzten Speicher und kann nicht unendlich viele Zwischenzahlen berechnen, daher gibt es Abweichungen
- Idee ist es als Näherungswert anzunehmen das root x / 2 ist. (nicht korrekt)
- Danach Berechnung a = x/root, wäre root die Wurzel wäre a=root
- Jedoch ist root etwas größer und a etwas kleiner
- Danach die Mitte zwischen root und a berechnen (root = root + a) / 2
- Neuer Wert von a = x/root
- Dies wird solange wiederholt bis a=root mit akzeptierter Genauigkeit

![](assets/square_root.PNG)
- Schleife besser als |a - root| > 0.00000001 definieren

## Grammatiken
- Nicht prüfungsrelevant








