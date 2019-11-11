# Chapter 4 - Exercises

### 1) Schleifenterminierung, welche der Schleifen wird terminiert?

![](assets/terminierung.JPG)

- a terminiert, da j hochgezählt wird und in i gespeichert wird. Damit wird i großer als 200 werden.
- b terminiert, da i um zwei erhöht wird aber j nur ein eins vermindert wird. i + j wird größer 200 werden.
- c terminiert, da int beide auf 1 am Ende rundet.

### 2) Anzahl der Ziffern einer Zahl als Java Programm für ganzzahlige und positive Zahl.

```
// Given one input variable as a positive integer the program prints the amount of numbers it contains
public class IntCountNumber {

    public static void main(String[] args) {
        Out.print("Bitte eine Ganzzahl für die Nummer ein!"); // Input prompt to user
        int input = In.readInt(); // Read input as integer
        int amount = 1;

        while (input > 10) {
            amount++;
            input = input / 10;
        }
        Out.print(amount);
    }
}
```

### 3) 

