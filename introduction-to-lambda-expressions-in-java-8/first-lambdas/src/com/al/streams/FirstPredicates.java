package com.al.streams;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstPredicates {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("one", "two", "three", "four", "five");

        Predicate<String> lengthGreaterThan3 = s -> s.length() > 3;
        Predicate<String> equalsTwo = Predicate.isEqual("two");
        Predicate<String> equalsThree = Predicate.isEqual("three");

        //Result should be three
        stream
            .filter(equalsTwo.or(equalsThree).and(lengthGreaterThan3))
            .forEach(System.out::println);

    }
}
