package com.company;

public class NegativeNotAllowedException extends Throwable{
    @Override
    public String toString() {
        return "U have Entered a negative value please enter a positive value";
    }
}
