package at.ggoerlich.gol;

/**
 * Game with randomly initialized Cells
 */
public class RandomGame extends Game {

    private final RandomStateGenerator ramdomStateGenerator;

    public RandomGame(int x, int y) {
        super(x, y);
        ramdomStateGenerator = new RandomStateGenerator();
        populateGrid();
    }

    private void populateGrid() {
        for (int y = 0; y < getGrid().getColumns(); y++) {
            for (int x = 0; x < getGrid().getRows(); x++) {
                addNewRandomCellToGrid(y, x);
            }
        }
    }

    private void addNewRandomCellToGrid(int y, int x) {
        Cell cell = new Cell(x, y);
        cell.setState(ramdomStateGenerator.getNextState());
        grid.addCell(cell);
    }
}
