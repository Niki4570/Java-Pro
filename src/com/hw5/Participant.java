package com.hw5;

public interface Participant {
    String getName();
    int getRunLimit();
    int getJumpLimit();
    void run();
    void jump();
    void overcome();
}