package com.pedes.entity;

import com.pedes.physical.*;
import com.pedes.shape.*;

public class obstacle extends unmovable {
    shape shape;


    public obstacle() {
    }

    ;

    public obstacle(shape shape) {
        this.shape = shape;
    }

    public com.pedes.shape.shape getShape() {
        return shape;
    }

    public void setShape(com.pedes.shape.shape shape) {
        this.shape = shape;
    }

}
