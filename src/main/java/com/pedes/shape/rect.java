package com.pedes.shape;

import com.pedes.physical.*;

public class rect extends shape {
    double width;
    double length;

    public rect() {
    }

    ;

    public rect(double width, double length, vecter position) {
        this.width = width;
        this.length = length;
        this.position = position;
    }


    @Override
    public boolean contain(vecter v) {
        return this.position.substract(v).x< this.width/2 && this.position.substract(v).y<this.length/2;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }


    public void setLength(double length) {
        this.length = length;
    }
}
