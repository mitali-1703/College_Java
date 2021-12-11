//To find first 15 terms of Fibonacci sequence.

package com.company;

public class P08 {
    public static void main(String[] args) {
        int a=-1,b=1,c;
        for(int i=1;i<=15;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}

//OUTPUT
//0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
