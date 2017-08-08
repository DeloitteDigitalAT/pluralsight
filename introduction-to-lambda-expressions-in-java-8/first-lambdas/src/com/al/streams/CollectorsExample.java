package com.al.streams;

import com.al.streams.model.Person;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExample {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        Function<String, Person> mapper = line -> {
            String[] s = line.split(" ");
            String name = s[0].trim();
            Integer age = Integer.parseInt(s[1]);
            return new Person(name, age);
        };

        try (
            BufferedReader reader
            = new BufferedReader(
                new InputStreamReader(Person.class.
                    getResourceAsStream("people.txt")));
            Stream<String> stream = reader.lines();) {

            stream.map(mapper).
                forEach(persons::add);

        } catch (Exception ex) {
            System.err.println(ex);
        }

        Predicate<Person> isGreaterOrEqualsTo20 = p -> p.getAge() >= 20;
        Comparator<Person> comparator = Comparator.comparing(Person::getAge);

        Optional<Person> optional = persons.stream().
            filter(isGreaterOrEqualsTo20).
            min(comparator);
        System.out.println(optional);

        Map<Integer, List<Person>> resultMapList = persons.stream().
            collect(Collectors.groupingBy(Person::getAge));
        System.out.println(resultMapList);

        Map<Integer, Long> resultMapCount = persons.stream().
            collect(Collectors.groupingBy(Person::getAge,
                Collectors.counting()));
        System.out.println(resultMapCount);

        Map<Integer, List<String>> resultMapListString = persons.stream().
            collect(Collectors.groupingBy(
                Person::getAge,
                Collectors.mapping(
                    Person::getName,
                    Collectors.toList())
            ));
        System.out.println(resultMapListString);
    }
}
