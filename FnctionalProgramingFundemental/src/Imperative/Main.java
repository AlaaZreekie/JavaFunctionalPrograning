package Imperative;


import java.util.List;
import java.util.function.Predicate;

import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) 
    {
        List<Person> people = List.of 
        (
            new Person("Alan", Gender.MALE),
            new Person("Alaa", Gender.FEMALE),
            new Person("Ali", Gender.MALE),
            new Person("Mohamed", Gender.MALE),
            new Person("Zienab", Gender.FEMALE)
        );

        //Imperative
        // List<Person> females = new ArrayList<Person>();
        // for(Person person : people) 
        // {
        //     if(person.GENDER == Gender.FEMALE) 
        //     {
        //         females.add(person);
        //     }
        // }

        // for(Person female : females)
        // {
        //     System.out.println(female.NAME);
        // }

        //Declarative
        Predicate<Person> isF = p -> p.GENDER.equals(Gender.FEMALE);
        people.stream()
                .filter(isF)
                .map(p -> p.NAME)
                .collect(Collectors.toList())                
                .forEach(System.out::println);

        isF.negate();
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
