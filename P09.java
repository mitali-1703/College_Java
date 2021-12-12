//To print armstrong numbers between 0 to 1000.

package com.company;

public class P09 {
    public static void main(String[] args) {
        int a,temp;
        for (int i=0;i<=1000;i++){
            temp=i;
            int sum=0;
            while (temp>0) {
                a = temp % 10;
                sum = sum + (a * a * a);
                temp = temp / 10;
            }
            if (sum==i){
                System.out.println(sum);
            }
        }
    }
}

//OUTPUT
//        0
//        1
//        153
//        370
//        371
//        407
