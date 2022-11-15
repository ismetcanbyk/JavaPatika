package Kitap;

public class DersKitabi extends Kitap {
    private String konu;

    public DersKitabi(String isim, String konu){
        super(isim);
        this.konu=konu;
    }

    public void reset(String yeniIsim, String yeniKonu){

        System.out.println("Kitabın yeni ismi : "+yeniIsim + " Kitabın yeni konusu : " + yeniKonu);
        this.konu = yeniKonu;
        this.setIsim(yeniIsim);
    }

    public String getKonu(){
        return this.konu;
    }

    public void setKonu(String yeniKonu){
        this.konu=yeniKonu;
    }

    @Override

    public void ciktiYaz(){
        System.out.println("Ders kitabının ismi : "+ getIsim() + " Ders kitabının konusu : " + this.konu);
    }
}
