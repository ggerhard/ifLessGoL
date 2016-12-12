package at.ggoerlich.gol;

/**
 * Prints the grid to Console
 */
public class GridPrinter {

    public static void printGrid(Grid grid) {
        for (int row = 0; row < grid.getRowCount(); row++) {
            System.out.println(grid.getRowRepresentation(row));
        }
        System.out.println("----------------");
    }
}
