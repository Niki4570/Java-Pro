package com.hw4;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Felix");
        cat1.run(240);
        Dog dog1 = new Dog();
        dog1.setName("Cooper");
        dog1.run(490);
        cat1.swim(10);
        dog1.swim(6);
        Dog dog2 = new Dog();
        dog2.setName("Yuma");
        dog2.run(620);
        System.out.print("Количество котов: " + cat1.getCatCounter() + "\n" + "Количество собак: " + dog1.getDogCounter() + "\n" + "Количество животных: " + cat1.getAnimalCounter());
    }
}