package com.java8.examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by mattepm on 10-07-2018.
 */
public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9, 10, 11,12,13);

        //Filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(number -> number % 2 == 0)
                                           .collect(Collectors.toList());

        System.out.println("Even numbers size :" + evenNumbers.size());



        long count = numbers.stream().filter(number -> number % 2 == 0).count();
        System.out.println("Even numbers count: " + count);



        //Filter even numbers less than 10
        long evenNumberCount = numbers.stream().filter(number -> number % 2 == 0 && number < 10).count();
        System.out.println("Even numbers count: " + evenNumberCount);


        //Add 1 to odd numbers
        int becomeEvenNumber = numbers.stream().filter(number -> number % 2 != 0)
                                               .findAny().get().intValue() + 1;
        System.out.println("oddNumberBecome Even Number: " + becomeEvenNumber);

        List<Integer> evenNumbersList = numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> number + 1).collect(Collectors.toList());



        List<Integer> collect = numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(oddNumber -> oddNumber + 1)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);


    }
}

