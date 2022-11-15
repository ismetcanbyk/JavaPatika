package Inheritance;

public class Asistan extends Akademisyen {
    private int ofiSaat;


    public Asistan(String fullName, int phoneNum, String ePosta, String bolum, String unvan, int ofiSaat){
        super(fullName,phoneNum,ePosta,bolum,unvan);
        this.ofiSaat=ofiSaat;
    }

    public int getOfisaat(){
        return this.ofiSaat;
    }

    public void setOfisaat(int ofiSaat){
        this.ofiSaat=ofiSaat;
    }

    public void quizYap(){
        System.out.println(getBolum()+ " Quiz Yapıldı.");
    }

}
