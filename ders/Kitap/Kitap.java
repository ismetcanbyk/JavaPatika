package Kitap;

public abstract class Kitap {
    private String isim;

    public Kitap(String isim){
        this.isim = isim ;
    }

    public String getIsim(){
        return this.isim;
    }

    public void setIsim(String yeniIsim){
        this.isim=yeniIsim;
    }

    public void ciktiYaz(){
        System.out.println("Kitap İsmi : "+this.isim);
    }
}
