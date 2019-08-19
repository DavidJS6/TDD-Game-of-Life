package test.com.example.game_of_life;

import com.example.game_of_life.classes.Cell;
import org.junit.Assert;
import org.junit.Test;

public class CellTest {

    @Test
    public void DeadCellTest(){
        Cell cell = new Cell(Cell.DEAD_VALUE);
        Assert.assertTrue(cell.isDead());
    }

    @Test
    public void AliveCellTest(){
        Cell cell = new Cell(Cell.ALIVE_VALUE);
        Assert.assertTrue(cell.isAlive());
    }

    @Test
    public void KillingCellTest(){
        Cell cell = new Cell(Cell.ALIVE_VALUE);
        cell.killForNextInstance();
        cell.updateCellLifeStatus();
        Assert.assertTrue(cell.isDead());
    }

    @Test
    public void RevivingCellTest(){
        Cell cell = new Cell(Cell.DEAD_VALUE);
        cell.reviveForNextInstance();
        cell.updateCellLifeStatus();
        Assert.assertTrue(cell.isAlive());
    }

}