package com.al.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class ReductionExample {
    public static void main(String[] args) {
        
        List<Integer> integers = Arrays.asList(10, 10);
        Integer max = integers.stream().reduce(0, Integer::sum);
        System.out.println("max = " + max);

        List<Integer> nothing = Arrays.asList();
        Optional<Integer> optionalMax = nothing.stream().reduce(Integer::max);
        System.out.println("safe optionalMax = " + optionalMax);
        
        List<Integer> zeros = Arrays.asList(0, 0);
        BinaryOperator<Integer> divider = (i1, i2) -> i1/i2;
        Optional<Integer> result = zeros.stream().reduce(divider);
        Integer value = result.orElseThrow(ArithmeticException::new);
        System.out.println("value (I think it will never print) = " + value);
    }
}
