import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int s1, us, s2=1;
        Scanner inp = new Scanner(System.in);

        System.out.print("\nTabanı girin : ");
        s1 = inp.nextInt();

        System.out.print("Üssü girin : ");
        us = inp.nextInt();


        for (int i = 1; i <= us; i++) {
            s2 = s2*s1;
        }
        System.out.println("\nSonuç = "+s2);
    }
}
