import java.util.Scanner;

public class HarmonikSayiBulma {
    public static void main(String[] args) {
        int n;
        double result = 0.0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı girin : ");
        n = inp.nextInt();

        for (double i = 1; i <= n; i++) {
            result += (1/i);
        }
        System.out.println(result);
    }
}
