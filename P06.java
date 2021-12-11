//To find biggest of 3 integers.

package com.company;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>b && a>c){
            System.out.println(a+" is larger");
        }
        else if (b>a && b>c){
            System.out.println(b+" is larger");
        }
        else
            System.out.println(c+" is larger");
    }
}

//OUTPUT
//Enter 3 numbers:
//        3 4 5
//        5 is larger
