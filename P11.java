//To write a java program that creates a string object and initializes it with your name
// and performs the following operations:-
//i) To find the length of the string object using appropriate String method.
//ii) To find whether the character ‘a’ is present in the string. If yes find the number of times ‘a’ appear in the
// name and the location where it appears.

package com.company;

public class P11 {
    public static void main(String[] args) {
        String str="sukanya chakraborty";

        // to find length of string
        System.out.println("Length of string: "+str.length());

        char[] result = str.toCharArray();
        int count = str.indexOf('a');

        if (count==0)
            System.out.println("a is not present in the string");
        else
            for (int i=0;i<result.length;i++){
                if (result[i]=='a'){
                    System.out.println("a is present at index: "+i);
                }
            }
    }
}

//OUTPUT
//Length of string: 19
//        a is present at index: 3
//        a is present at index: 6
//        a is present at index: 10
//        a is present at index: 13

