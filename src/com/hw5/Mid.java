package com.hw5;

public class Mid implements Participant {
    protected String name;
    protected int runLimit;
    protected int jumpLimit;

    public Mid(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public boolean run(Obstacle obstacle) {
        if (runLimit >= obstacle.getTrackLength()) {
            System.out.print("Участник " + name + " прошел препятствие (дорожка) на дистанции " + obstacle.getTrackLength() + ".\n");
            return true;
        }
        else {
            System.out.print("Участник " + name + " не прошел препятствие (дорожка) на дистанции " + obstacle.getTrackLength() + ".\n" + "Пройдено " + runLimit + ".\n");
            return false;
        }
    }

    public boolean jump(Obstacle obstacle) {
        if (jumpLimit >= obstacle.getWallHeight()) {
            System.out.print("Участник " + name + " прошел препятствие (стена) на высоте " + obstacle.getWallHeight() + ".\n");
            return true;
        } else {
            System.out.print("Участник " + name + " не прошел препятствие (стена) на высоте " + obstacle.getWallHeight() + ".\n" + "Пройдено " + jumpLimit + ".\n");
            return false;
        }
    }
    public boolean overcome(Obstacle obstacle) {
        if (obstacle instanceof Track) {
            return run(obstacle);
        } else {
            return jump(obstacle);
        }
    }
}