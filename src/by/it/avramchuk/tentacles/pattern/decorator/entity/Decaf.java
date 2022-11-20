package by.it.avramchuk.tentacles.pattern.decorator.entity;

import by.it.avramchuk.tentacles.pattern.decorator.abstraction.Beverage;
import by.it.avramchuk.tentacles.pattern.decorator.util.PriceList;

public class Decaf extends Beverage {

    public Decaf(){
        description = "Decaf";
    }

    @Override
    public double cost() {
        return PriceList.DECAF_COST;
    }
}
