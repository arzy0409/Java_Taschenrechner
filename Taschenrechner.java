import java.util.Scanner;

public class Taschenrechner {

    // Funktion zur Addition
    public static int addiere(int a, int b) {
        return a + b;
    }

    // Funktion zur Subtraktion
    public static int subtrahiere(int a, int b) {
        return a - b;
    }

    // Funktion zur Multiplikation
    public static int multipliziere(int a, int b) {
        return a * b;
    }

    // Funktion zur Division
    public static double dividiere(int a, int b) {
        if (b == 0) {
            System.out.println("Fehler: Division durch null ist nicht erlaubt!");
            return Double.NaN; // Rückgabe von "Not a Number" bei ungültiger Division
        }
        return (double) a / b;
    }

    // Funktion, um Zahlen in Worten auszugeben
    public static String zahlInWorten(int zahl) {
        String[] worte = {"null", "eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun", "zehn"};
        if (zahl >= 0 && zahl < worte.length) {
            return worte[zahl];
        } else {
            return String.valueOf(zahl);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen beim Taschenrechner!");
        System.out.println("Wähle eine Option:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraktion");
        System.out.println("3 - Multiplikation");
        System.out.println("4 - Division");

        int auswahl = scanner.nextInt();

        System.out.println("Gib die erste Zahl ein:");
        int zahl1 = scanner.nextInt();

        System.out.println("Gib die zweite Zahl ein:");
        int zahl2 = scanner.nextInt();

        switch (auswahl) {
            case 1:
                int summe = addiere(zahl1, zahl2);
                System.out.println("Ergebnis: " + summe + " (" + zahlInWorten(summe) + ")");
                break;
            case 2:
                int differenz = subtrahiere(zahl1, zahl2);
                System.out.println("Ergebnis: " + differenz + " (" + zahlInWorten(differenz) + ")");
                break;
            case 3:
                int produkt = multipliziere(zahl1, zahl2);
                System.out.println("Ergebnis: " + produkt + " (" + zahlInWorten(produkt) + ")");
                break;
            case 4:
                double quotient = dividiere(zahl1, zahl2);
                if (!Double.isNaN(quotient)) {
                    System.out.println("Ergebnis: " + quotient);
                }
                break;
            default:
                System.out.println("Ungültige Auswahl. Bitte starte das Programm neu.");
                break;
        }

        scanner.close();
    }
}

