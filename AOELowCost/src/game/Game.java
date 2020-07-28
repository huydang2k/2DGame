package game;

import game.state.GameState;
import game.state.MenuState;
import game.state.State;
import graphic.Assets;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game implements Runnable{

    private Display display;

    private String title;
    private int width,height;

    private Thread thread;
    private  boolean running = false;

    private BufferStrategy bufferStrategy;
    private Graphics graphics;

    private State gameState;
    private State menuState;
    private State settingState;

    public Game() {
    }

    public Game(String title, int width, int height) {
        this.width = width;
        this.height = height;
        this.title = title;
    }
    private void init(){
        display = new Display(title,width,height);
        Assets.init();
        gameState = new GameState();
        menuState = new MenuState();
        State.setCurrentState(gameState);
    }
    private void update(){
        //update variables, position of objects..
        if(State.getCurrentState() != null){
            State.getCurrentState().update();
        }
    }

    private void render(){
        //render
        bufferStrategy = display.getCanvas().getBufferStrategy();
        if (bufferStrategy == null) {
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        graphics = bufferStrategy.getDrawGraphics();

        //clear screen
        graphics.clearRect(0,0,width,height);

        //draw
        if(State.getCurrentState() != null){
            State.getCurrentState().render(graphics);
        }

        //end drawing
        bufferStrategy.show();
        graphics.dispose();
    }
    @Override
    public void run() {
        init();
        int fps = 60;
        double timeForTick = 1000000000/fps;
        long now;
        long last = System.nanoTime();
        double delta = 0;
        long timer = 0;
        int tick = 0;
        while (running) {
            now = System.nanoTime();
            delta += (now-last)/timeForTick;
            timer += now - last;
            last = now;
            if (delta >= 1){
                update();
                render();
                delta--;
                tick++;
            }
            if (timer >= 1000000000 ){
                System.out.println("fps="+tick);
                tick = 0;
                timer = 0;
            }
        }
        stop();
    }

    public synchronized void start(){
        if (running)
            return;
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop(){
        if (!running)
            return;
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
