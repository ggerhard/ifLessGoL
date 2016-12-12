package at.ggoerlich.gol.state;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * State of a living Cell
 */
public class AliveState extends AbstractState {

    private final static Map<Integer, Class<? extends State>> NEXT_STATES;

    static {
        HashMap<Integer, Class<? extends State>> integerClassHashMap = new HashMap<Integer, Class<? extends State>>();
        integerClassHashMap.put(0, DeadState.class);
        integerClassHashMap.put(1, DeadState.class);
        integerClassHashMap.put(2, AliveState.class);
        integerClassHashMap.put(3, AliveState.class);
        integerClassHashMap.put(4, DeadState.class);
        integerClassHashMap.put(5, DeadState.class);
        integerClassHashMap.put(6, DeadState.class);
        integerClassHashMap.put(7, DeadState.class);
        integerClassHashMap.put(8, DeadState.class);
        NEXT_STATES = Collections.unmodifiableMap(integerClassHashMap);
    }

    @Override
    public Map<Integer, Class<? extends State>> getNextStates() {
        return NEXT_STATES;
    }

    @Override
    public int getAliveValue() {
        return 1;
    }

    public String getRepresentation() {
        return "*";
    }
}
