package records;

import java.time.LocalDate;

record Address(int zipcode,String area, String city){}

public record Trainee(int id, String name, LocalDate dateJoined, Address address) {



    public Trainee(int id){
        this(id,null,null,null);
    }

    public Trainee(int id,String name){
        this(id,name,null,null);
    }

}
