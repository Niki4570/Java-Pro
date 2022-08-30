package com.hw5;

public interface Participant {
    boolean run(Obstacle obstacle);
    boolean jump(Obstacle obstacle);
    boolean overcome(Obstacle obstacle, Participant participant);
}