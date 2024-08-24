import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
            System.out.println("Podaj liczbę dla a: ");
            a = sc.nextInt();
        do {
            System.out.println("Podaj liczbę dla b: ");
            b = sc.nextInt();
        }
        while(b==0);
        int sum, roz,iloc,ilor,mod;
        sum=a+b;
        roz=a-b;
        iloc=a*b;
        ilor=a/b;
        mod=a%b;
        System.out.println("Wyniki dla liczb "+a+" i "+b+":");
        System.out.println("Suma:"+sum);
        System.out.println("Różnica:"+roz);
        System.out.println("Iloczyn:"+iloc);
        System.out.println("Iloraz:"+ilor);
        System.out.println("Modulo:"+mod);
    }
}
