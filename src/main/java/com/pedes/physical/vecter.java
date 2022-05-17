package com.pedes.physical;

import com.sun.corba.se.spi.activation._ServerManagerImplBase;
import org.jcp.xml.dsig.internal.dom.DOMUtils;

public class vecter {
    public double x;
    public double y;

    public vecter() {

    }

    public vecter(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public vecter(vecter v){
        this.x = v.x;
        this.y = v.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public vecter add(vecter v) {
        return new vecter(this.x + v.x, this.y + v.y);
    }

    public vecter substract(vecter v) {
        return new vecter(this.x - v.x, this.y + v.y);
    }

    public vecter dot(vecter v) {
        return new vecter(this.x * v.x, this.y * v.y);
    }

    public vecter product(double num) {
        return new vecter(this.x * num, this.y * num);
    }

    public vecter divide(double num) {
        return new vecter(this.x / num, this.y / num);
    }

    public double distance(vecter v) {
        return Math.sqrt(Math.pow(this.x - v.x, 2) + Math.pow(this.y - v.y, 2));
    }

    public double length() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
}
