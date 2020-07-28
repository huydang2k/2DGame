package entity.army;

public abstract class Soldier {
    public final static int NORMAL = 0, HIT = 1, DEAD = 2;
    private int hp;
    private int damage;
    private int armor;
    private int moveSpeed;
    private int atkSpeed;
    private int status;
    private int cost;
    private double positionX;
    private double positionY;
    public Soldier() {
        this.status = NORMAL;
    }

    public Soldier(int hp, int damage, int armor, int moveSpeed, int atkSpeed) {
        this.hp = hp;
        this.damage = damage;
        this.armor = armor;
        this.moveSpeed = moveSpeed;
        this.atkSpeed = atkSpeed;
        this.status = NORMAL;
    }
    public void getAttacked(Soldier culprit){
        this.status = HIT;
        if (this.hp < culprit.getDamage()) this.hp -= culprit.getDamage();
         else {
             this.die();
        }
    }
    public void die(){
       this.hp = 0;
       this.status = DEAD;
    }
    public void attack(Soldier victim){
        victim.getAttacked(this);
    }

    //getter and setter
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public int getAtkSpeed() {
        return atkSpeed;
    }

    public void setAtkSpeed(int atkSpeed) {
        this.atkSpeed = atkSpeed;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public double getPositionX() {
        return positionX;
    }

    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    public void setPositionY(double positionY) {
        this.positionY = positionY;
    }
}
