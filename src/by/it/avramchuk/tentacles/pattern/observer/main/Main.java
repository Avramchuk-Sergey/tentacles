package by.it.avramchuk.tentacles.pattern.observer.main;

import by.it.avramchuk.tentacles.pattern.observer.impl.CurrentConditionsDisplay;
import by.it.avramchuk.tentacles.pattern.observer.impl.WeatherData;
import by.it.avramchuk.tentacles.pattern.observer.interfaces.Observer;

public class Main {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(12, 13, 15);
        weatherData.setMeasurements(22, 23, 25);
        weatherData.setMeasurements(32, 33, 35);
    }
}
