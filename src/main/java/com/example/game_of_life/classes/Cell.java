package com.example.game_of_life.classes;

public class Cell {

    private int actualLifeStatus;
    private int nextLifeStatus;

    public static final int ALIVE_VALUE = 1;
    public static final int DEAD_VALUE = 0;

    public Cell(int life){
        this.actualLifeStatus = life;
        this.nextLifeStatus = life;
    }

    public int getValue(){
        return this.actualLifeStatus;
    }

    public boolean isAlive(){
        return this.actualLifeStatus == ALIVE_VALUE;
    }

    public boolean isDead(){
        return this.actualLifeStatus == DEAD_VALUE;
    }

    public void reviveForNextInstance(){
        this.nextLifeStatus = ALIVE_VALUE;
    }

    public void killForNextInstance(){
        this.nextLifeStatus = DEAD_VALUE;
    }

    public void updateCellLifeStatus(){
        this.actualLifeStatus = this.nextLifeStatus;
    }

}
