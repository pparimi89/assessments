package com.sample.assessment.exercise8;

public class Burger extends Food  implements Eatable{
    public String ingredients;

    @Override
    public void setTemperatureInCelcius(double temperatureInCelcius) {
        this.temperatureInCelcius = temperatureInCelcius;
    }

    void beServed(){
        System.out.println("Served");
    }

    public void beEaten(){
        System.out.println("Eaten Burger");
    }

}
