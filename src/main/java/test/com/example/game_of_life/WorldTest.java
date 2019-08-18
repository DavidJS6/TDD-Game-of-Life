package test.com.example.game_of_life;

import com.example.game_of_life.classes.World;
import org.junit.Assert;
import org.junit.Test;

public class WorldTest {

    @Test
    public void WorldHorizontalSizeTest(){
        World world = new World();
        Assert.assertEquals(10, world.getHorizonalSize());
    }

    @Test
    public void WorldVerticalSizeTest(){
        World world = new World();
        Assert.assertEquals(10, world.getVerticalSize());
    }

    @Test
    public void WorldDrawTest(){
        World world = new World();
        String worldRepresentation = world.getBodyRepresentation();
        Assert.assertEquals(310, worldRepresentation.length());
    }
}
