package com.hw5;

public class Person extends Limits implements Participant, Obstacle{
    int runLimit = 150;
    int jumpLimit = 4;

    public Person(int runLimit, int jumpLimit) {
        super();
    }

    public void reachTrack(){
        run();
    }

    public void reachWall() {
        jump();
    }

    public void overcome() {
        System.out.print("Человек пробежал беговую дорожку.\n");
    }
    public void run1() {
        if (runLimit >= Track.trackLength) {
            System.out.print("Человек пробежал беговую дорожку.\n");
            overcome();
        }
        else {
            System.out.print("Человек не пробежал " + Track.trackLength + " метров и выбывает.\n");
        }
    }

    public void run0() {
        if (runLimit >= Track.trackLength) {
            System.out.print("Человек пробежал беговую дорожку.\n");
            overcome();
        }
        else {
            System.out.print("Человек не пробежал " + Track.trackLength + " метров и выбывает.\n");
        }
    }

    public void jump() {
        long wallHeight = Math.round(Math.random()*10);
        if (jumpLimit >= wallHeight) {
            overcome();
        }
        else {
            System.out.print("Человек не перепрыгнул через " + Wall.wallHeight + "метров и выбывает.\n");
        }
    }
}