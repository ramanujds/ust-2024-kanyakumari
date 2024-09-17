

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person(1,"Karan");
        System.out.println(p1);


        p1 = new Person(2,"Harsh");

        System.gc();


        System.out.println(p1);

        System.out.println("Bye..");



    }
}