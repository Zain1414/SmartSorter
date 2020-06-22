package com.runner.test;

import com.runner.main.SmartSorterMain;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Write a function to sort a list of numbers so that odd numbers are sorted before even numbers, and relative order is preserved,
 * for example: 3,4,2,1,6,7 should return 3,1,7,4,2,6.
 *
 * @author Mohammad Zain
 * @since 23/06/2020
 */
public class SmartSorterTest {

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(Arrays.asList(3,4,2,1,6,7))
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testWithSimpleData(List<Integer> data) {
        SmartSorterMain tester = new SmartSorterMain();

        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(3,1,7,4,2,6));

        assertEquals(expected, tester.sortOddEven(data));
    }
}
