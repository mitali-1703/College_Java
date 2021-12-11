//To find sum of digits of a number

package com.company;

import java.util.Scanner;

public class P07 {
    public static void main(String[] args) {
        int count = 0,a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        while (n>0){
            a=n%10;
            count=count+a;
            n=n/10;
        }
        System.out.println("Sum of digits of the number is: "+count);
    }
}

//OUTPUT
//Enter a number:
//        6439
//        Sum of digits of the number is: 22
