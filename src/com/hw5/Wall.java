package com.hw5;

public class Wall implements Obstacle {
    protected int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }
    public int getTrackLength() {
        return 0;
    }
    public int getWallHeight(){
        return wallHeight;
    }
}