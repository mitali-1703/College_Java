//To print individual digits of a number.

package com.company;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        while (n>0){
            System.out.println(n%10);
            n/=10;
        }
    }
}

//OUTPUT
//Enter a number:
//        6743
//        3
//        4
//        7
//        6
