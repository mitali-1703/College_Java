//WAP to create our exception subclass that throws exception if the sum of two integers is greater than 99.

package com.company;

import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        int sum = a+b;
        try{
            if (sum>99)
                throw new ArithmeticException("Sum is greater than 99");
            else
                System.out.println("Sum is: "+sum);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurs");
        }
    }
}

//OUTPUT
//Enter first number:
//100
//Enter second number:
//0
//ArithmeticException occurs