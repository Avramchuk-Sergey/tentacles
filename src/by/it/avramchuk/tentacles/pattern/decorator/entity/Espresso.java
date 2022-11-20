package by.it.avramchuk.tentacles.pattern.decorator.entity;

import static by.it.avramchuk.tentacles.pattern.decorator.util.PriceList.*;

import by.it.avramchuk.tentacles.pattern.decorator.abstraction.Beverage;

public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return ESPRESSO_COST;
    }
}
