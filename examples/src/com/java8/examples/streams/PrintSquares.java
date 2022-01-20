package com.java8.examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.tutorialspoint.com/java8/java8_streams.htm
 */
public class PrintSquares {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 3, 4, 2);
       // List<Integer> collect = nums.stream().map(n -> n * n).collect(Collectors.toList());
        List<Integer> collect = nums.stream().map(n -> n * n).distinct().collect(Collectors.toList()); // the distinct avoids duplicates
        collect.forEach(System.out::println);
    }
}
