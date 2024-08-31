package model;

import java.util.Objects;
import java.util.StringJoiner;

public class Trainee{

    private int id;
    private String name;
    private String location;

    public Trainee(Trainee trainee){
        this.id=trainee.id;
        this.name=trainee.name;
        this.location= trainee.location;
    }

    public Trainee(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Trainee.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("location='" + location + "'")
                .toString();
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Trainee trainee)) return false;

        return id == trainee.id && Objects.equals(name, trainee.name) && Objects.equals(location, trainee.location);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(location);
        return result;
    }

//    public int compareTo(Trainee t) {
//        int diff = location.compareTo(t.location);
//        return diff==0?name.compareTo(t.name):diff;
//    }
}
