package by.it.avramchuk.tentacles.pattern.strategy.main;

import by.it.avramchuk.tentacles.pattern.strategy.entity.Duck;
import by.it.avramchuk.tentacles.pattern.strategy.entity.MallardDuck;
import by.it.avramchuk.tentacles.pattern.strategy.entity.ModelDuck;
import by.it.avramchuk.tentacles.pattern.strategy.impl.FlyRocketPowered;

public class Main {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
