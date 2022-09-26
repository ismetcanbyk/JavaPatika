import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        int s1, s2, s3;
        Scanner inp = new Scanner(System.in);

        System.out.print("1. Sayı : ");
        s1 = inp.nextInt();

        System.out.print("2. Sayı : ");
        s2 = inp.nextInt();

        System.out.print("3. Sayı : ");
        s3 = inp.nextInt();


        if (s1 > s2 && s2 > s3) {
            System.out.println("\n"+s1+" > "+s2+" > "+s3);
        }else if (s2 > s1 && s1 > s3) {
            System.out.println("\n"+s2+" > "+s1+">"+s3);
        }else if (s1 > s3 && s3 > s2) {
            System.out.println("\n"+s1+" > "+s3+" > "+s2);
        }else if (s3 > s1 && s1 > s2) {
            System.out.println("\n"+s3+" > "+s1+" > "+s2);
        }else if (s3 > s2 && s2 > s1) {
            System.out.println("\n"+s3+" > "+s2+" > "+s1);
        }else if (s2 > s3 && s3 > s1) {
            System.out.println("\n"+s2+" > "+s3+" > "+s1);
        }
    }
}
