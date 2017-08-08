package com.al.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapExample {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8);
        List<Integer> list3 = Arrays.asList(1, 3, 5, 7, 9);
        
        List<List<Integer>> list = Arrays.asList(list1, list2, list3);
        System.out.println("These is the content of my list:");
        System.out.println(list);
        
        System.out.println("Maper sample:");
        Function<List<?>, Integer> mapper = List::size;
        list.stream()
                .map(mapper)
                .forEach(System.out::println);
        
        System.out.println("FlatMapper sample:");
        Function<List<Integer>, Stream<Integer>> flatMapper = l -> l.stream();
        list.stream()
                .flatMap(flatMapper)
                .forEach(System.out::println);
    }
}
