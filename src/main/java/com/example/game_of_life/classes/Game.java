package com.example.game_of_life.classes;

public class Game {

    private World world;

    public Game(){
        world = new World();
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public boolean tryToReviveCell(int y, int x){
        return true;
    }

    public boolean tryToKillCell(int y, int x){
        return false;
    }

}
