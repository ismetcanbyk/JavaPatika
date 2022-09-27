import java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {
        int sayi, top = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("\nSayı gir : ");
        sayi = inp.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                
                top = top + i;
            }

        }

        System.out.println("\n3 ve 4 e bölünen sayıların toplamı = "+top);

    }
}
