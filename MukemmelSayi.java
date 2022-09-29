import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int sayi, top = 0, mod;
        Scanner inp = new Scanner(System.in);

        System.out.print("\nBir sayı giriniz : ");
        sayi = inp.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                top = top + i;
            }

        }
        if (top == 1) {
            System.out.println(sayi + " Mükkemel Sayı Değildir .");
        } else if (top == sayi) {
            System.out.println(sayi + " Mükkemel Sayıdır .");
        } else {
            System.out.println(sayi + " Mükkemel Sayı Değildir .");
        }
    }
}
