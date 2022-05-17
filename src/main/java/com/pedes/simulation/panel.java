package com.pedes.simulation;

import com.pedes.physical.vecter;
import com.pedes.scene.*;
import com.pedes.shape.*;
import com.pedes.entity.*;

import java.util.ArrayList;
import java.util.List;

public class panel {
    scene_generator scene_generator = new scene_generator();

    /*
     * this is the panel class used to connect the ui and backend
     * */
    public void run() {
        int pedes_num = 3;
        rect pedes_rect = new rect(10, 10, new vecter(0, 0));
        rect destination_rect = new rect(2, 2, new vecter(20, 0));
        List<shape> obstacle_list = new ArrayList<>();
        obstacle_list.add(new rect(10, 2, new vecter(0, 15)));
        obstacle_list.add(new rect(10, 2, new vecter(0, -15)));
        scene scene = this.scene_generator.random_generator(pedes_num, pedes_rect, obstacle_list, destination_rect);
        scene.run();
    }

    public static void main(String[] args) {
        panel panel = new panel();
        panel.run();
    }
}
