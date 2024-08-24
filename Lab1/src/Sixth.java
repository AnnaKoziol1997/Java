import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilość galonów: ");
        double gal=sc.nextDouble();
        double l = gal*4.54609;
        System.out.println(gal+" galonów wynosi "+l+" litrów");
    }
}
