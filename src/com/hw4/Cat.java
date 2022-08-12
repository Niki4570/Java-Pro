package com.hw4;

public class Cat extends Animal {
    public Cat() {
        super();
    }
    public Cat(String name) {
        super(name);
        catCounter++;
    }
    @Override
    public void Run(int distance){
        if (distance <= 200) {
            System.out.print(name + " пробежал " + distance + " метров." + "\n");
        }
        else{
            System.out.print(name + " остановился через " + 200 + " метров." + "\n");
        }
    }
    public void Swim(int distance){
        System.out.print(name + " не умеет плавать" + "\n");
    }
}
