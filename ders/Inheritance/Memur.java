package Inheritance;

public class Memur extends Calisan {
    private String departman;
    private int mesai;

    public Memur(String fullName, int phoneNum, String ePosta, String departman, int mesai){
        super(fullName,phoneNum,ePosta);
        this.departman = departman;
        this.mesai = mesai;
    }

    public String getDepatman(){
        return this.departman;
    }

    public void setDepartman(String departman){
        this.departman = departman;
    }

    public int getMesai(){
        return this.mesai;
    }

    public void setMesai(int mesai){
        this.mesai=mesai;
    }

    public void calıs(){
        System.out.println(getFullName() + " Çalışmaya Başladı");
    }


}
