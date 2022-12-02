package com.javagamemaker.testing.spel2;

import com.javagamemaker.javagameengine.JavaGameEngine;
import com.javagamemaker.javagameengine.Scene;
import com.javagamemaker.javagameengine.components.Grabber;
import com.javagamemaker.javagameengine.msc.Vector2;

public class Level1 extends Scene {
    @Override
    public void start() {
        super.start();
        getCamera().setPosition(new Vector2(getCamera().getPosition().getX()*2,JavaGameEngine.getWindowSize().getY()));
        Ground startGround = new Ground(JavaGameEngine.getWindowSize().getX(),new Vector2(0,0)){
            @Override
            public void onCameraLeft() {}
        };

        add(startGround);

        add(new Ground(100,new Vector2(-100,-200)));
        add(new Ground(100,new Vector2(0,-400)));
        add(new Ground(100,new Vector2(100,-600)));

        add(new Ground(100,new Vector2(-100,-800)));
        add(new Ground(100,new Vector2(0,-1000)));
        add(new Ground(100,new Vector2(100,-1200)));

        add(Main.player);
    }

    @Override
    public void update() {
        super.update();

    }
}