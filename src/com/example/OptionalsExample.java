package com.example;

import java.util.List;
import java.util.Optional;

public class OptionalsExample {
    public static void main(String[] args) {

        find(List.of("Ajmal", "Shadiya", "Maliha"), "Maliha");
        find(List.of(1,2,3,6,3,5,1,3,5),4);

        Optional<String> stringOptional = Optional.of("Stream");
        //Stream method on optional is newly introduced in java 9
        stringOptional.stream();

    }

    public static <T> void find(List<T> tList, T element){

        //ifPresentOrElse is newly introduced in java 9
        tList
                .stream()
                .filter(e->e.equals(element))
                .findFirst()
                .ifPresentOrElse(e->System.out.println("Element " + e + " found")
                        ,()->System.out.println(element + " not found"));
    }

    public static <T>  Optional<T> get(List<T> tList, T element){

        T deflt = tList.get(0);

        //or is newly introduced in java 9
        return tList.stream().filter(e->e.equals(element)).findFirst().or(()->Optional.of(deflt));

    }


}
