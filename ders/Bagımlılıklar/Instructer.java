package Bagımlılıklar;

public class Instructer {
    private String name;
    private String surname;
    private String department;

    Instructer(String name, String surname, String department){
        this.name = name;
        this.surname=surname;
        this.department=department;
    }


    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getSurname(){
        return this.surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getDepartment(){
        return this.department;
    }

    public void setDepartment(String department){
        this.department = department;
    }





}
