package com.al.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediateAndFinal {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("one", "two", "three", "four", "five");

        Predicate<String> equalsTwo = Predicate.isEqual("two");
        Predicate<String> equalsThree = Predicate.isEqual("three");

        List<String> list = new ArrayList<>();
        
        stream
            .peek(System.out::println)
            .filter(equalsTwo.or(equalsThree))
            .forEach(list::add);

        System.out.println("Done!");
        System.out.println("size of list = " + list.size());
    }
}
