package KitapInterface;

public class Macera extends Book implements IBook {
   
    public Macera(String tur, int fiyat, String yazar){
        super(tur, fiyat, yazar);
    }
    @Override
    public void yazdır(){
        System.out.println("Yazarı :" + getYazar());
        System.out.println("Türü : "+getTur());
        System.out.println("Fiyatı : "+getFiyat());
    }
}
