package at.ggoerlich.gol;

import at.ggoerlich.gol.state.State;

import java.util.List;

/**
 * Representation of a Cell
 */
public class Cell {
    private int row;
    private int column;
    private State state;
    
    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public Cell(int row, int column, State state) {
        this.row = row;
        this.column = column;
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State calculateState(List<Cell> neighbours) {
        int neighbourCnt = countAliveNeighbours(neighbours);
        return state.nextState(neighbourCnt);
    }

    // acts as facade, hides internal state
    public int getAliveValue() {
        return state.getAliveValue();
    }

    @Override
    public String toString() {
        return state.getRepresentation();
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    private int countAliveNeighbours(List<Cell> neighbours) {
        int cnt = 0;
        for (Cell neighbour : neighbours) {
            cnt += neighbour.getAliveValue();
        }
        return cnt;
    }
}
