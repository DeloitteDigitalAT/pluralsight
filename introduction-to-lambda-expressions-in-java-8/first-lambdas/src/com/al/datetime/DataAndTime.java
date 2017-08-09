package com.al.datetime;

import com.al.datetime.model.Person;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 *
 * @author José
 */
public class DataAndTime {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        try (
            BufferedReader reader
            = new BufferedReader(
                new InputStreamReader(
                    Person.class.getResourceAsStream("people.txt")));
            Stream<String> stream = reader.lines();
            ) {

            final Function<String, Person> personMapper = line -> {
                String[] s = line.split(" ");
                String name = s[0].trim();
                int year = Integer.parseInt(s[1]);
                Month month = Month.of(Integer.parseInt(s[2]));
                int day = Integer.parseInt(s[3]);
                Person p = new Person(name, LocalDate.of(year, month, day));
                persons.add(p);
                return p;
            };

            stream.map(personMapper).
                forEach(System.out::println);

        } catch (IOException ioe) {
            System.out.println(ioe);
        }
        
        
        System.out.println("\n\nFun with Dates \n");
        
        LocalDate now = LocalDate.now();
        
        Consumer<Person> investigator = p -> {
            Period period = Period.between(p.getDateOfBirth(), now);
            System.out.print(p.getName() + " was born ");
            System.out.print(period.getYears() + " months ");
            System.out.print("[" + p.getDateOfBirth().until(now, ChronoUnit.MONTHS) + " months]");
            System.out.println();
        };
        
        persons.stream().forEach(investigator);
    }
}
