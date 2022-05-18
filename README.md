# JPedes
This is a simulation platform to simulate the pedestrians movement under different situations.
## environment
JDK 1.8
## how to use
run the **run()** method under com.pedes.simulation.panel
'''Java
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

'''
