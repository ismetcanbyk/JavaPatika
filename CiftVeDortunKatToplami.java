import java.util.Scanner;

public class CiftVeDortunKatToplami {
    public static void main(String[] args) {
        int sayi, toplam = 0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Sayi girin :");
            sayi = inp.nextInt();

            if (sayi % 2 ==0 && sayi % 4 == 0) {
                toplam = sayi + toplam;
            }
        } while (sayi % 2 == 0);
        
        System.out.println("Toplam : "+toplam);
    }
}
