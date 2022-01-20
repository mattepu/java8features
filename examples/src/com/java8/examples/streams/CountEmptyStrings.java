package com.java8.examples.streams;

import java.util.Arrays;
import java.util.List;

/**
 * https://www.tutorialspoint.com/java8/java8_streams.htm
 */
public class CountEmptyStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Mahesh", "", "Anitha", "", "Parnitha", "", "Lalith");
        System.out.println(strings.stream().filter(s -> s.isEmpty()).count());
    }
}
