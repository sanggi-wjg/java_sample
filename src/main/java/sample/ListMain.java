package sample;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class ListMain {

    public static void main(String[] args) {
        ArrayList<Person> westerns = new ArrayList<>();
        westerns.add(Person.builder().pin(1).name("Snow").dateOfBirth(LocalDate.of(1970, 1, 1)).build());
        westerns.add(Person.builder().pin(2).name("Test").dateOfBirth(LocalDate.of(1980, 1, 1)).build());
        westerns.add(Person.builder().pin(3).name("What").dateOfBirth(LocalDate.of(1990, 1, 1)).build());
        System.out.println(westerns);

        System.out.println("REMOVE BY NAME");
        PeopleRemover remover = new PeopleRemover();
        remover.removeByName(westerns, "Test");
        remover.removeByName(westerns, "Test1");
        System.out.println(westerns);

        System.out.println("REMOVE BY EQUAL");
        remover.removeByEqual(westerns, Person.builder().pin(3).name("What").dateOfBirth(LocalDate.of(1990, 1, 1)).build());
        remover.removeByEqual(westerns, Person.builder().pin(3).name("What1").dateOfBirth(LocalDate.of(1990, 1, 1)).build());
        System.out.println(westerns);

        System.out.println("====================================================================================");

        ArrayList<Person> koreans = new ArrayList<>();
        koreans.add(Person.builder().pin(4).name("길동이").dateOfBirth(LocalDate.of(1970, 1, 1)).build());
        koreans.add(Person.builder().pin(5).name("철수").dateOfBirth(LocalDate.of(1992, 1, 1)).build());

        Stream<Person> allPeople = Stream.concat(westerns.stream(), koreans.stream());
        Stream.concat(westerns.stream(), koreans.stream()).parallel().forEach(System.out::println);

        List<Person> isYearOfBirth_1970 = allPeople.parallel().filter(person -> person.getDateOfBirth().getYear() == 1970).toList();
        System.out.println("isYearOfBirth_1970 = " + isYearOfBirth_1970);
    }
}

class PeopleRemover {

    public void removeByName(ArrayList<Person> list, String name) {
        list.removeIf(d -> name.equals(d.getName()));
    }

    public void removeByEqual(ArrayList<Person> list, Person person) {
        list.remove(person);
    }

}

@Getter
@Setter
@Builder
@ToString
class Person {
    private int pin;
    private String name;
    private LocalDate dateOfBirth;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        var person = (Person) obj;
        return Objects.equals(pin, person.pin) &&
                Objects.equals(name, person.name) &&
                Objects.equals(dateOfBirth, person.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pin, name, dateOfBirth);
    }
}