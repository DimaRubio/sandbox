package entity;

public class World {


    public Apple apple;
    public Customer customer;
    public Item item;

    public World(Apple apple){
        this.apple = apple;
    }

//// picocontainer Не умеет внедрять зависимости через сеттер
//    public void setApple(Apple apple) {
//        this.apple = apple;
//    }

}
