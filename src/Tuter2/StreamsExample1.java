/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuter2;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Dell
 */
public class StreamsExample1 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Manjit", "Shakya", 20),
                new Person("Sandesh", "Maharjan", 20),
                new Person("Rahil", "Shakya", 18),
                new Person("Raman", "Karki", 20)
        );
        people.stream().filter(p -> p.getLastName().startsWith("S")).forEach(p -> System.out.println(p.getFirstName()));
    }

}
