package com.mygdx.game.gameWorld;

import com.mygdx.game.gameObjects.Mario;

/**
 * Created by Legendary on 21.05.2016.
 */
public class GameWorld {

    private Mario mario;

    public GameWorld() {
        mario = new Mario(30, 30, 13, 26);
    }

    public void update(float delta){

    }

    public Mario getMario() {
        return mario;
    }
}
