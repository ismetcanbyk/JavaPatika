import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double gidilenKm, tutar=10 ;

        Scanner inp = new Scanner(System.in);

        System.out.print("Gidilen Km :" );
        gidilenKm = inp.nextDouble();

        tutar = (gidilenKm*2.20)+10 <= 20 ? 20 :  (gidilenKm*2.20)+10;


        System.out.println("\nGidilen Yol : "+ gidilenKm + " Km");
        System.out.println("Ödenecek Tutar : " +tutar);
    }
}
