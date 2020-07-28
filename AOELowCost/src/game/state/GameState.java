package game.state;

import entity.Player;
import graphic.Assets;
import map.Map;

import java.awt.*;

public class GameState extends State {
    private Player[] players;
    private Map map;
    public GameState() {
        //just for test now
        players = new Player[1];
        players[0] = new Player(false);
        map = new Map();
    }
    @Override
    public void update() {
        //just for test now
        map.update();
        for (Player player: players) {
            player.update();
        }
    }

    @Override
    public void render(Graphics graphics) {
        //just for test now
       map.render(graphics);
        for (Player player: players) {
            player.render(graphics);
        }
    }
}
