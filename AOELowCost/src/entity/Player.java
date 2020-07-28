package entity;

import entity.army.Archer;
import entity.army.Berserker;
import entity.army.Saber;

import java.awt.*;
import java.util.ArrayList;

public class Player  {
    private boolean isVirtualPlayer;
    private int gold;
    private TownCenter townCenter;
    private ArrayList<Archer> archers;
    private ArrayList<Saber> sabers;
    private ArrayList<Berserker> berserkers;

    public Player(boolean isVirtualPlayer) {
        //just for test now
        this.isVirtualPlayer = isVirtualPlayer;
        this.townCenter = new TownCenter();
        this.sabers = new ArrayList<>();
        sabers.add(new Saber());
    }

    public Player(boolean isVirtualPlayer,int gold, TownCenter townCenter, ArrayList<Archer> archers,
                  ArrayList<Saber> sabers, ArrayList<Berserker> berserkers) {
        this.isVirtualPlayer = isVirtualPlayer;
        this.gold = gold;
        this.townCenter = townCenter;
        this.archers = archers;
        this.sabers = sabers;
        this.berserkers = berserkers;
    }
    public void update(){

    }
    public void render(Graphics graphics){
        //just for test now
        //archerRender(graphics);
        saberRender(graphics);
     //   berserkerRender(graphics);
        townCenter.render(graphics);
    }
    public void townCenterRender(Graphics graphics){
        townCenter.render(graphics);
    }
    public void archerRender(Graphics graphics){
        for (Archer archer : archers){
            archer.render(graphics);
        }
    }
    public void saberRender(Graphics graphics){
        for (Saber saber : sabers){
            saber.render(graphics);
        }
    }
    public void berserkerRender(Graphics graphics){
        for (Berserker berserker : berserkers){
            berserker.render(graphics);
        }
    }
    //getter and setter

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public TownCenter getTownCenter() {
        return townCenter;
    }

    public void setTownCenter(TownCenter townCenter) {
        this.townCenter = townCenter;
    }

    public ArrayList<Archer> getArchers() {
        return archers;
    }

    public void setArchers(ArrayList<Archer> archers) {
        this.archers = archers;
    }

    public ArrayList<Saber> getSabers() {
        return sabers;
    }

    public void setSabers(ArrayList<Saber> sabers) {
        this.sabers = sabers;
    }

    public ArrayList<Berserker> getBerserkers() {
        return berserkers;
    }

    public void setBerserkers(ArrayList<Berserker> berserkers) {
        this.berserkers = berserkers;
    }

    public boolean isVirtualPlayer() {
        return isVirtualPlayer;
    }

    public void setVirtualPlayer(boolean virtualPlayer) {
        isVirtualPlayer = virtualPlayer;
    }
}
