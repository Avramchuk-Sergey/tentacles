package by.it.avramchuk.tentacles.pattern.decorator.entity.condiment;

import by.it.avramchuk.tentacles.pattern.decorator.abstraction.Beverage;
import by.it.avramchuk.tentacles.pattern.decorator.abstraction.CondimentDecorator;
import by.it.avramchuk.tentacles.pattern.decorator.util.PriceList;

public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+ PriceList.MILK_COST;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" + Milk";
    }
}
