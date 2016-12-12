package at.ggoerlich.gol;

import static java.lang.Thread.sleep;

/**
 * Game - init and run the game of life
 */
public class Game {

    private static final int ROUND_LIMIT = 2000;
    protected Grid grid;
    private int roundCount;

    public Game(int rows, int columns) {
        grid = new Grid(rows, columns);
    }

    public Game(Grid grid) {
        this.grid = grid;
    }

    public void run() throws InterruptedException {
        int livingCellCnt = 99;
        for (roundCount = 1; roundCount < ROUND_LIMIT && livingCellCnt > 0; roundCount++) {
            livingCellCnt = grid.countLivingCells();
            System.out.println("Round " + roundCount + ", Living Cells: " + livingCellCnt);
            GridPrinter.printGrid(grid);
            grid = grid.calculateNextRound();
            sleep(500L);
        }
    }

    public Grid getGrid() {
        return grid;
    }

    public int getRoundCount() {
        return roundCount;
    }
}
