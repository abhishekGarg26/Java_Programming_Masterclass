package com.company;

public class Demo<T extends Number>{
    T number;
    public Demo(T n){
        number=n;
    }
    T getNumber(){
        return number;
    }
}
