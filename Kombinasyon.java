import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int n , r;
        double kombinasyon;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kümenin eleman sayısı : ");
        n = inp.nextInt();

        System.out.print("Oluşturulacak grup sayısı : ");
        r = inp.nextInt();

        while (true) {
            if (n < r) {
                System.out.println("n degeri r'den buyuk olmasi lazim tekrar deneyin");
                break;
            }
            int sayac = 1;
            int sayac2 = 1;
            int sayac3 = 1;
            for (int i = 1; i <= n; i++) {
                sayac = sayac * i;
            }

            for (int j = 1; j <= r; j++) {
                sayac2 = sayac2 * j;
            }

            for (int k = 1; k <= (n - r); k++) {
                sayac3 = sayac3 * k;
            }

            kombinasyon = sayac / (sayac2 * sayac3);
            System.out.println("Sonuc: " + kombinasyon);
            break;
        }




    }
}
