package by.it.avramchuk.tentacles.pattern.observer.impl;

import by.it.avramchuk.tentacles.pattern.observer.interfaces.DisplayElement;
import by.it.avramchuk.tentacles.pattern.observer.interfaces.Observer;
import by.it.avramchuk.tentacles.pattern.observer.interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private double temperature;
    private double humidity;
    private final Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+temperature+"F degrees and "+humidity+"% humidity");
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
