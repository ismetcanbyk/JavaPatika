package KitapInterface;

public class Book {
    private String tur;
    private int fiyat;
    private String yazar;

    public Book(String tur, int fiyat, String yazar){
        this.tur = tur;
        this.fiyat=fiyat;
        this.yazar=yazar;
    }

    public String getTur(){
        return this.tur;
    }

    public void setTur(String tur){
        this.tur=tur;
    }

    public int getFiyat(){
        return this.fiyat;
    }

    public void setFiyat(int fiyat){
        this.fiyat=fiyat;
    }

    public String getYazar(){
        return this.yazar;
    }

    public void setYazar(String yazar){
        this.yazar=yazar;
    }

}
