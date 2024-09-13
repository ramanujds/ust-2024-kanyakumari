import java.util.StringJoiner;

public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .toString();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Person with name "+this.name+" Garbage Collected");
    }
}
