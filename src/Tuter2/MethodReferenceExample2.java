/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuter2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author Dell
 */
public class MethodReferenceExample2 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Manjit", "Shakya", 20),
                new Person("Sandesh", "Maharjan", 20),
                new Person("Rahil", "Shakya", 18),
                new Person("Raman", "Karki", 20)
        );

        System.out.println("Printing all people");
        printConditionally(people, p -> true, System.out::println ); // p -> method(p)
    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer consumer) {
        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }

        }
    }
}
