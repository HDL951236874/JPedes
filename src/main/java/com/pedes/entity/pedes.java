package com.pedes.entity;

import com.pedes.physical.*;
import com.pedes.shape.*;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.LineSeparatorDetector;

import java.util.ArrayList;
import java.util.List;

public class pedes extends movable {
    double desire_speed = 2.0;
    destination destination;
    double time_step = 0.05;
    double time = 0.5;
    double mass = 80.0;
    shape shape;
    List<vecter> position_list = new ArrayList<>();

    public pedes() {
    }

    public pedes(shape shape,destination destination) {
        this.shape = shape;
        this.destination = destination;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public List<vecter> getPosition_list() {
        return position_list;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }


    public double getTime_step() {
        return time_step;
    }

    public void setTime_step(double time_step) {
        this.time_step = time_step;
    }


    public double getDesire_speed() {
        return desire_speed;
    }

    public void setDesire_speed(double desire_speed) {
        this.desire_speed = desire_speed;
    }

    public com.pedes.entity.destination getDestination() {
        return destination;
    }

    public void setDestination(com.pedes.entity.destination destination) {
        this.destination = destination;
    }

    public com.pedes.shape.shape getShape() {
        return shape;
    }

    public void setShape(com.pedes.shape.shape shape) {
        this.shape = shape;
    }

    public void setPosition_list(List<vecter> position_list) {
        this.position_list = position_list;
    }
}
