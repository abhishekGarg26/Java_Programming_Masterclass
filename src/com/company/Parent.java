package com.company;

public class Parent {
    void wealth(){
        System.out.println("I have thousand dollars");
    }
    void displayName(){
        System.out.println("My name is Rob");
    }
    void displaySurname(){
        System.out.println("ford");
    }
}

class Child extends Parent{
    void displayName(){
        System.out.println("My name is John");
    }
    void displaySurname(){
        System.out.println("XYZ");
    }
}