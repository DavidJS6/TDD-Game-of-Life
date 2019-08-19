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
    public void RevivingCellTest(){
        World world = new World();
        world.reviveCellForNextInstance(0,0);
        world.updateWorld();
        Assert.assertTrue(world.isCellAlive(0,0));
        Assert.assertFalse(world.isCellDead(0,0));
    }

    @Test
    public void KillingCellTest(){
        World world = new World();
        world.killCellForNextInstance(0,0);
        world.updateWorld();
        Assert.assertTrue(world.isCellDead(0,0));
        Assert.assertFalse(world.isCellAlive(0,0));
    }

    @Test
    public void WorldDrawTest(){
        World world = new World();
        String worldRepresentation = world.getBodyRepresentation();
        Assert.assertEquals(310, worldRepresentation.length());
    }
}
