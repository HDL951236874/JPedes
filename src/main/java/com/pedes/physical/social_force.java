package com.pedes.physical;

import com.pedes.entity.*;
import org.junit.jupiter.api.Test;
import com.pedes.shape.*;

public class social_force implements force {
    double A = 2000;
    double B = 0.08;
    double acc_upper_bound = 10.0;

    public vecter self_driven_force(pedes e1, entity e2) {
        vecter desire_direction = e2.calculate_direction(e1);
        vecter velocity_change = desire_direction.product(e1.getDesire_speed()).substract(e1.getVelocity());
        return velocity_change.product(e1.getMass()).divide(e1.getTime());
    }


    public vecter pedes_interaction_force(pedes e1, pedes e2) {
        try {
            double first_part = ((circle) e1.getShape()).getR() + ((circle) e2.getShape()).getR() - e1.calculate_distance(e2) / this.B;
            vecter second_part = e1.calculate_direction(e2).divide(e1.calculate_distance(e2));
            return second_part.product(this.A * Math.pow(Math.E, first_part));
        } catch (Exception e) {
            System.out.println("the input shape is not circle");
        }
        return new vecter();
    }

    public vecter obstacle_interaction_force(pedes e1, obstacle e2) {
        try {
            double first_part = ((circle) e1.getShape()).getR() - e1.calculate_distance(e2) / this.B;
            vecter second_part = e1.calculate_direction(e2).divide(e1.calculate_distance(e2));
            return second_part.product(this.A * Math.pow(Math.E, first_part));
        } catch (Exception e) {
            System.out.println("the input shape is not circle");
        }
        return new vecter();
    }

    public vecter calculate_acc(vecter force, entity e) {
        if (force.length() > this.acc_upper_bound)
            return force.product(this.acc_upper_bound).divide(e.getMass()).divide(force.divide(e.getMass()).length());
        return force.divide(e.getMass());
    }

    @Override
    public void next(vecter acc, pedes e) {
        e.getShape().setPosition(e.getShape().getPosition().add(e.getVelocity().product(e.getTime_step())));
        e.setVelocity(acc.product(e.getTime_step()));
        e.getPosition_list().add(e.getShape().getPosition());
    }
}
