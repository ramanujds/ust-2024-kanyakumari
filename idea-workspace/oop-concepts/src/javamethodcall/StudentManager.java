package javamethodcall;

public class StudentManager {

    public static void updateStudent(Student s, String branch){
        s=new Student(branch);
    }

    public static void main(String[] args) {

        Student s1 = new Student("CSE");

        s1 = new Student("EEE");


    }

}
