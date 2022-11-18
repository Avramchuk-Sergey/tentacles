package by.it.avramchuk.tentacles.pattern.strategy.entity;

import by.it.avramchuk.tentacles.pattern.strategy.impl.FlyWithWings;
import by.it.avramchuk.tentacles.pattern.strategy.impl.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm really mallard duck");
    }


}
