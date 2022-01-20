package com.java8.examples.streams;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mattepm on 10-07-2018.
 */
public class LoopAList {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Mahesh", "Sandeep", "Anand", "Ravi", "Biswajith");
        list.forEach(str -> System.out.println(str)); // just iterate the list whatever there

        list.forEach(str -> System.out.println(str.toUpperCase())); // you can apply any operations which are related to the String

        list.forEach(str -> {if(!str.equalsIgnoreCase("mahesh")) {
            System.out.println("Hi " + str);} //Filter the name mahesh from list
        });
    }
}
