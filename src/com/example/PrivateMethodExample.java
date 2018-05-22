package com.example;

public interface PrivateMethodExample {

    private String sayHello(){
        return "Hi, ";
    }

    default String greeting(String name){
        return sayHello() +name;
    }

}

