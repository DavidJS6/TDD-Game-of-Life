package test.com.example.game_of_life;

import com.example.game_of_life.classes.Cell;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CellTest {

    @Test
    public void DeadCellTest(){
        Cell cell = new Cell(0);
        Assert.assertTrue(cell.isDead());
    }

    @Test
    public void AliveCellTest(){
        Cell cell = new Cell(1);
        Assert.assertTrue(cell.isAlive());
    }

    @Test
    public void KillingCellTest(){
        Cell cell = new Cell(1);
        cell.kill();
        Assert.assertTrue(cell.isDead());
    }

    @Test
    public void RevivingCellTest(){
        Cell cell = new Cell(0);
        cell.revive();
        Assert.assertTrue(cell.isAlive());
    }

}