package test.com.example.game_of_life;

import com.example.game_of_life.classes.Game;
import com.example.game_of_life.classes.World;
import org.junit.Assert;
import org.junit.Test;

public class GameTest {

    /*
        [0][1][0]
        [1][0][1]
        [0][1][0]
    */

    @Test
    public void FindFourNeighboursCellFromMiddleTest(){
        Game game = new Game();
        World world = game.getWorld();
        world.killCellForNextInstance(0,0);
        world.reviveCellForNextInstance(0, 1);
        world.killCellForNextInstance(0, 2);
        world.reviveCellForNextInstance(1,0);
        world.killCellForNextInstance(1,1);
        world.reviveCellForNextInstance(1,2);
        world.killCellForNextInstance(2,0);
        world.reviveCellForNextInstance(2,1);
        world.killCellForNextInstance(2,2);
        world.updateWorld();
        Assert.assertEquals(4, game.getAliveNeighborCellsNumber(1,1));
    }

    /*
        [0][0][0]
        [0][1][0]
        [0][0][0]
    */

    @Test
    public void FindZeroNeighboursCellFromMiddleTest(){
        Game game = new Game();
        World world = game.getWorld();
        world.killCellForNextInstance(0,0);
        world.killCellForNextInstance(0, 1);
        world.killCellForNextInstance(0, 2);
        world.killCellForNextInstance(1,0);
        world.reviveCellForNextInstance(1,1);
        world.killCellForNextInstance(1,2);
        world.killCellForNextInstance(2,0);
        world.killCellForNextInstance(2,1);
        world.killCellForNextInstance(2,2);
        world.updateWorld();
        Assert.assertEquals(0, game.getAliveNeighborCellsNumber(1,1));
    }

    /*
        [0][1][0]
        [1][1][0]
        [0][0][0]
    */

    @Test
    public void tryToReviveWithSuccessTest(){
        Game game = new Game();
        World world = game.getWorld();
        world.killCellForNextInstance(0,0);
        world.reviveCellForNextInstance(0, 1);
        world.killCellForNextInstance(0, 2);
        world.reviveCellForNextInstance(1,0);
        world.reviveCellForNextInstance(1,1);
        world.killCellForNextInstance(1,2);
        world.killCellForNextInstance(2,0);
        world.killCellForNextInstance(2,1);
        world.killCellForNextInstance(2,2);
        world.updateWorld();
        Assert.assertTrue(game.tryToReviveCell(0,0));
    }

    /*
        [0][1][0]
        [1][0][0]
        [0][0][0]
    */

    @Test
    public void tryToReviveWithFailTest(){
        Game game = new Game();
        World world = game.getWorld();
        world.killCellForNextInstance(0,0);
        world.reviveCellForNextInstance(0, 1);
        world.killCellForNextInstance(0, 2);
        world.reviveCellForNextInstance(1,0);
        world.killCellForNextInstance(1,1);
        world.killCellForNextInstance(1,2);
        world.killCellForNextInstance(2,0);
        world.killCellForNextInstance(2,1);
        world.killCellForNextInstance(2,2);
        world.updateWorld();
        Assert.assertFalse(game.tryToReviveCell(0,0));
    }

    /*
        [1][0][0]
        [0][1][0]
        [0][0][0]
    */


    @Test
    public void tryToKillWithSucessTest(){
        Game game = new Game();
        World world = game.getWorld();
        world.reviveCellForNextInstance(0,0);
        world.killCellForNextInstance(0, 1);
        world.killCellForNextInstance(0, 2);
        world.killCellForNextInstance(1,0);
        world.reviveCellForNextInstance(1,1);
        world.killCellForNextInstance(1,2);
        world.killCellForNextInstance(2,0);
        world.killCellForNextInstance(2,1);
        world.killCellForNextInstance(2,2);
        world.updateWorld();
        Assert.assertTrue(game.tryToKillCell(0,0));
    }

    /*
        [1][1][0]
        [1][0][0]
        [0][0][0]
    */

    @Test
    public void tryToKillWithFailTest(){
        Game game = new Game();
        World world = game.getWorld();
        world.reviveCellForNextInstance(0,0);
        world.reviveCellForNextInstance(0, 1);
        world.killCellForNextInstance(0, 2);
        world.reviveCellForNextInstance(1,0);
        world.killCellForNextInstance(1,1);
        world.killCellForNextInstance(1,2);
        world.killCellForNextInstance(2,0);
        world.killCellForNextInstance(2,1);
        world.killCellForNextInstance(2,2);
        world.updateWorld();
        Assert.assertFalse(game.tryToKillCell(0,0));
    }

}
