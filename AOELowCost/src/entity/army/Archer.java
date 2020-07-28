package entity.army;

import config.GameConfig;

public class Archer extends Soldier implements GameConfig,Upgrade {
    public Archer(){
        super();
        this.setHp(ARCHER_HP);
        this.setArmor(ARCHER_ARMOR);
        this.setAtkSpeed(ARCHER_ASPEED);
        this.setMoveSpeed(ARCHER_MSPEED);
        this.setCost(ARCHER_COST);
        this.setDamage(ARCHER_ATK);
    }
}
