//WAP to find area of rectangle

package com.company;

import java.util.Scanner;

public class P01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Area of rectangle is: "+(l*b));
    }
}

//OUTPUT
//Enter length and breadth of rectangle:
//        5 2
//        Area of rectangle is: 10
