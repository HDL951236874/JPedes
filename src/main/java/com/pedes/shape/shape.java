package com.pedes.shape;
import com.pedes.physical.*;

public abstract class shape {
    vecter position;

    public vecter getPosition() {
        return position;
    }

    public void setPosition(vecter position) {
        this.position = position;
    }

    public abstract boolean contain(vecter v);
}
