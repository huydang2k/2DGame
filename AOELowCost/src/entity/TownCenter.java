package entity;

import config.GameConfig;

import java.awt.*;

public class TownCenter extends Entity{
    private Player player;
    private int hp;
    public TownCenter() {
        this.hp = GameConfig.TOWN_CENTER_HP;
    }

    public TownCenter(Player player) {
        this.player = player;
    }

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics graphics) {

    }
    //getter and setter
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
