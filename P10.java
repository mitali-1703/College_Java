//To find largest and smallest number in an array.

package com.company;

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        int largest=0,smallest=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");

        int[] arr = new int[10];
        System.out.println("Enter elements of array:");
        for (int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0;i< arr.length;i++){
            for (int j=1;j< arr.length;j++){
                if (arr[j]>arr[i])
                    largest = arr[j];
            }

        }
    }
}
