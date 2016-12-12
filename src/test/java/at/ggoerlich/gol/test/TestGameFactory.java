package at.ggoerlich.gol.test;

import at.ggoerlich.gol.Cell;
import at.ggoerlich.gol.Game;
import at.ggoerlich.gol.Grid;
import at.ggoerlich.gol.state.AliveState;
import at.ggoerlich.gol.state.DeadState;

/**
 * Produces Game Patterns for Tests
 */
public class TestGameFactory {

    /*******************************************************
     * Underpopulation
     *******************************************************/

    public static Game underpopulation_3x3_1CellAlive() {
        Grid grid = new Grid(3,3);
        grid.addCell(new Cell(0,0, new DeadState()));
        grid.addCell(new Cell(0,1, new DeadState()));
        grid.addCell(new Cell(0,2, new DeadState()));

        grid.addCell(new Cell(1,0, new DeadState()));
        grid.addCell(new Cell(1,1, new AliveState()));
        grid.addCell(new Cell(1,2, new DeadState()));

        grid.addCell(new Cell(2,0, new DeadState()));
        grid.addCell(new Cell(2,1, new DeadState()));
        grid.addCell(new Cell(2,2, new DeadState()));

        return new Game(grid);
    }

    public static Game underpopulation_3x3_2CellsAlive() {
        Grid grid = new Grid(3,3);
        grid.addCell(new Cell(0,0, new DeadState()));
        grid.addCell(new Cell(0,1, new DeadState()));
        grid.addCell(new Cell(0,2, new DeadState()));

        grid.addCell(new Cell(1,0, new DeadState()));
        grid.addCell(new Cell(1,1, new AliveState()));
        grid.addCell(new Cell(1,2, new AliveState()));

        grid.addCell(new Cell(2,0, new DeadState()));
        grid.addCell(new Cell(2,1, new DeadState()));
        grid.addCell(new Cell(2,2, new DeadState()));

        return new Game(grid);
    }

    public static Game underpopulation_3x3_CornerCellsAlive() {
        Grid grid = new Grid(3,3);
        grid.addCell(new Cell(0,0, new AliveState()));
        grid.addCell(new Cell(0,1, new DeadState()));
        grid.addCell(new Cell(0,2, new AliveState()));

        grid.addCell(new Cell(1,0, new DeadState()));
        grid.addCell(new Cell(1,1, new DeadState()));
        grid.addCell(new Cell(1,2, new DeadState()));

        grid.addCell(new Cell(2,0, new AliveState()));
        grid.addCell(new Cell(2,1, new DeadState()));
        grid.addCell(new Cell(2,2, new AliveState()));

        return new Game(grid);
    }

    /*******************************************************
     * Static
     *******************************************************/

    // 4 cells - each has 3 neighbours
    public static Game staticPattern_3x3() {
        Grid grid = new Grid(3,3);
        grid.addCell(new Cell(0,0, new AliveState()));
        grid.addCell(new Cell(0,1, new AliveState()));
        grid.addCell(new Cell(0,2, new DeadState()));

        grid.addCell(new Cell(1,0, new AliveState()));
        grid.addCell(new Cell(1,1, new AliveState()));
        grid.addCell(new Cell(1,2, new DeadState()));

        grid.addCell(new Cell(2,0, new DeadState()));
        grid.addCell(new Cell(2,1, new DeadState()));
        grid.addCell(new Cell(2,2, new DeadState()));

        return new Game(grid);
    }

    /*******************************************************
     * Overpopulation
     *******************************************************/

    // 4 cells - each has 3 neighbours
    public static Game overpopulation_3x3() {
        Grid grid = new Grid(3,3);
        grid.addCell(new Cell(0,0, new AliveState()));
        grid.addCell(new Cell(0,1, new AliveState()));
        grid.addCell(new Cell(0,2, new AliveState()));

        grid.addCell(new Cell(1,0, new AliveState()));
        grid.addCell(new Cell(1,1, new AliveState()));
        grid.addCell(new Cell(1,2, new AliveState()));

        grid.addCell(new Cell(2,0, new AliveState()));
        grid.addCell(new Cell(2,1, new AliveState()));
        grid.addCell(new Cell(2,2, new AliveState()));

        return new Game(grid);
    }

    /*******************************************************
     * Reanimation
     *******************************************************/

    public static Game reanimation_3x3() {
        Grid grid = new Grid(3,3);
        grid.addCell(new Cell(0,0, new AliveState()));
        grid.addCell(new Cell(0,1, new DeadState()));
        grid.addCell(new Cell(0,2, new AliveState()));

        grid.addCell(new Cell(1,0, new DeadState()));
        grid.addCell(new Cell(1,1, new DeadState()));  // this one will come to life!
        grid.addCell(new Cell(1,2, new DeadState()));

        grid.addCell(new Cell(2,0, new DeadState()));
        grid.addCell(new Cell(2,1, new AliveState()));
        grid.addCell(new Cell(2,2, new DeadState()));

        return new Game(grid);
    }
}
