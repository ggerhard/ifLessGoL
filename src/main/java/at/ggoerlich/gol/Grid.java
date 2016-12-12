package at.ggoerlich.gol;

import at.ggoerlich.gol.state.State;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * A Grid of Cells
 */
public class Grid {

    private final Cell[][] matrix;
    final int rows;
    final int columns;

    public Grid(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        matrix = new Cell[rows][columns];
    }

    public void addCell(Cell c) {
        matrix[c.getRow()][c.getColumn()] = c;
    }

    public Grid calculateNextRound() {
        Grid grid = new Grid(rows, columns);
        for (Cell[] cells : matrix) {
            for (Cell cell : cells) {
                placeCellWithNewStateInGrid(grid, cell);
            }
        }
        return grid;
    }

    private void placeCellWithNewStateInGrid(Grid grid, Cell cell) {
        List<Cell> cellNeighbours = getCellNeighbours(cell);
        State state = cell.calculateState(cellNeighbours);
        grid.addCell(new Cell(cell.getRow(),cell.getColumn(),state));
    }

    public String getRowRepresentation(int rowNumber) {
        StringBuilder result = new StringBuilder();
        for (Cell cell : matrix[rowNumber]) {
            result.append(cell.toString());
        }
        return result.toString();
    }

    public int getRowCount() {
        return matrix.length;
    }

    public int countLivingCells() {
        int result = 0;
        for (Cell[] cells : matrix) {
            for (Cell cell : cells) {
                result += cell.getAliveValue();
            }
        }
        return result;
    }

    private List<Cell> getCellNeighbours(Cell cell) {
        List<Cell> neighbours = new ArrayList<Cell>();
        neighbours.addAll(getRowSection(cell.getRow() -1, cell.getColumn()));
        neighbours.addAll(getRowSectionWithoutSelf(cell.getRow(), cell.getColumn()));
        neighbours.addAll(getRowSection(cell.getRow() +1, cell.getColumn()));
        return neighbours;
    }

    private Collection<? extends Cell> getRowSection(int x, int y) {
        List<Cell> section = new ArrayList<Cell>();
        try {
            Cell[] row = matrix[x];
            addArrayCellToListIfExisting(section, row, y-1);
            addArrayCellToListIfExisting(section, row, y);
            addArrayCellToListIfExisting(section, row, y+1);
        } catch (ArrayIndexOutOfBoundsException e) {
            section = Collections.emptyList();
        }
        return section;
    }

    private Collection<? extends Cell> getRowSectionWithoutSelf(int x, int y) {
        List<Cell> section = new ArrayList<Cell>();
        try {
            Cell[] row = matrix[x];
            addArrayCellToListIfExisting(section, row, y-1);
            addArrayCellToListIfExisting(section, row, y+1);
        } catch (ArrayIndexOutOfBoundsException e) {
            section = Collections.emptyList();
        }
        return section;
    }

    private void addArrayCellToListIfExisting(List list, Cell[] array, int position) {
        try {
            list.add(array[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // just go on with the next cell
        }
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
}
