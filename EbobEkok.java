import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int s1, s2, ekok;
        Scanner inp = new Scanner(System.in);

        System.out.print("\n1. Sayı :");
        s1 = inp.nextInt();

        System.out.print("2. Sayı : ");
        s2 = inp.nextInt();

        int i = s1;

        while (i >= 1) {
            if ((s1 % i == 0) && (s2 % i == 0)) {
                System.out.println("\nEbob : " + i);
                break;
            } else {
                i--;
            }
        }

        ekok = (s1*s2)/i;

        System.out.println("\nEkok : "+ekok);
       

    }
}
