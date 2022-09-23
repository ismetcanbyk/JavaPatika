import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args){
        int tutar;
        float kdv;

        Scanner inp = new Scanner(System.in);
        System.out.print("Tutar Gir : ");
        tutar = inp.nextInt();
        kdv = tutar<=1000 ? (tutar*18)/100f : (tutar*8)/100f;


        System.out.println("\nKdv'siz Tutar : " + tutar);
        System.out.println("Kdv Miktarı : " + kdv);
        System.out.println("Toplam Tutar : " + ( tutar+kdv));
        
    }
}
