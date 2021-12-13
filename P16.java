//WAP to show that the variables in an interface are implicitly static and final and methods are automatically public.

package com.company;

interface Human{
    int a=10;
    void eat();
    void sleep();
}
public class P16 implements Human{
    public void eat(){
        System.out.println("Human eats!");
    }
    public void sleep(){
        System.out.println("Human sleeps!");
    }
    public static void main(String[] args) {
        System.out.println("Static variable: "+a);
        //++a;  it will generate compile time error as variable a is final

        P16 p = new P16();
        p.eat();
        p.sleep();
    }
}

//OUTPUT
//Static variable: 10
//Human eats!
//Human sleeps!
