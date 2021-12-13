//WAP to create a Player class and inherit three classes Cricket_Player, Football_Player and Hockey_Player.

package com.company;

import java.nio.FloatBuffer;

class Player{
    String name;
    int age;

    Player(String name,int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("");
        System.out.println("Player name: "+name);
        System.out.println("Age: "+age);
    }
}
class Cricket_Player extends Player{
    String type;
    Cricket_Player(String name,int age,String type){
        super(name,age);
        this.type = type;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Player type: "+type);
    }
}
class Football_Player extends Player{
    String type;
    Football_Player(String name,int age,String type){
        super(name,age);
        this.type = type;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Player type: "+type);
    }
}
class Hockey_Player extends Player{
    String type;
    Hockey_Player(String name,int age,String type){
        super(name,age);
        this.type = type;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Player type: "+type);
    }
}

public class P14 {
    public static void main(String[] args) {
        Cricket_Player p1 = new Cricket_Player("Rohit",25,"Cricket");
        p1.display();
        Football_Player p2 = new Football_Player("Ronaldo",29,"Football");
        p2.display();
        Hockey_Player p3 = new Hockey_Player("Rohan",32,"Hockey");
        p3.display();
    }
}

//OUTPUT
//        Player name: Rohit
//        Age: 25
//        Player type: Cricket
//
//        Player name: Ronaldo
//        Age: 29
//        Player type: Football
//
//        Player name: Rohan
//        Age: 32
//        Player type: Hockey
