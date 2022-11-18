package by.it.avramchuk.tentacles.pattern.strategy.impl;

import by.it.avramchuk.tentacles.pattern.strategy.entity.Duck;

public class FlyNoWay implements Duck.FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
