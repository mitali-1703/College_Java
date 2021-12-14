//WAP to catch more than two exceptions.

package com.company;

public class P17 {
    public static void main(String[] args) {
        try{
            int a = 43/0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurs");
        }

        try{
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurs");
        }

        try{
            int[] arr = {4,0,1,3};
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurs");
        }
    }
}
