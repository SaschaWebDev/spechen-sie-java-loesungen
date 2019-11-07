# Chapter 3 - Exercises

### 1) Schreiben Sie ein Java-Programm das drei Werte x, y und z einliost und prüft ob x,y und z nicht nur gleiche werte enthalten, ob alle drei nur verschiedene Werte enthalten und ob mindestens zwei Werte gleich sind.

```
// Given three input variables check them for equal, difference and if two are the same
public class ValueComparism {

    public static void main(String[] args) {
        Out.print("Bitte eine Ganzzahl x ein!"); // Input prompt to user
        int x = In.readInt(); // Read input as integer
        Out.print("Bitte eine Ganzzahl y ein!");
        int y = In.readInt();
        Out.print("Bitte eine Ganzzahl z ein!");
        int z = In.readInt();
        if (x == y && y == z) { // case all are the same
            Out.println("The given inputs are all of the same value.");
        } else if ( x != y && y != z) { // case none are the same
            Out.println("All the given inputs are distinct values.");
        } else { // only three given so this needs to be the case otherwise
            Out.println("Two given input values are of the same value.");
        }
    }
}
```

### 2) Schreiben Sie ein Java-Programm, das die Seitenlängen eines Dreiecks einliest und prüft ob es ein gleichseitiges oder gleichschenkliges oder rechtwinkliges, oder ein sonst gültiges oder kein Dreieck ist. Ein Dreieck ist ungültig wenn die Summe zweier Seitenlängen kleiner oder gleich der dritten Seitenlänge ist. Dreiecke können rechtwinklig und gleichschenklig sein.

```
// Given three input variables check them for their attributed of a geometric triangle
public class TriangleCalc {

    public static void main(String[] args) {
        Out.print("Bitte eine Ganzzahl x als Seitenlänge des Dreiecks ein!"); // Input prompt to user
        int x = In.readInt(); // Read input as integer
        Out.print("Bitte eine Ganzzahl y als Seitenlänge des Dreiecks ein!");
        int y = In.readInt();
        Out.print("Bitte eine Ganzzahl z als Seitenlänge des Dreiecks ein!");
        int z = In.readInt();
        if (x + y <= z || x + z <= y || y + z <= x) { // case invalid triangle
            Out.println("Eingabe eines ungültigen Dreiecks, zwei Seitenlängen kumuliert kleinergleich dritter Seitenlänge.");
        } else if (x == y && y == z) { // all triangle lengths are the same
            Out.println("Eingabe eines gleichseitigen Dreiecks.");
        } else if ((x == y || x == z || y == z) && (x * x + y * y == z * z || x * x + z * z == y * y || y * y + z * z == x * x)) { // isosceles and right triangle
            Out.println("Eingabe eines gleichschenkligen und rechtwinklingen Dreiecks.");
        } else if (x == y || x == z || y == z) { // isosceles triangle
            Out.println("Eingabe eines gleichschenkligen Dreiecks.");
        } else if (x * x + y * y == z * z || x * x + z * z == y * y || y * y + z * z == x * x) { // right triangle
            Out.println("Eingabe eines rechtwinkligen Dreiecks.");
        } else {
            Out.println("Eingabe eines sonstig gültigen Dreiecks."); // valid triangle
        }
    }
}
```

### 3) Vereinfachung boolescher Ausdrücke mit der DeMorgan Regel.

- !(x < y && y < z) -> **(x >= y || y >= z)**
- (x != y) || !(y == z && y == x) -> **(x != y || y != z || y != x => x != y || y != z)**
- !(x >= -3 && x <= 0) && 5 < x  -> **(x < -3 || x > 0) && 5 < x => x > 5**

### 4) Weisen sie folgenden boorlischen Varibalen mit den inputs für x mit -1, 0, 5 und 10 den Wahrheitswerten zu.

int x = ln.readInt();
- boolean a = x > 0 && x <= 10
- boolean b = x < 5 || x > 9
- boolean c = !(b || a)

|x              | a                            | b                                      | c         |
| ------------- |:-------------:               | -----:                                 | -----:    |
| -1            | -1 nicht größer 0 = **false**|  **true**                              | **false** |
| 0             | 0 nicht größer 0 = **false** |   **true**                             | **false** |
| 5             | **true**                     |    5 !kleiner 5, !größer 9 = **false** | **false** |
| 10            | **true**                     |    **true**                            | **false** |

- Zu boolean c -> b || a existieren, daher nach b bereits true, negierung macht es immer zu false

### 5) Gebe Bedingungen für Assertions /*a*/, /*b*/, /*c*/ und /*d*/ für folgendes Programmstück an.

```
if (i > p) {
    if (i < q) /*a*/... else /*b*/
} else {
    if (i > r) /*c*/ ... else /*d*/
}
```

- a gilt p kleiner i und i kleiner q
- b gilt p kleiner i und i größergleich q
- c gilt i kleinergleich p und i größer r
- d gilt i kleinergleich p und i kleinergleich r

### 6) Welche Behauptungen stimmen bei der Kurschlussausertung von if (a && b) x = 0, was ist Äquivalent?

- if (a) if (b) x = 0; da der UND Operator erfordert, dass beide variablen wahr sein müssen bevor x zugewiesen wird

### 7) Sortieren dreier Zahlen mit einem Java-Programm mittels if und else und Assertions als Kommentare.

```
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
```
