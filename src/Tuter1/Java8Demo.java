package Tuter1;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dell
 */
public class Java8Demo {

    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
//        List<Integer> list = Arrays.asList(20, 12, 45, 22, 25, 89, 33, 75);

//        int result = 0;
//        for (int i : list) {
//            if (i % 5 == 0) {
//                result += i;
//            }
//        }
//        Predicate<Integer> p = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer i) {
//                return i % 5 == 0;
//            }
//
//        };
        // filter and map are lazy evaluation methods
//        System.out.println(list.stream().filter(p).reduce(0, (c, e) -> c + e));
//        System.out.println(list.stream().filter(p).findFirst().orElse(0));
//        System.out.println(list.stream().filter(i -> i % 5 == 0)
//                                        .reduce(0, (c, e) -> c + e));
//        System.out.println(result);
//        int result = 0;
//        for(int i: list){
//            result = result + i;
//        }
//           Function<Integer, Integer> f = new Function<Integer, Integer>() {
//            public Integer apply(Integer i) {
//                return i * 2;
//            }
//        };
//        Stream s = list.stream();
//        Stream s1 = s.map(f);
//        BinaryOperator<Integer> bo = new BinaryOperator<Integer>() {
//
//            public Integer apply(Integer i, Integer j) {
//                return i + j;
//            }
//        };
//        int result = (Integer) s1.reduce(0, bo);
//
////            s1.forEach(System.out::print);
//            
//            System.out.println(result);
//        System.out.println(list.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e));
//        System.out.println(list.stream().map(i -> i * 2).reduce(0, Integer::sum));
//<----------------External iterations-------------------->
        //Normal for loop
//        for(int i = 0; i < 6; i++){
//            System.out.println(list.get(i));
//        }
//        //Enhanced for loop
//        for (int i : list){
//            System.out.println(i);
//        }
//        //Using interator interface
//        Iterator<Integer> i = list.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }
//<----------------Internal iterations-------------------->
//            list.forEach(new Consumer<Integer>(){
//            @Override
//            public void accept(Integer t) {
//                System.out.println(t);
//            }
//                
//            });
//        list.forEach(Java8Demo::doubler);
//        list.forEach(System.out :: println);
//        Consumer<Integer> consumer = t -> {
//            System.out.println(t);
//        };
//        list.forEach(consumer);
//        LocalDate d = LocalDate.now();
//        LocalDate d = LocalDate.of(1998, Month.MARCH, 31);
//        for(String s:ZoneId.getAvailableZoneIds()){
//            System.out.println(s);
//        }
        LocalTime t = LocalTime.now(ZoneId.of("Asia/Singapore"));
        System.out.println(t);
        
        Instant i = Instant.now();
        System.out.println(i);
    }

//    public static void doubler(int i){
//        System.out.println(i*i);
//    }
}
