package at.ggoerlich.gol;

import at.ggoerlich.gol.state.AliveState;
import at.ggoerlich.gol.state.DeadState;

/**
 *  Game with predefined patterns, see http://www.conwaylife.com/wiki/Main_Page for examples
 */
public class PredefinedGame extends Game {

    public PredefinedGame() {
        super(9, 9);
        populateGrid_9x9();
    }

    private void populateGrid_9x9() {
        int row = 0;
        grid.addCell(new Cell(row,0, new DeadState()));
        grid.addCell(new Cell(row,1, new DeadState()));
        grid.addCell(new Cell(row,2, new DeadState()));
        grid.addCell(new Cell(row,3, new DeadState()));
        grid.addCell(new Cell(row,4, new DeadState()));
        grid.addCell(new Cell(row,5, new DeadState()));
        grid.addCell(new Cell(row,6, new DeadState()));
        grid.addCell(new Cell(row,7, new DeadState()));
        grid.addCell(new Cell(row,8, new DeadState()));

        row = row + 1;
        grid.addCell(new Cell(row,0, new DeadState()));
        grid.addCell(new Cell(row,1, new DeadState()));
        grid.addCell(new Cell(row,2, new DeadState()));
        grid.addCell(new Cell(row,3, new DeadState()));
        grid.addCell(new Cell(row,4, new AliveState()));
        grid.addCell(new Cell(row,5, new DeadState()));
        grid.addCell(new Cell(row,6, new DeadState()));
        grid.addCell(new Cell(row,7, new DeadState()));
        grid.addCell(new Cell(row,8, new DeadState()));

        row = row + 1;
        grid.addCell(new Cell(row,0, new DeadState()));
        grid.addCell(new Cell(row,1, new DeadState()));
        grid.addCell(new Cell(row,2, new DeadState()));
        grid.addCell(new Cell(row,3, new AliveState()));
        grid.addCell(new Cell(row,4, new DeadState()));
        grid.addCell(new Cell(row,5, new AliveState()));
        grid.addCell(new Cell(row,6, new DeadState()));
        grid.addCell(new Cell(row,7, new DeadState()));
        grid.addCell(new Cell(row,8, new DeadState()));

        row = row + 1;
        grid.addCell(new Cell(row,0, new DeadState()));
        grid.addCell(new Cell(row,1, new DeadState()));
        grid.addCell(new Cell(row,2, new AliveState()));
        grid.addCell(new Cell(row,3, new DeadState()));
        grid.addCell(new Cell(row,4, new DeadState()));
        grid.addCell(new Cell(row,5, new DeadState()));
        grid.addCell(new Cell(row,6, new AliveState()));
        grid.addCell(new Cell(row,7, new DeadState()));
        grid.addCell(new Cell(row,8, new DeadState()));

        row = row + 1;
        grid.addCell(new Cell(row,0, new DeadState()));
        grid.addCell(new Cell(row,1, new DeadState()));
        grid.addCell(new Cell(row,2, new AliveState()));
        grid.addCell(new Cell(row,3, new DeadState()));
        grid.addCell(new Cell(row,4, new AliveState()));
        grid.addCell(new Cell(row,5, new DeadState()));
        grid.addCell(new Cell(row,6, new AliveState()));
        grid.addCell(new Cell(row,7, new DeadState()));
        grid.addCell(new Cell(row,8, new DeadState()));

        row = row + 1;
        grid.addCell(new Cell(row,0, new DeadState()));
        grid.addCell(new Cell(row,1, new DeadState()));
        grid.addCell(new Cell(row,2, new AliveState()));
        grid.addCell(new Cell(row,3, new DeadState()));
        grid.addCell(new Cell(row,4, new DeadState()));
        grid.addCell(new Cell(row,5, new DeadState()));
        grid.addCell(new Cell(row,6, new AliveState()));
        grid.addCell(new Cell(row,7, new DeadState()));
        grid.addCell(new Cell(row,8, new DeadState()));

        row = row + 1;
        grid.addCell(new Cell(row,0, new DeadState()));
        grid.addCell(new Cell(row,1, new DeadState()));
        grid.addCell(new Cell(row,2, new DeadState()));
        grid.addCell(new Cell(row,3, new AliveState()));
        grid.addCell(new Cell(row,4, new DeadState()));
        grid.addCell(new Cell(row,5, new AliveState()));
        grid.addCell(new Cell(row,6, new DeadState()));
        grid.addCell(new Cell(row,7, new DeadState()));
        grid.addCell(new Cell(row,8, new DeadState()));

        row = row + 1;
        grid.addCell(new Cell(row,0, new DeadState()));
        grid.addCell(new Cell(row,1, new DeadState()));
        grid.addCell(new Cell(row,2, new DeadState()));
        grid.addCell(new Cell(row,3, new DeadState()));
        grid.addCell(new Cell(row,4, new AliveState()));
        grid.addCell(new Cell(row,5, new DeadState()));
        grid.addCell(new Cell(row,6, new DeadState()));
        grid.addCell(new Cell(row,7, new DeadState()));
        grid.addCell(new Cell(row,8, new DeadState()));

        row = row + 1;
        grid.addCell(new Cell(row,0, new DeadState()));
        grid.addCell(new Cell(row,1, new DeadState()));
        grid.addCell(new Cell(row,2, new DeadState()));
        grid.addCell(new Cell(row,3, new DeadState()));
        grid.addCell(new Cell(row,4, new DeadState()));
        grid.addCell(new Cell(row,5, new DeadState()));
        grid.addCell(new Cell(row,6, new DeadState()));
        grid.addCell(new Cell(row,7, new DeadState()));
        grid.addCell(new Cell(row,8, new DeadState()));
    }
}
