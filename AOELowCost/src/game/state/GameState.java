package game.state;

import graphic.Assets;

import java.awt.*;

public class GameState extends State {
    public GameState() {
    }
    @Override
    public void update() {

    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawImage(Assets.saber,0,0,null);
    }
}
