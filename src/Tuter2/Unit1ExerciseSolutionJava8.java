/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuter2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Dell
 */
public class Unit1ExerciseSolutionJava8 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Manjit", "Shakya", 20),
                new Person("Sandesh", "Maharjan", 20),
                new Person("Rahil", "Shakya", 18),
                new Person("Raman", "Karki", 20)
        );

//Step 1: Sort list by last name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
//Step 2: Create method that prints all elements in the list

        System.out.println("Printing all people");
        printConditionally(people, p -> true);

//Step 3: Create method that prints all peopele with last name begining with S
        System.out.println("Printing all people whose lastname begans with S");
        printConditionally(people, p -> p.getLastName().startsWith("S"));

    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
        for (Person p : people) {
            if (predicate.test(p)) {
                System.out.println(p);
            }

        }
    }
}
