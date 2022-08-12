package com.hw4;

public class Dog extends Animal {
    public Dog() {
        super();
    }
    public Dog(String name) {
        super(name);
        dogCounter++;
    }
    @Override
    public void Run(int distance){
        if (distance <= 500) {
            System.out.print(name + " пробежал " + distance + " метров." + "\n");
        }
        else{
            System.out.print(name + " остановился через " + 500 + " метров." + "\n");
        }
    }
    public void Swim(int distance){
        if (distance <= 10) {
            System.out.print(name + " проплыл " + distance + " метров." + "\n");
        } else{
            System.out.print(name + " остановился через " + 10 + " метров." + "\n");
        }
    }
}