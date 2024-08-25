import java.util.Scanner;

public class First2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = 0;
        boolean validInput = false;

        do {
            System.out.println("Podaj wartość dla x: ");
            if (sc.hasNextDouble()) {
                x = sc.nextDouble();
                if (x <= 1) {
                    System.out.println("Błąd: log(x-1) wymaga, aby x > 1.");
                    validInput = false;
                } else if (Math.sin(x) == 0) {
                    System.out.println("Błąd: Działanie prowadzi do dzielenia przez zero w tan(x) lub log(sin(x)).");
                    validInput = false;
                } else {
                    validInput = true;
                }
            } else {
                System.out.println("Niepoprawna wartość. Wprowadź liczbę.");
                sc.next();
                validInput = false;
            }
        } while (!validInput);

        double licznik = (Math.log(x - 1) / Math.log(x))
                + Math.cbrt(1 / Math.tan(x))
                + Math.ceil(Math.pow(3, x))
                + Math.exp(Math.pow(x, 3));

        double mianownik = Math.tan(x)
                + Math.log(Math.abs(Math.sin(x)))
                + Math.pow(Math.PI, x);

        double y = licznik / mianownik;

        System.out.println("Wynik dla x = " + x + " wynosi: " + y);
    }
}

