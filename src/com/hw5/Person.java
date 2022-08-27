package com.hw5;

public class Person extends Limits implements Participant{

    public String getName() {
        return name;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }

    public Person(String name, int runLimit, int jumpLimit) {
        super();
    }

    public void run() {
        System.out.print(name + " пробежал беговую дорожку.\n");
    }
    public void jump() {
        System.out.print(name + " перепрыгнул стену.\n");
    }

    public void overcome() {
    }
}