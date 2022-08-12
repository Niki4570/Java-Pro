package com.hw4;

public class Main {
    public static void main (String[] args) {
        Cat cat1 = new Cat("Felix");
        cat1.Run(150);
        Dog dog1 = new Dog("Cooper");
        dog1.Run(580);
        System.out.print("Количество котов: " + Animal.catCounter + "\n" + "Количество собак: " + Animal.dogCounter + "\n" + "Количество животных: " + Animal.animalCounter);
    }
}