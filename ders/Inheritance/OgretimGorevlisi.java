package Inheritance;

public class OgretimGorevlisi extends Akademisyen {
    private int kapiNo;

    public OgretimGorevlisi(String fullName, int phoneNum, String ePosta, String bolum, String unvan, int kapiNo) {
        super(fullName, phoneNum, ePosta, bolum, unvan);
        this.kapiNo = kapiNo;
    }

    public int getKapiNo() {
        return this.kapiNo;
    }

    public void setKapiNo(int kapiNo) {
        this.kapiNo = kapiNo;
    }

    public void senatoToplanti(){
        System.out.println(getFullName() + "Senato Toplantısında");
    }

    public void sinavYap(){
        System.out.println(getBolum()+" Sınavı yapıldı");
    }
}
