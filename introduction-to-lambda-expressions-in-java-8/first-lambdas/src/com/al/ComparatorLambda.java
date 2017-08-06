package com.al;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {

    public static void main(String[] args) {
        
        Comparator<String> comparator = (a, b) -> 
                Integer.compare(a.length(), b.length());


        List<String> list = Arrays.asList("**", "****", "***", "*");
        Collections.sort(list, comparator);
        
        list.stream().forEach((a) -> System.out.println(a));
    }
}
