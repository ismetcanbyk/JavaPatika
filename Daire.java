import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        double r , alfa, alan, cevre;

        Scanner inp = new Scanner(System.in);
       
        System.out.print("\nYarı çapı girin :");
        r = inp.nextDouble();

        System.out.print("Merkez açı ölçüsünü girin :");
        alfa = inp.nextDouble();

        alan = (3.14 * (r*r) * alfa) / 360;
        cevre = alfa!=360 ? 2*r + (2 * 3.14 * r * alfa)/360 : (2 * 3.14 * r);

        System.out.println("\nDairenin Alanı : "+alan);
        System.out.println("Dairenin Çevresi : "+cevre);
    }
}
