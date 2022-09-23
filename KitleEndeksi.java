import java.util.Scanner;;

public class KitleEndeksi {
    public static void main(String[] args) {
        double boy, kilo, endeks;
        Scanner inp = new Scanner(System.in);

        System.out.print("\n\nBoyunuzu Giriniz (metre olarak) :");
        boy = inp.nextDouble();

        System.out.print("Kilonuzu Giriniz :");
        kilo = inp.nextDouble();

        endeks = kilo / (boy*boy);

        System.out.println("Vücut Kitle Endeksi : "+endeks);


    }
}
