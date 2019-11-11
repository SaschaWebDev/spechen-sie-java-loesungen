# Programmieren mit Java Chapter 4

## Schleifen

- Viele Algorithmen müssen Berechnungen wiederholt ausführen bis eine Bedingung erfüllt ist
- Java kennt While-Schleife, Do-While-Schleife und For-Schleife

### While-Schleife

- Zählen bis zu einem Maxwert könnte man umständnis sum = 1 + 2 + 3 ... + n schreiben
- Funktioniert so nur für festes n ansonsten muss sum = sum + i genutzt werden
- Bei einer Schleife wird Variable i mit 1 initialisert und in der Schleife um 1 erhöht
- Abbruch der Schleife bei i > n 
- Schleife kann auch gar nicht betreten werden
- Wenn der Schleifenrumpf mehrere Statements ausführen soll muss ein Codeblock {sum = sum +1; i++} genutzt werden
- Ablaufdiagramm einer While-Schleife

![](assets/while.jpg)

- Kann auch für Lesen von Dateien genutzt werden
```
int i = In.readInt();
while (In.done()) {
…
i = In.readInt();
}
```

### Assertions bei Schleifen

- Ereleichtern durch Visualisierung der Schleifenbedingungen als Kommentare einer SChleife das Verständnis


### Schleifenvariante

- Komplizierter als Assertion
- Gibt das Ergebnis einer Schleife an die bei jedem Durchlauf gleichbleibt
- // sum == Summe(i .. i - 1)
- Korrektheit des Programmes kann somit bewiesen werden und ist wertvoller als ein Test
- Wird in der Praxis kaum durchgeführt, da es sehr aufwändig ist

```
i = 1; sum = 0;
while (i <= n) {
// sum == Summe(1..i-1)
sum = sum + i;
// sum == Summe(1..i)
i = i + 1;
// sum == Summe(1..i-1)
}
```

### Do-While-Schleife 

- Unterschied zu weil, dass erst die Anweisung und danach am Ende die Abbruchbedingung genannt wird
- Der Rumpf wird daher immer einmal mindestens durchlaufen werden

```
int n = In.readInt();
do {
Out.print(n % 10);
n = n / 10;
} while (n > 0);
```

![](assets/do-while.jpg)

### For-Schleife

- Ist eine Zählschleife die genauer gesteuert werden kann
- Besteht aus Initialisierung der Laufvariable vor Betreten der Schleife
- Besteht aus Abbruchbedingung die vor jedem Durchlauf geprüft wird
- Besteht aus Inkrementierung der Laufvariable
- Besteht aus Schleifenrump zur bedingten Ausführung

![](assets/for.jpg)

```
int n = In.readInt(); // n == number of lines and columns
for (int i = 1; i <= n; i++) { // for all lines
for (int j = 1; j <= n; j++) // for all columns
Out.print(i * j + " ");
Out.println();
}
```

### Abbruch von Schleifen

- Wenn weitere Ausführungen einer Schleife unnötig sind kann mit break; weitere Durchläufe verhindert werden
- Sollte man jedoch vermeiden, da es Komplexität des Codes erhöht
- Mit break kann man nicht nur die unmittelbar umgebende Schleife verlassen, sondern auch die äußere Schleifen sondern diese mit einer Marke(Label) gekennzeichnet ist
```
L: // label
for (;;) { // infinite loop
…
for (;;) {
…
if (…)
    break; // terminates inner loop
else
    break L; // terminates outer loop
    }
}
```

### Vergleich der Schleifenarten

- Verwendung der Schleifenart hängt von Problem und Herangehensweise ab
- Muss vor Rumpf bereits auf Abbruch geprüft werden oder muss der Rumpf mindestens einmal durchlaufen werden?

![](assets/schleifenarten.jpg)













