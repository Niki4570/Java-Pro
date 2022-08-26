package com.hw5;

public class Robot implements Participant, Obstacle {
    int runLimit = 175;
    int jumpLimit = 7;

    public Robot(int runLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public void run(){
        track();
    }

    public void jump() {
        wall();
    }

    public void overcome() {
        System.out.print("Человек пробежал беговую дорожку.\n");
    }

    public void track() {
        long trackLength = Math.round(Math.random()*((100-20)+1))+20;
        if (runLimit >= trackLength) {
            overcome();
        }
        else {
            System.out.print("Робот не пробежал " + trackLength + " метров и выбывает.\n");
        }
    }
    public void wall() {
        long wallLength = Math.round(Math.random()*10);
        if (jumpLimit >= wallLength) {
            overcome();
        }
        else {
            System.out.print("Робот не перепрыгнул через " + wallLength + "метров и выбывает.\n");
        }
    }
}