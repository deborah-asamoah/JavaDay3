package org.example.question3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {


    @Test
    public void testingSorting() {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("riyanat shittu", 100));
        personList.add(new Person("debbie", 70));
        personList.add(new Person("gideon", 99));
        personList.add(new Person("mark", 0));


        // sort by name which is default because person implements comparable and our compareto method sorts by name
        Collections.sort(personList);
        System.out.println(personList);

        // sort by age because we are providing a comparator
//        personList.sort(Comparator.comparingInt(Person::getAge));
        personList.sort(Comparator.comparing(Person::getName));
        System.out.println(personList);
    }

}