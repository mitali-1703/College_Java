//WAP to show how a class implements two interfaces.

package com.company;

interface Polygon {
    void getArea();

    // default method
    default void getSides() {
        System.out.println("I can get sides of a polygon.");
    }
}

// implements the interface
class Triangle implements Polygon {
    public void getArea() {
        int a = 6;
        int b = 5;
        int c = 2;
        double s =(double) (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of the triangle is " + area);
    }

    // overrides the getSides()
    public void getSides() {
        System.out.println("I have 3 sides.");
    }
}

// implements the interface
class Square implements Polygon {
    public void getArea() {
        int length = 5;
        int area = length * length;
        System.out.println("The area of the square is " + area);
    }
}

class P15 {
    public static void main(String[] args) {

        // create an object of Triangle
        Triangle r1 = new Triangle();
        r1.getArea();
        r1.getSides();

        // create an object of Square
        Square s1 = new Square();
        s1.getArea();
        s1.getSides();
    }
}

//OUTPUT
//        The area of the triangle is 4.683748498798798
//        I have 3 sides.
//        The area of the square is 25
//        I can get sides of a polygon.


