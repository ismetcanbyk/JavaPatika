package Inheritance;

public class BilgiIslem extends Memur{
    private String gorev;

    public BilgiIslem(String fullName, int phoneNum, String ePosta, String departman, int mesai,String gorev){
        super(fullName,phoneNum,ePosta,departman,mesai);
        this.gorev=gorev;
    }

    public String getGorev(){
        return this.gorev;
    }

    public void setGorev(String gorev){
        this.gorev = gorev; 
    }

    public void networkKurul(){
        System.out.println(getFullName() + " Network kuruldu.");
    }
    
}
