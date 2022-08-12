package com.hw4;

public class Main {
    public static void main (String[] args) {
        Cat cat1 = new Cat("Felix");
        cat1.Run(240);
        Dog dog1 = new Dog("Cooper");
        dog1.Run(490);
        cat1.Swim(10);
        dog1.Swim(6);
        Dog dog2 = new Dog("Charlie");
        dog2.Run(620);
        System.out.print("Количество котов: " + Cat.catCounter + "\n" + "Количество собак: " + Dog.dogCounter + "\n" + "Количество животных: " + Animal.animalCounter);
    }
}