//WAP to find whether a number is odd or even

package com.company;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if (n%2==0)
            System.out.println(n+" is even");
        else
            System.out.println(n+" is odd");
    }
}
