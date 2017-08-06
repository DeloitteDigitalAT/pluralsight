package com.al;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChainConsumers {
    
    public static void main(String[] args) {
        
        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");
        List<String> result = new ArrayList<>(strings.size());
        
        Consumer<String> printer = System.out::println;
        Consumer<String> upperCaser = (s) -> result.add(s.toUpperCase());
        
        strings.forEach(printer.andThen(upperCaser));
        result.forEach(printer);
    }
}
