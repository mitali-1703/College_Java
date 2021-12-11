//To print armstrong numbers between 0 to 1000.

package com.company;

public class P09 {
    public static void main(String[] args) {
        int sum=0,a,temp;
        for (int i=100;i<=999;i++){
            temp=i;
            while (i>0) {
                a = i % 10;
                sum = sum + (a * a * a);
                i = i / 10;
            }
            if (sum==temp){
                System.out.println(sum);
            }
        }
    }
}
