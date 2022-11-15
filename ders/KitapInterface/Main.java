package KitapInterface;

public class Main {
    public static void main(String[] args) {
        Macera m1 = new Macera("Macera ", 1, "Engin");
        Polisiye p1 = new Polisiye("Polisiye", 12, "ismet");

        m1.yazdır();
        System.out.println("------------------------------------");
        p1.yazdır();
    }
}
