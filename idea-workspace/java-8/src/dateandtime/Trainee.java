package dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.StringJoiner;

public final class Trainee {

    private int id;
    private String name;
    private LocalDate dateJoined;

    public Trainee(int id, String name, LocalDate dateJoined) {
        this.id = id;
        this.name = name;
        this.dateJoined = dateJoined;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateJoined() {
        return dateJoined;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Trainee.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("dateJoined=" + dateJoined)
                .toString();
    }
}
