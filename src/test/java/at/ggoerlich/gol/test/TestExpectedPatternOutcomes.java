package at.ggoerlich.gol.test;

import at.ggoerlich.gol.Game;
import at.ggoerlich.gol.Grid;
import at.ggoerlich.gol.GridPrinter;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Tests if predefined patterns produce the expected outcome
 */
public class TestExpectedPatternOutcomes {


    @Test
    // cells die in 1 round because of underpopulation
    public void testUnterpopulationPattern1() throws InterruptedException {
        Game underpopulationGame = TestGameFactory.underpopulation_3x3_1CellAlive();
        underpopulationGame.run();
        assertEquals(3, underpopulationGame.getRoundCount()); // game ends in round 2 - no living cells exist
    }

    @Test
    // cells die in 1 round because of underpopulation
    public void testUnterpopulationPattern2() throws InterruptedException {
        Game underpopulationGame = TestGameFactory.underpopulation_3x3_2CellsAlive();
        underpopulationGame.run();
        assertEquals(3, underpopulationGame.getRoundCount());
    }

    @Test
    // cells die in 1 round because of underpopulation
    public void testUnterpopulationPattern3() throws InterruptedException {
        Game underpopulationGame = TestGameFactory.underpopulation_3x3_CornerCellsAlive();
        underpopulationGame.run();
        assertEquals(3, underpopulationGame.getRoundCount());
    }

    @Test
    public void testOverpopulationPattern() throws InterruptedException {
        Game overpopulationGame = TestGameFactory.overpopulation_3x3();
        Grid grid = overpopulationGame.getGrid();
        GridPrinter.printGrid(grid);
        assertEquals(9, grid.countLivingCells());

        grid = grid.calculateNextRound();
        GridPrinter.printGrid(grid);
        assertEquals(4, grid.countLivingCells()); // all cells except corner cells died

        grid = grid.calculateNextRound();
        GridPrinter.printGrid(grid);
        assertEquals(0, grid.countLivingCells()); // corner cells died because of underpopulation
    }

    @Test
    public void testStaticPattern() throws InterruptedException {
        Game staticGame = TestGameFactory.staticPattern_3x3();
        Grid grid = staticGame.getGrid();
        GridPrinter.printGrid(grid);
        assertEquals(4, grid.countLivingCells());

        grid = grid.calculateNextRound();
        GridPrinter.printGrid(grid);
        assertEquals(4, grid.countLivingCells()); // all cells are still alive

        grid = grid.calculateNextRound();
        GridPrinter.printGrid(grid);
        assertEquals(4, grid.countLivingCells()); // still unchanged
    }

    @Test
    public void testReanimation() throws InterruptedException {
        Game reanimationGame = TestGameFactory.reanimation_3x3();
        Grid grid = reanimationGame.getGrid();
        GridPrinter.printGrid(grid);
        assertEquals(3, grid.countLivingCells());

        grid = grid.calculateNextRound();
        GridPrinter.printGrid(grid);
        assertEquals(1, grid.countLivingCells()); // center cell came to life

        grid = grid.calculateNextRound();
        GridPrinter.printGrid(grid);
        assertEquals(0, grid.countLivingCells()); // cell died of underpopulation
    }
}
