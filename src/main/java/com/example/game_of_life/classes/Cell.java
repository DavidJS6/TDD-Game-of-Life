package com.example.game_of_life.classes;

public class Cell {

    private int life;

    public Cell(int life){
        this.life = life;
    }

    public int getValue(){
        return this.life;
    }

    public boolean isAlive(){
        return this.life == 1;
    }

    public boolean isDead(){
        return this.life == 0;
    }

    public void revive(){
        this.life = 1;
    }

    public void kill(){
        this.life = 0;
    }

}
