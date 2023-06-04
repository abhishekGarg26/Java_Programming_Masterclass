package com.company;

public class InvalidUserNameException extends Exception{
    @Override
    public String toString() {
        return "Name length should be greater then 6 characters";
    }
}
