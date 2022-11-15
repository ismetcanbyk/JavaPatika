package Inheritance;
public class Calisan {
    private String fullName;
    private int phoneNum;
    private String ePosta;

    Calisan(String fullName, int phoneNum, String ePosta) {
        this.fullName=fullName;
        this.phoneNum=phoneNum;
        this.ePosta=ePosta;
    }


    public String getFullName(){
        return this.fullName;
    }

    public void setFullName(String fullName){
        this.fullName=fullName;
    }

    public int getPhoneNum (){
        return this.phoneNum;
    }

    public void setPhoneNum(int phoneNum){
        this.phoneNum = phoneNum;
    }

    public String getEposta(){
        return this.ePosta;
    }

    public void setEposta(String ePosta){
        this.ePosta = ePosta;
    }


    public void giris(){
        System.out.println(this.fullName+"  Giriş  Yaptı");
    }

    public void cikis(){
        System.out.println(this.fullName+"  Cıkıs Yaptı");
    }

    public void yemekhane(){
        System.out.println(this.fullName+"  Yemekhaneye giris yaptı.");
    }




}
