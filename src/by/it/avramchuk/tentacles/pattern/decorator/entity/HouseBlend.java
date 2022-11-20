package by.it.avramchuk.tentacles.pattern.decorator.entity;

import by.it.avramchuk.tentacles.pattern.decorator.abstraction.Beverage;
import by.it.avramchuk.tentacles.pattern.decorator.util.PriceList;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House blend coffee";
    }

    @Override
    public double cost() {
        return PriceList.HOUSE_BLEND_COST;
    }
}
