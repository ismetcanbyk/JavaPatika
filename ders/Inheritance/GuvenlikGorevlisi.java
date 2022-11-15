package Inheritance;

public class GuvenlikGorevlisi extends Memur {
    private String belge;

    public GuvenlikGorevlisi(String fullName, int phoneNum, String ePosta, String departman, int mesai, String belge){
        super(fullName,phoneNum,ePosta,departman,mesai);
        this.belge = belge;
    }

    public String getBelge(){
        return this.belge;
    }

    public void setBelge(String belge){
        this.belge = belge;
    }

    public void mesai(){
        System.out.println(getFullName() + " Mesai başladı.");
    }
}
