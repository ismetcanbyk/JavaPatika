package Inheritance;

public class Akademisyen extends Calisan {

    private String bolum;
    private String unvan;

    public Akademisyen(String fullName, int phoneNum, String ePosta, String bolum, String unvan) {
        super(fullName, phoneNum, ePosta);
        this.bolum = bolum;
        this.unvan = unvan;
    }

    public String getBolum(){
        return this.bolum;
    }

    public void setBolum(String bolum){
        this.bolum = bolum;
    }

    public String getUnvan(){
        return this.unvan;
    }

    public void setUnvan(String unvan){
        this.unvan = unvan;
    }

    public void derseGir(){
        System.out.println(this.getFullName()+  " Derse Girdi.");
    }

}
