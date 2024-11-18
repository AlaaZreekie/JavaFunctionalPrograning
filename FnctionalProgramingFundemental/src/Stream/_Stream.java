package Stream;

import static Stream._Stream.Gender.MALE;
import static Stream._Stream.Gender.FEMALE;

import java.util.List;

import java.util.stream.Collectors;

public class _Stream 
{
    public static void main(String[] args)
    {
        List<Person> people = List.of 
        (
            new Person("Alan", MALE),
            new Person("Alaa", FEMALE),
            new Person("Ali", MALE),
            new Person("Mohamed", MALE),
            new Person("Zienab", FEMALE)
        );
        
        people.stream().map(person -> (person.GENDER))
                .collect(Collectors.toSet())
                .forEach(g -> System.out.println(g));
        
        people.stream().allMatch(p -> p.GENDER.equals(FEMALE));
    }


    static class  Person 
    {    
        private final  String NAME ;
        private final Gender GENDER;

            public Person(String name, Gender gender) 
        {
            this.GENDER = gender;
            this.NAME = name;
        }
    }

    static enum Gender 
    {
        MALE, FEMALE
    }
    
}
