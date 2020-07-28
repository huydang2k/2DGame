package graphic;

import graphic.loader.ImageLoader;
import graphic.loader.SpriteSheet;

import java.awt.image.BufferedImage;

public class Assets {
    public static BufferedImage archer,saber,berserker;
    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/images/spritedemo.png"));
        saber = sheet.crop(0,0,40,50);
    }
}
