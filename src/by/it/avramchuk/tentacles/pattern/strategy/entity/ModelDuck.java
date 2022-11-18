package by.it.avramchuk.tentacles.pattern.strategy.entity;

import by.it.avramchuk.tentacles.pattern.strategy.impl.FlyNoWay;
import by.it.avramchuk.tentacles.pattern.strategy.impl.Quack;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm model duck");
    }
}
