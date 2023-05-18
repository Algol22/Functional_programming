package Streams;


import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {
             List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Alex", Gender.MALE)
        );

//             people.stream()
//                     .map(person -> person.name)
//                     .collect(Collectors.toSet())
//                     .forEach(System.out::println);
        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);
        people.stream()
                .allMatch(person -> Gender.FEMALE.equals(person.gender));

    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
