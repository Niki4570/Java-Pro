package com.hw4;

public class Cat extends Animal {
    private String catName;
    private static int catCounter;

    public Cat() {
        catCounter++;
    }

    public int getCatCounter() {
        return catCounter;
    }

    public void setName(String name) {
        this.catName = name;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.print(catName + " пробежал " + distance + " метров." + "\n");
        } else {
            System.out.print(catName + " остановился через " + 200 + " метров." + "\n");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.print(catName + " не умеет плавать." + "\n");
    }
}