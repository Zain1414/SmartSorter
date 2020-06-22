package com.runner.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Write a function to sort a list of numbers so that odd numbers are sorted before even numbers, and relative order is preserved,
 * for example: 3,4,2,1,6,7 should return 3,1,7,4,2,6.
 *
 * @author Mohammad Zain
 * @since 23/06/2020
 */
public class SmartSorterMain {

    public List<Integer> sortOddEven(List<Integer> input){

        List<Integer> odd = new ArrayList<Integer>();
        List<Integer> even = new ArrayList<Integer>();

        // Separate odd and even numbers
        input.stream()
                .forEach(i -> {
                    if (i.intValue() % 2 == 0) {
                        even.add(i.intValue());
                    } else {
                        odd.add(i.intValue());
                    }
                });

        // Merge the odd and even numbers streams
        List<Integer> output = Stream.concat(odd.stream(), even.stream())
                .collect(Collectors.toList());

        return output;
    }
}
