package Kitap;

public class Main {
    public static void main(String[] args) {
        DersKitabi k1 = new DersKitabi("1984", "Distopya");
        ListeKitabi k2 = new ListeKitabi("Don Kişot", "itopya", 31);
        DersKitabi k3 = new DersKitabi("1984", "Distopya");

     

        k2.ciktiYaz();
        System.out.println(k2.getFiyat());
        System.out.println(k2.getIsim());
        k2.reset("hakan", "yurt");
        System.out.println(k2.getIsim());
        System.out.println(k2.getKonu());

        if(k1.equals(k3)){
            System.out.println("eşittt");
        }else{
            System.out.println("değil");
        }
    }
}
