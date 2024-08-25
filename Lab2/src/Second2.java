import java.util.Random;

public class Second2 {
    public static void main(String[] args) {
        Random r = new Random();
        int i;

        System.out.println("a) 5 liczb typu int:");
        for (i=0;i<5;i++){
            int randomInt= r.nextInt();
            System.out.println(randomInt);
        }

        System.out.println("\nb) 10 liczb typu float:");
        for(i=0;i<10;i++){
            float randomFloat = r.nextFloat();
            System.out.println(randomFloat);
        }

        int n=50;
        System.out.println("\nc) 12 liczb z zakresu[0,"+n+"):");
        for (i=0;i<12;i++)
        {
            int randomInRange=r.nextInt(n);
            System.out.println(randomInRange);
        }

        int x=-10;
        int y=20;
        System.out.println("\nd) 15 liczb z zakresu["+x+","+y+"]:");
        for (i=0;i<15;i++){
            int randomInCustomRange = r.nextInt(y-x)+x;
            System.out.println(randomInCustomRange);
        }
    }
}
