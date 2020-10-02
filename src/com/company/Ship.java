package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Ship {
    List<Point> location;

    // Add logic for overlap of another ship
    public Ship() {
        location = new LinkedList<>();

        Random r = new Random();
        int length = r.nextInt(10) + 1;
        boolean vert = r.nextBoolean();
        int randomStart = r.nextInt(10 - length + 1);

        int stablePos = r.nextInt(10);
        if(vert) {
            for(int i = randomStart; i < randomStart + length; i++) {
                location.add(new Point(stablePos, i));
            }
        } else {
            for(int i = randomStart; i < randomStart + length; i++) {
                location.add(new Point(i, stablePos));
            }
        }
    }

    public boolean isSunk() {
        for(Point point: location) {
            if(!point.isHit()) {
                return false;
            }
        }
        return true;
    }

    public List<Point> getLocation() {
        return location;
    }
}
