package com.pedes.scene;

import com.pedes.physical.*;
import com.pedes.shape.*;
import com.pedes.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class scene_generator {


    public scene random_generator(int pedes_num, shape pedes_shape, List<shape> obstacle_list, shape destination_shape) {
        Random random = new Random();
        //generate destination
        destination destination = new destination(destination_shape);

        //generate pedestrians
        scene scene = new scene();
        scene.social_force = new social_force();
        List<pedes> pedes_pool = new ArrayList<>();
        double x_l = pedes_shape.getPosition().x - ((rect) pedes_shape).getWidth();
        double x_h = pedes_shape.getPosition().x + ((rect) pedes_shape).getWidth();
        double y_l = pedes_shape.getPosition().y - ((rect) pedes_shape).getLength();
        double y_h = pedes_shape.getPosition().y + ((rect) pedes_shape).getLength();
        for (int i = 0; i < pedes_num; i++) {
            double x = random.nextDouble() * (x_h - x_l) + x_l;
            double y = random.nextDouble() * (y_h - y_l) + y_l;
            pedes_pool.add(new pedes(new circle(new vecter(x, y)), destination));
        }
        List<obstacle> obstacle_pool = new ArrayList<>();
        for (int i = 0; i < obstacle_list.size(); i++) {
            obstacle_pool.add(new obstacle(obstacle_list.get(i)));
        }
        return new scene(pedes_pool,obstacle_pool,destination,new social_force());
    }

    public void delete_duplicate() {

    }

    public scene file_generator() {
        return new scene();
    }
}
