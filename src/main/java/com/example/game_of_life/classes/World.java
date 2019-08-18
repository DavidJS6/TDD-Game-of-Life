package com.example.game_of_life.classes;

import java.util.Random;

public class World {

    private final int SIZE = 10;
    private Cell[][] body;

    public World(){
        this.body = new Cell[10][10];

        Random random = new Random();
        for (int y = 0; y < SIZE; y++){
            for(int x = 0; x < SIZE; x++){
                body[y][x] = new Cell(random.nextInt(2));
            }
        }

    }

    public Cell[][] getBody() {
        return body;
    }

    public void setBody(Cell[][] body) {
        this.body = body;
    }

    public int getHorizonalSize(){
        return this.body.length;
    }

    public int getVerticalSize(){
        return this.body[0].length;
    }

    public void reviveCell(int y, int x){
        this.body[y][x].revive();
    }

    public void killCell(int y, int x){
        this.body[y][x].kill();
    }

    public String getBodyRepresentation(){
        String worldRepresentation = "";

        for (int y = 0; y < SIZE; y++){

            for(int x = 0; x < SIZE; x++){
                worldRepresentation += "[" + body[y][x].getValue() + "]";
            }
            worldRepresentation += "\n";

        }

        return worldRepresentation;
    }
}
