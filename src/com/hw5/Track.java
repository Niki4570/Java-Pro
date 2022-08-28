package com.hw5;

public class Track implements Obstacle {
    protected int trackLength;

    public Track(int trackLength) {
        this.trackLength = trackLength;
    }

    public int getTrackLength() {
        return trackLength;
    }
    public int getWallHeight(){
        return 0;
    }
}