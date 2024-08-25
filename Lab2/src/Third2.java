import java.util.InputMismatchException;
import java.util.Scanner;

public class Third2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0, b = 0, c = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Podaj współczynnik a:");
                a = sc.nextDouble();
                System.out.println("Podaj współczynnik b:");
                b = sc.nextDouble();
                System.out.println("Podaj współczynnik c:");
                c = sc.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Niepoprawny format. Wprowadź liczby.");
                sc.next();
            }
        }

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Równanie jest tożsamością - ma nieskończenie wiele rozwiązań.");
                } else {
                    System.out.println("Równanie jest sprzeczne - brak rozwiązań.");
                }
            } else {
                double x = -c / b;
                System.out.println("Równanie liniowe. Rozwiązanie: x = " + x);
                System.out.println("Sprawdzenie: " + (b * x + c == 0 ? "Równanie spełnione." : "Równanie nie spełnione."));
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Równanie kwadratowe ma dwa pierwiastki rzeczywiste:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);

                System.out.println("Sprawdzenie dla x1: " + (Math.abs(a * x1 * x1 + b * x1 + c) < 1e-6 ? "Równanie spełnione." : "Równanie nie spełnione."));
                System.out.println("Sprawdzenie dla x2: " + (Math.abs(a * x2 * x2 + b * x2 + c) < 1e-6 ? "Równanie spełnione." : "Równanie nie spełnione."));
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Równanie kwadratowe ma jeden pierwiastek rzeczywisty:");
                System.out.println("x = " + x);

                System.out.println("Sprawdzenie dla x: " + (Math.abs(a * x * x + b * x + c) < 1e-6 ? "Równanie spełnione." : "Równanie nie spełnione."));
            } else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-delta) / (2 * a);
                System.out.println("Równanie kwadratowe ma dwa pierwiastki zespolone:");
                System.out.println("z1 = " + realPart + " + " + imaginaryPart + "i");
                System.out.println("z2 = " + realPart + " - " + imaginaryPart + "i");

                double checkReal1 = a * (realPart * realPart - imaginaryPart * imaginaryPart) + b * realPart + c;
                double checkImaginary1 = 2 * a * realPart * imaginaryPart + b * imaginaryPart;
                double checkReal2 = a * (realPart * realPart - imaginaryPart * imaginaryPart) + b * realPart + c;
                double checkImaginary2 = -2 * a * realPart * imaginaryPart - b * imaginaryPart;

                System.out.println("Sprawdzenie dla z1:");
                System.out.println("Część rzeczywista: " + checkReal1);
                System.out.println("Część urojona: " + checkImaginary1);
                System.out.println("Sprawdzenie dla z2:");
                System.out.println("Część rzeczywista: " + checkReal2);
                System.out.println("Część urojona: " + checkImaginary2);
            }
        }
    }
}

