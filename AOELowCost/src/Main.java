import config.GameConfig;
import game.Game;

public class Main {
    public static void main(String[] args) {
       Game game= new Game("AoeLowCost", GameConfig.frameWidth,GameConfig.frameHeight);
       game.start();
    }
}
