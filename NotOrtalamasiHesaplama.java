import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, tarih;
        
        
        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("Matematik Notunuzu Giriniz : ");
            mat= inp.nextInt();
           
            System.out.print("Fizik Notunuzu Giriniz : ");
            fizik= inp.nextInt();
           
            System.out.print("Turkce Notunuzu Giriniz : ");
            turkce= inp.nextInt();
           
            System.out.print("Kimya Notunuzu Giriniz : ");
            kimya= inp.nextInt();
           
            System.out.print("Muzik Notunuzu Giriniz : ");
            muzik= inp.nextInt();
           
            System.out.print("Tarih Notunuzu Giriniz : ");
            tarih= inp.nextInt();

        }
        int toplam = (mat+fizik+turkce+kimya+muzik+tarih);
        float ortalama = toplam/6f;
       
        System.out.println("\nOrtalama : " + ortalama);
        System.out.println(ortalama>=60 ?  "Geçti"   : "Kaldı");
        
    }
}
