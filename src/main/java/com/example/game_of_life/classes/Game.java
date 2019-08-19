package com.example.game_of_life.classes;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Game {

    private World world;

    private static final int NUMBER_OF_CELLS_TO_REVIVE = 3;
    private static final int MINIMUM_NUMBER_OF_CELLS_TO_KEEP_LIVE = 2;
    private static final int MAXIMUM_NUMBER_OF_CELLS_TO_KEEP_LIVE = 3;

    public Game() {
        world = new World();
    }

    public World getWorld() {
        return world;
    }

    public void startLimitedGame() {
        for (int i = 0; i < 10; i++) {
            System.out.println(world.getBodyRepresentation());
            updateWorldInstance();
        }
    }

    public void startEndlessGame() {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println(world.getBodyRepresentation());
                updateWorldInstance();
            }
        };
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.scheduleWithFixedDelay(task, 0, 2, TimeUnit.SECONDS);
    }

    public void updateWorldInstance() {
        for (int y = 0; y < world.getHorizonalSize(); y++) {
            for (int x = 0; x < world.getHorizonalSize(); x++) {
                if (world.isCellAlive(y, x)) {
                    tryToKillCell(y, x);
                } else {
                    tryToReviveCell(y, x);
                }
            }
        }
        world.updateWorld();
    }

    public boolean tryToReviveCell(int y, int x) {
        int aliveNeightbors = getAliveNeighborCellsNumber(y, x);
        if (aliveNeightbors == NUMBER_OF_CELLS_TO_REVIVE) {
            world.reviveCellForNextInstance(y, x);
            return true;
        }
        return false;
    }

    public boolean tryToKillCell(int y, int x) {
        int aliveNeightbors = getAliveNeighborCellsNumber(y, x);
        if (aliveNeightbors < MINIMUM_NUMBER_OF_CELLS_TO_KEEP_LIVE || aliveNeightbors > MAXIMUM_NUMBER_OF_CELLS_TO_KEEP_LIVE) {
            world.killCellForNextInstance(y, x);
            return true;
        }
        return false;
    }

    public int getAliveNeighborCellsNumber(int y, int x) {
        int aliveCells = 0;
        for (int vertical = y - 1; vertical <= y + 1; vertical++) {
            for (int horizontal = x - 1; horizontal <= x + 1; horizontal++) {
                if ((vertical >= 0 && horizontal >= 0) && (vertical < world.getVerticalSize() && horizontal < world.getHorizonalSize())) {
                    if (!(vertical == y && horizontal == x)) {
                        if (world.isCellAlive(vertical, horizontal)) {
                            aliveCells++;
                        }
                    }
                }
            }
        }
        return aliveCells;
    }

}
