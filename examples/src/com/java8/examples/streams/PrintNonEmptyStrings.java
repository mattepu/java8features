package com.java8.examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintNonEmptyStrings {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("mahesh", "","Anitha", "", "Parnitha"," ", "Lalith");
        System.out.println("Size of Strings = "+strings.size());
        List<String> collect = strings.stream().filter(string -> !string.isEmpty() && !string.isBlank()).collect(Collectors.toList());
        System.out.println(collect.size());
        collect.stream().forEach(s -> {
            System.out.println(s.indexOf(s) + " " + s);
        });
    }
}

