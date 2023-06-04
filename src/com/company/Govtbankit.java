package com.company;

public class Govtbankit implements BankRules{
    String customer_name;
    Govtbankit(String customer_name){
        this.customer_name=customer_name;
    }

    @Override
    public void interest_paid() {
        System.out.println(customer_name+" is paid an interest of 7%");
    }
}
