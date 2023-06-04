package com.company;

import java.util.Comparator;

public class Scooty implements Comparator<Scooty> {
    int price;
    String name;
    String brand;

    Scooty(int p,String n,String b){
        price=p;
        name=n;
        brand=b;
    }



    @Override
    public int compare(Scooty o1, Scooty o2) {
        return Integer.compare(o1.price,o2.price);
    }
}
