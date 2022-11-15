package Kitap;

public class ListeKitabi extends DersKitabi {
     private int fiyat;

     public ListeKitabi(String isim , String konu, int fiyat){
        super(isim, konu);
        this.fiyat= fiyat;
     }

     public int getFiyat(){
        return this.fiyat;
     }

     public void setFiyat(int fiyat){
        this.fiyat=fiyat;
     }
}
