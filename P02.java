//To find result of following expressions:
//1. (a<<2)+(b>>2)
//2.(b>0)
//3.(a+b*100)/10
//4.a&b
//Assume a=10 and b=5

package com.company;

public class P02 {
    public static void main(String[] args) {
        int a=10,b=5;
        System.out.println("Result of (a<<2)+(b>>2) is: "+(a<<2)+(b>>2));
        System.out.println("Result of (b>0) is: "+(b>0));
        System.out.println("Result of (a+b*100)/10 is: "+(a+b*100)/10);
        System.out.println("Result of a&b is: "+(a&b));
    }
}

//OUTPUT
//Result of (a<<2)+(b>>2) is: 401
//        Result of (b>0) is: true
//        Result of (a+b*100)/10 is: 51
//        Result of a&b is: 0