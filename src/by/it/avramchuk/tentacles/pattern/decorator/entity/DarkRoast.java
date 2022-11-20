package by.it.avramchuk.tentacles.pattern.decorator.entity;

import by.it.avramchuk.tentacles.pattern.decorator.abstraction.Beverage;
import by.it.avramchuk.tentacles.pattern.decorator.util.PriceList;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "Dark roast coffee";
    }

    @Override
    public double cost() {
        return PriceList.DARK_ROAST_COST;
    }
}
