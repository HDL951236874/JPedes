package com.pedes.entity;

import com.pedes.physical.*;

public abstract class movable extends entity {
    vecter velocity = new vecter(0.0, 0.0);

    public vecter getVelocity() {
        return velocity;
    }

    public void setVelocity(vecter velocity) {
        this.velocity = velocity;
    }

}
