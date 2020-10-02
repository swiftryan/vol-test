package com.company;

import java.util.LinkedList;
import java.util.List;

public class Game {

    enum Status {
        MISS,
        HIT,
        SUNK
    }

    private List<Ship> ships;

    public Game() {
        ships = new LinkedList<>();
        ships.add(new Ship());
    }

    public Status guessLocation(int x, int y) {
        Status status = Status.MISS;

        for(Ship ship: this.ships) {
            for(Point point: ship.getLocation()) {
                if(point.isHit()) {
                    return Status.MISS;
                }
                if(point.getX() == x && point.getY() == y) {
                    point.setHit(true);
                    status = Status.HIT;
                }
            }
            //Need to check if sunk ship
            if(ship.isSunk()) {
                status = Status.SUNK;
            }
        }

        return status;
    }

    public List<Ship> getShips() {
        return ships;
    }

    // User needs to guess location of ship and return "HIT" MISS SUNK

}
