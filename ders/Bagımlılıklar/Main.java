package Bagımlılıklar;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("can","bıyık " , "yzlm", "izmir", 89);
        Student st2 = new Student("ismet", "can", "yzlm", "sivas", 100);
        Instructer matTeacher = new Instructer("mehmet", "ayva", "mat");
        Course mat = new Course("Matematik", "Mat", 5,matTeacher);

        Student[] stu = {st1,st2};

        System.out.println(mat.getInsructer().getDepartment());
        

    }
}
