package com.company;

import java.util.Scanner;

public class Student {
    int phy=70;
    int chem=89;
    Scanner sc=new Scanner(System.in);
    void acceptMarks(){
        System.out.println("enter phy marks");
        phy=sc.nextInt();
        System.out.println("enter chem marks");
        chem=sc.nextInt();
    }
    void displayMarks(){
        System.out.println("Physics"+ phy);
        System.out.println("Chemistry"+chem);
    }

}

class BioStudent extends Student {
    int bio = 90;
    void acceptBioMarks(){
        System.out.println("Enter Bio Marks");
        bio=sc.nextInt();
    }
    void displayBioMarks() {
        System.out.println("Biology" + bio);
    }
}
class EnggStudent extends Student{
        int math=90;
        void acceptMathMarks(){
            System.out.println("Enter Math Marks");
            math=sc.nextInt();
        }
        void displayMathMarks(){
            System.out.println("Maths"+math);
        }

}
