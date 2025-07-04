package com.abhay.interfaces;

public class Nicecar {
    private  Engine engine;
    private Media player = new CDplayer();

    public Nicecar(){
        engine = new PowerEngine();
    }

    public Nicecar(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop()
    {
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}
