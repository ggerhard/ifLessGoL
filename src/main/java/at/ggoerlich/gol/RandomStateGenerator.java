package at.ggoerlich.gol;

import at.ggoerlich.gol.state.AliveState;
import at.ggoerlich.gol.state.DeadState;
import at.ggoerlich.gol.state.State;

import java.util.Random;

/**
 * Produces a random State (Dead or Alive)
 */
public class RandomStateGenerator {

    private final Random random;
    private final Class<? extends State>[] states = new Class[] {AliveState.class, DeadState.class};

    public RandomStateGenerator() {
        this.random = new Random();
    }

    public State getNextState() {
        Class<? extends State> stateClass = states[random.nextInt(2)];
        try {
            return stateClass.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
