package Inheritance;

public class LabAsistanı extends Asistan {
    
    public LabAsistanı (String fullName, int phoneNum, String ePosta, String bolum, String unvan, int ofiSaat){
        super(fullName,phoneNum,ePosta,bolum,unvan,ofiSaat);
    }

    public void lablaraGir(){
        System.out.println(getBolum()+ " Labına girildi.");
    }




}
