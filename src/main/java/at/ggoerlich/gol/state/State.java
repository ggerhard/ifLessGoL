package at.ggoerlich.gol.state;

/**
 * Interface for States
 */
public interface State {

    State nextState(Integer liveNeighbourCount);

    int getAliveValue();

    String  getRepresentation();
}
