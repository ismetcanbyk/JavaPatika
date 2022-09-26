import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlıcan, toplam;
        Scanner inp = new Scanner(System.in);

        System.out.print("\nArmut Kaç Kilo ? = ");
        armut = inp.nextDouble();

        System.out.print("Elma Kaç Kilo ? = ");
        elma = inp.nextDouble();

        System.out.print("Domates Kaç Kilo ? = ");
        domates = inp.nextDouble();

        System.out.print("Muz Kaç Kilo ? = ");
        muz = inp.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? = ");
        patlıcan = inp.nextDouble();

        toplam = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlıcan * 5);

        System.out.println("Toplam Fiyat : " + toplam);

    }
}
