package Bagımlılıklar;

public class Course {
    private String courseName;
    private String code;
    private int akts;
    private Instructer instructer;

    Course(String courseName, String code, int akts, Instructer instructer) {
        this.courseName = courseName;
        this.code = code;
        this.akts = akts;
        this.instructer=instructer;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAkts(){
        return this.akts;
    }

    public void setAkts(int akts){
        this.akts = akts;
    }

    public Instructer getInsructer(){
        return this.instructer;
    }

    public void setInstructer(Instructer instructer){
        this.instructer=instructer;
    }

    public double calcAvarage(Student[] students){
        
        double avarage = 0.0;

        for (int i = 0; i < students.length; i++) {
            avarage += students[i].getNote();
        }
        
        return avarage/students.length;
    }

}
