package Assignment4;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        //this is of first question multiplication table
        firstques first=new firstques();
        first.first();

        //this is of second question nepali to usd converter
        Secondques second=new Secondques();
        second.second();

        //this is of third question fibonnaci series
        Thirdques third=new Thirdques();
        third.fibo(1);

        //this is of fourth question fixing the bug
        System.out.println("Hello World!");
        Bird bird = new Bird();
        bird.fly();
        bird.eat();
        bird.walk();

        //this is the fifth question that is array question(rearranging array in an order)
        RearrangeArray rearrangeArray=new RearrangeArray();
        rearrangeArray.array();
        rearrangeArray.array2();
    }
}
