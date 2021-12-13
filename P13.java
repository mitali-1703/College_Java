//To create a class Rectangle with the data fields width, length, area and colour. The length, width and area are of
// double type and colour is of string type.The methods are get_length(), get_width(), get_colour() and find_area().
//Create two objects of Rectangle and compare their area and colour. If the area and colour both are the same
// for the objects then display “Matching Rectangles”, otherwise display “Non-matching Rectangle”.

package com.company;

import java.util.Scanner;

class Rectangle{
    double width,length,area;
    String color;

    Scanner sc = new Scanner(System.in);

    Rectangle()
    {
        System.out.println("Enter the length: ");
        length=sc.nextDouble();

        System.out.println("Enter the width: ");
        width=sc.nextDouble();

        System.out.println("Enter the color: ");
        color=sc.next();

        area =length*width;
    }

    void get_length(){
        System.out.println("Length of Rectangle is: "+length);
    }
    void get_width(){
        System.out.println("Width of Rectangle is: "+width);
    }
    void get_color(){
        System.out.println("Colour of Rectangle is: "+color);
    }
    void find_area(){
        System.out.println("Area of Rectangle is: "+area);
    }
}
public class P13 {
    public static void main(String[] args) {
        System.out.println("First rectangle:-");
        Rectangle r1 = new Rectangle();
        r1.get_length();
        r1.get_width();
        r1.get_color();
        r1.find_area();

        System.out.println("\nSecond rectangle:-");
        Rectangle r2 = new Rectangle();
        r2.get_length();
        r2.get_width();
        r2.get_color();
        r2.find_area();

        if ((r1.area==r2.area) && (r1.color.equals(r2.color))){
            System.out.println("Matching Rectangles");
        }
        else
            System.out.println("Non-matching Rectangle");
    }
}

//OUTPUT
//        First rectangle:-
//        Enter the length:
//        5
//        Enter the width:
//        2
//        Enter the color:
//        red
//        Length of Rectangle is: 5.0
//        Width of Rectangle is: 2.0
//        Colour of Rectangle is: red
//        Area of Rectangle is: 10.0
//        Second rectangle:-
//        Enter the length:
//        19
//        Enter the width:
//        7
//        Enter the color:
//        red
//        Length of Rectangle is: 19.0
//        Width of Rectangle is: 7.0
//        Colour of Rectangle is: red
//        Area of Rectangle is: 133.0
//        Non-matching Rectangle

