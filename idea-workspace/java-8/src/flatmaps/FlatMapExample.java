package flatmaps;

import model.Trainee;

import java.util.List;

public class FlatMapExample {

    public static void main(String[] args) {

        List<Trainee> trainees = List.of(
                new Trainee(1, "Suhel", List.of("Java", "Python")),
                new Trainee(2, "Abhishek", List.of("Java", "C++")),
                new Trainee(3, "Sahithi", List.of("Java", "Python", "C++")));

        // find all languages that different trainees know

        var languages = trainees.stream().flatMap(t->t.programmingLanguages().stream()).distinct().toList();

        System.out.println(languages);


    }

}
