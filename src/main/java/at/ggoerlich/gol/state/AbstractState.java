package at.ggoerlich.gol.state;

import java.util.Map;

/**
 * Common state behaviour
 */
public abstract class AbstractState implements State {

    protected abstract Map<Integer, Class<? extends State>> getNextStates();

    public State nextState(Integer liveNeighbourCount) {
        Class<? extends State> state = getNextStates().get(liveNeighbourCount);
        try {
            return state.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
            // could also return new DeadState() as default
        }
    }

    public int getAliveValue() {
        return 0;
    }

}
