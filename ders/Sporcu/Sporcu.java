package Sporcu;

public abstract class Sporcu {
    private int maas;
    private String klup;
    private int basari;

    public Sporcu(){
        
    }


    public void bilgiAl(int maas, String klup, int basari){
        this.maas=maas;
        this.klup= klup;
        this.basari=basari;
    }

    public void yazdır(){
        System.out.println("Klüp :" + this.klup + " Başarı sırası : "+ this.basari+" Maaş : "+this.maas);
    }






}
