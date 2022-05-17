package com.pedes.scene;

import com.pedes.physical.*;
import com.pedes.entity.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class scene {
    social_force social_force;
    List<pedes> pedes_pool = new LinkedList<>();
    List<obstacle> obstacle_pool = new LinkedList<>();
    destination destination;


    public List<obstacle> getObstacle_pool() {
        return obstacle_pool;
    }

    public void setObstacle_pool(List<obstacle> obstacle_pool) {
        this.obstacle_pool = obstacle_pool;
    }

    public com.pedes.entity.destination getDestination() {
        return destination;
    }

    public void setDestination(com.pedes.entity.destination destination) {
        this.destination = destination;
    }

    public scene() {
    }

    ;

    public scene(List<pedes> pedes_pool, List<obstacle> obstacle_pool, destination destination, social_force social_force) {
        this.pedes_pool = pedes_pool;
        this.social_force = social_force;
        this.obstacle_pool = obstacle_pool;
        this.destination = destination;
    }

    public List<pedes> getPedes_pool() {
        return pedes_pool;
    }

    public social_force getSocial_force() {
        return social_force;
    }

    public void setPedes_pool(List<pedes> pedes_pool) {
        this.pedes_pool = pedes_pool;
    }

    public void setSocial_force(social_force social_force) {
        this.social_force = social_force;
    }

    public void run() {
        List<vecter> force_list = new ArrayList<>();
        for (int i = 0; i < this.pedes_pool.size(); i++) {
            vecter self_driven_force = this.social_force.self_driven_force(this.pedes_pool.get(i), this.destination);
            vecter total_pedes_force = new vecter();
            for (int j = 0; j < this.pedes_pool.size(); j++) {
                if (i == j) continue;
                total_pedes_force.add(this.social_force.pedes_interaction_force(pedes_pool.get(i), pedes_pool.get(j)));
            }
            vecter total_obstacle_force = new vecter();
            for (int j = 0; j < this.obstacle_pool.size(); j++) {
                total_obstacle_force.add(this.social_force.obstacle_interaction_force(pedes_pool.get(i), obstacle_pool.get(j)));
            }
            vecter total_force = self_driven_force.add(total_obstacle_force).add(total_pedes_force);
            force_list.add(total_force);
        }

        for (int i = 0; i < this.pedes_pool.size(); i++) {
            vecter acc = this.social_force.calculate_acc(force_list.get(i), pedes_pool.get(i));
            this.social_force.next(acc, pedes_pool.get(i));
        }
    }
}
