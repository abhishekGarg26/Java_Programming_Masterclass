package com.company;

public class Circle {
    int radii;
    Circle(int radii){
        this.radii=radii;
    }
    double Perimeter(){
        return 2*3.14*radii;
    }
    double Area(){
        return 3.14*radii*radii;
    }
}
