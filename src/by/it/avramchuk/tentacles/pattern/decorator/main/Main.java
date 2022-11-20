package by.it.avramchuk.tentacles.pattern.decorator.main;

import by.it.avramchuk.tentacles.pattern.decorator.abstraction.Beverage;
import by.it.avramchuk.tentacles.pattern.decorator.entity.DarkRoast;
import by.it.avramchuk.tentacles.pattern.decorator.entity.Espresso;
import by.it.avramchuk.tentacles.pattern.decorator.entity.HouseBlend;
import by.it.avramchuk.tentacles.pattern.decorator.entity.condiment.Mocha;
import by.it.avramchuk.tentacles.pattern.decorator.entity.condiment.Soy;
import by.it.avramchuk.tentacles.pattern.decorator.entity.condiment.Whip;

public class Main {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);

        System.out.println(beverage1.getDescription()+" $"+beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Whip(new Mocha(new Soy(beverage2)));

        System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
    }
}
