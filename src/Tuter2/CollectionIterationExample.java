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
public class CollectionIterationExample {
    
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Manjit", "Shakya", 20),
                new Person("Sandesh", "Maharjan", 20),
                new Person("Rahil", "Shakya", 18),
                new Person("Raman", "Karki", 20)
        );
        
        System.out.println("Using For loop");
        
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
        
        System.out.println("Using For each");
        
        for (Person p : people) {
            System.out.println(p);
        }
        
        System.out.println("Using Java 8 For each");

//        people.forEach(i -> System.out.println(i));
        people.forEach(System.out::println);
    }
    
}
