package com.hw4;

public class Dog extends Animal {
    private String dogName;
    private static int dogCounter;

    public Dog() {
        dogCounter++;
    }

    public int getDogCounter() {
        return dogCounter;
    }

    public void setName(String name) {
        this.dogName = name;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.print(dogName + " пробежал " + distance + " метров." + "\n");
        } else {
            System.out.print(dogName + " остановился через " + 500 + " метров." + "\n");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.print(dogName + " проплыл " + distance + " метров." + "\n");
        } else {
            System.out.print(dogName + " остановился через " + 10 + " метров." + "\n");
        }
    }
}