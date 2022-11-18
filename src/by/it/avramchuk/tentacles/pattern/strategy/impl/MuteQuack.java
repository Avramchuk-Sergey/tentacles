package by.it.avramchuk.tentacles.pattern.strategy.impl;

import by.it.avramchuk.tentacles.pattern.strategy.entity.Duck;

public class MuteQuack implements Duck.QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
