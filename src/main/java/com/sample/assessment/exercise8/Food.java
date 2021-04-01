package com.sample.assessment.exercise8;

public abstract class Food {
    public double temperatureInCelcius;
    abstract void beServed();

    public double getTemperatureInCelcius() {
        return temperatureInCelcius;
    }

    public void setTemperatureInCelcius(double temperatureInCelcius) {
        this.temperatureInCelcius = temperatureInCelcius;
    }
}
