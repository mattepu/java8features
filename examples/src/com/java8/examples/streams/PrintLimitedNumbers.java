package com.java8.examples.streams;

import java.util.Random;

public class PrintLimitedNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }
}
