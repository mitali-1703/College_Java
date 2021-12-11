//Compare 2 integers to find which is larger and if equal then print that they are equal.

package com.company;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>b){
            System.out.println(a+" is larger");
        }
        else if (a==b){
            System.out.println("The numbers are equal");
        }
        else
            System.out.println(b+" is larger");
    }
}
