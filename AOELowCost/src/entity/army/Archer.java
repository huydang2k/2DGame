package entity.army;

import config.GameConfig;

import java.awt.*;

public class Archer extends Soldier implements GameConfig,Upgrade {
    @Override
    public void update() {

    }

    @Override
    public void render(Graphics graphics) {

    }

    public Archer(){
        super();
        this.setHp(ARCHER_HP);
        this.setArmor(ARCHER_ARMOR);
        this.setAtkSpeed(ARCHER_ASPEED);
        this.setMoveSpeed(ARCHER_MSPEED);
        this.setCost(ARCHER_COST);
        this.setDamage(ARCHER_ATK);
        this.setPositionX(0);
        this.setPositionY(0);
    }
}
