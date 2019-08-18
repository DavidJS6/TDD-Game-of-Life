package com.example.game_of_life.classes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Game {

    private World actualWorld;
    private World nextWorld;

    public Game(){
        actualWorld = new World();
    }

    public World getWorld() {
        return actualWorld;
    }

    public void setWorld(World world) {
        this.actualWorld = world;
    }

    public void startGame(){

        for(int i = 0; i < 10; i++) {
            System.out.println(actualWorld.getBodyRepresentation());

            for (int y = 0; y < actualWorld.getHorizonalSize(); y++) {
                for (int x = 0; x < actualWorld.getHorizonalSize(); x++) {
                    if (actualWorld.isCellAlive(y, x)) {
                        tryToKillCell(y, x);
                    } else {
                        tryToReviveCell(y, x);
                    }
                }
            }
            actualWorld = nextWorld;
        }
    }

    public boolean tryToReviveCell(int y, int x){
        int aliveNeightbors = getAliveNeighborCellsNumber(y, x);
        if(aliveNeightbors == 3){
            nextWorld.reviveCell(y, x);
            return true;
        }
        return false;
    }

    public boolean tryToKillCell(int y, int x){
        int aliveNeightbors = getAliveNeighborCellsNumber(y, x);
        if(aliveNeightbors < 2 || aliveNeightbors > 5){
            nextWorld.killCell(y, x);
            return true;
        }
        return false;
    }

    public int getAliveNeighborCellsNumber(int y, int x){
        int aliveCells = 0;
        for(int vertical = y - 1; vertical <= y + 1; vertical++){
            for (int horizontal = x - 1; horizontal <= x + 1; horizontal++ ){
                if((vertical >= 0 && horizontal >= 0) && (vertical != y && horizontal != x)) {
                    if (nextWorld.isCellAlive(vertical, horizontal)) {
                        aliveCells++;
                    }
                }
            }
        }
        return aliveCells;
    }

}
