package com.example;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class CollectionExamples {
    public static void main(String[] args) {

        //of() method is new in java 9
        List<Integer> integerList = List.of(11,23,45,13,26,76,12);
        List<Double> doubleList = List.of(18.23, 15.23, 45.67, 34.34, 1.23, 56.23);
        List<String> stringList = List.of("Ajmal", "Shadiya", "Maliha", "Aqila");

        //there are special of() method fo 1 or 2 elements
//        List.of(1);
//        List.of(2,3);


//        Modifying a collection won't work as of() method will create an immutable unmodifiable collection
//        stringList.add("Manju");


        //dropWhile and takeWhile examples new in java 9
        System.out.println("Int stream takeWhile#####");
        integerList.stream().takeWhile(e->e<40).forEach(System.out::println);
        System.out.println("Double stream takeWhile#####");
        doubleList.stream().takeWhile(e->e<40).forEach(System.out::println);
        System.out.println("String stream takeWhile####");
        stringList.stream().takeWhile(s->!(s.equals("Maliha"))).forEach(System.out::println);


        System.out.println("Int stream dropWhile#####");
        integerList.stream().dropWhile(e->e<40).forEach(System.out::println);
        System.out.println("Double stream dropWhile#####");
        doubleList.stream().dropWhile(e->e<40).forEach(System.out::println);
        System.out.println("String stream dropWhile####");
        stringList.stream().dropWhile(s->s.equals("Maliha")).forEach(System.out::println);

        //Stream iterate with/without bounds
        System.out.println("Int stream iterate");
        IntStream.iterate(0, e -> e < 8, e -> e + 2).forEach(System.out::println);
        IntStream.iterate(2,e ->e +5).limit(3).forEach(System.out::println);
        System.out.println("Double stream iterate");
        DoubleStream.iterate(0, e -> e < 8, e -> e + 2).forEach(System.out::println);
        DoubleStream.iterate(2,e ->e +5).limit(3).forEach(System.out::println);

    }
}
