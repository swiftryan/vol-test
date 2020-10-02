package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Game game = new Game();
        for(Ship ship: game.getShips()) {
            for(Point point: ship.getLocation()) {
                System.out.println("X: " + point.getX() + " -- Y: " + point.getY());
            }
        }

        Scanner sc = new Scanner(System.in);

        // UPdate
        while(true) {
            int inputX = sc.nextInt();
            int inputY = sc.nextInt();
            System.out.println(game.guessLocation(inputX, inputY));
        }

    }
}
