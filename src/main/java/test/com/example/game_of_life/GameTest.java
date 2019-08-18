package test.com.example.game_of_life;

import com.example.game_of_life.classes.Game;
import com.example.game_of_life.classes.World;
import org.junit.Assert;
import org.junit.Test;

public class GameTest {


    /*
        [0][1][0]
        [1][1][0]
        [0][0][0]
    */

    @Test
    public void tryToReviveWithSuccessTest(){
        Game game = new Game();
        World world = game.getWorld();
        world.killCell(0,0);
        world.reviveCell(0, 1);
        world.killCell(0, 2);
        world.reviveCell(1,0);
        world.reviveCell(1,1);
        world.killCell(1,2);
        world.killCell(2,0);
        world.killCell(2,1);
        world.killCell(2,2);
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
    }

    /*
        [1][0][0]
        [0][1][0]
        [0][0][0]
    */


    @Test
    public void tryToKillWithSucessTest(){
        Game game = new Game();
    }

    /*
        [1][1][0]
        [1][0][0]
        [0][0][0]
    */

    @Test
    public void tryToKillWithFailTest(){
        Game game = new Game();
    }

}
