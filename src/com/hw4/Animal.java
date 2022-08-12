package com.hw4;

public class Animal {
    protected String name;
    protected static int animalCounter;
    public Animal(String name) {
        this.name = name;
        animalCounter++;
    }
    public Animal() {}
    public void Run(int distance){
        if (distance <= 0) {
            System.out.print(name + " пробежал " + distance + " метров." + "\n");
        }
        else{
            System.out.print(name + " остановился через " + 0 + " метров." + "\n");
        }
    }
    public void Swim(int distance){
        if (distance <= 0) {
            System.out.print(name + " проплыл " + distance + " метров." + "\n");
        } else{
            System.out.print(name + " остановился через " + 0 + " метров." + "\n");
        }
    }
}