package com.pedes.shape;

import com.pedes.physical.*;

public class circle extends shape {
    double r = 0.3;

    public circle() {
    }

    public circle(vecter position){
        this.position = position;
    }

    public circle(double r, vecter position) {
        this.r = r;
        this.position = position;
    }

    @Override
    public boolean contain(vecter v) {
        return this.position.substract(v).length()<this.r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
