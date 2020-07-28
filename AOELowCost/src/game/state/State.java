package game.state;

import java.awt.*;

public abstract class State {
    private static State currentState = null;

    public static State getCurrentState() {
        return currentState;
    }

    public static void setCurrentState(State currentState) {
        State.currentState = currentState;
    }

    public abstract void update();
    public abstract void render(Graphics graphics);
}
