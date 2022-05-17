package com.pedes.entity;

import com.pedes.shape.*;

public class destination extends unmovable {
    shape shape;

    public destination() {
    }

    ;
    public destination(shape shape) {
        this.shape = shape;
    }

    ;

    @Override
    public com.pedes.shape.shape getShape() {
        return shape;
    }

    @Override
    public void setShape(com.pedes.shape.shape shape) {
        this.shape = shape;
    }
}
