import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args){
        int  a, b , alan;
        double hipotenus , cevre;
       
        Scanner inp = new Scanner(System.in);
        
        System.out.print("1. Kenarı Girin : ");
        a = inp.nextInt();

        System.out.print("2. Kenarı Girin : ");
        b = inp.nextInt();

        hipotenus = Math.sqrt((a*a)+(b*b));
        alan = (a*b)/2;
        cevre = a+b+hipotenus;
        
        System.out.println("\nÜçgenin Hipotenüsü :" +hipotenus);
        System.out.println("Üçgenin Alanı :" +alan);
        System.out.println("Üçgenin Çevresi :" + cevre);
    }
}
