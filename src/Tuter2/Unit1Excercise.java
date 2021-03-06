/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuter2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Dell
 */
public class Unit1Excercise {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Manjit", "Shakya", 20),
                new Person("Sandesh", "Maharjan", 20),
                new Person("Rahil", "Shakya", 18),
                new Person("Raman", "Karki", 20)
        );

//Step 1: Sort list by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
//Step 2: Create method that prints all elements in the list

        System.out.println("Printing all people");
        printAll(people);

//Step 3: Create method that prints all peopele with last name begining with S
        System.out.println("Printing all people whose lastname begans with S");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("S");
            }
        });

    }

    private static void printAll(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }

        }
    }

    interface Condition {

        boolean test(Person p);
    }
}
