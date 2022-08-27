package com.hw5;

public class Cat implements Participant{

    public String getName() {
        return name;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }

    protected String name;
    protected int runLimit;
    protected int jumpLimit;

    public Cat(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
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