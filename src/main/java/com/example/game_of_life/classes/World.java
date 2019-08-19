package com.example.game_of_life.classes;

import java.util.Random;

public class World {

    private final int SIZE = 10;
    private Cell[][] body;

    public World() {
        this.body = new Cell[10][10];

        Random random = new Random();
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                int randomNumber = random.nextInt(2);
                this.body[y][x] = new Cell(randomNumber);
            }
        }
    }

    public int getHorizonalSize() {
        return this.body.length;
    }

    public int getVerticalSize() {
        return this.body[0].length;
    }

    public void reviveCellForNextInstance(int y, int x) {
        this.body[y][x].reviveForNextInstance();
    }

    public void killCellForNextInstance(int y, int x) {
        this.body[y][x].killForNextInstance();
    }

    public boolean isCellAlive(int y, int x) {
        return this.body[y][x].isAlive();
    }

    public boolean isCellDead(int y, int x) {
        return this.body[y][x].isDead();
    }

    public void updateWorld() {
        for (int y = 0; y < getVerticalSize(); y++) {
            for (int x = 0; x < getHorizonalSize(); x++) {
                this.body[y][x].updateCellLifeStatus();
            }
        }
    }

    public String getBodyRepresentation() {
        String worldRepresentation = "";
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                worldRepresentation += "[" + body[y][x].getValue() + "]";
            }
            worldRepresentation += "\n";
        }
        return worldRepresentation;
    }
}
