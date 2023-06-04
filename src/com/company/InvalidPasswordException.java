package com.company;

public class InvalidPasswordException{
    @Override
    public String toString() {
        return "Password length should be greater then 8 characters";
    }
}
