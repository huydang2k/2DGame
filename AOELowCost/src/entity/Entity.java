package entity;

import java.awt.*;

public abstract class Entity {
    protected float positionX;
    protected float positionY;
    public abstract void update();
    public abstract void render(Graphics graphics);

    public Entity() {
    }

    public Entity(float positionX, float positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }
    //getter and setter
    public float getPositionX() {
        return positionX;
    }

    public void setPositionX(float positionX) {
        this.positionX = positionX;
    }

    public float getPositionY() {
        return positionY;
    }

    public void setPositionY(float positionY) {
        this.positionY = positionY;
    }
}
