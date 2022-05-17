package com.pedes.entity;

import com.pedes.physical.*;
import com.pedes.shape.*;

public abstract class entity {
    shape shape;
    double mass;


    public double getMass() {
        return mass;
    }

    public com.pedes.shape.shape getShape() {
        return shape;
    }

    public void setShape(com.pedes.shape.shape shape) {
        this.shape = shape;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public vecter calculate_direction(entity e) {
        return this.getShape().getPosition().substract(e.getShape().getPosition());
    }

    public double calculate_distance(entity e) {
        return this.getShape().getPosition().distance(e.getShape().getPosition());
    }

}
