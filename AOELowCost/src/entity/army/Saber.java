package entity.army;

import graphic.Assets;

import java.awt.*;

public class Saber extends Soldier {

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawImage(Assets.saber,(int) this.positionX,(int) this.positionY,null);
    }
}
