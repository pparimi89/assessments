package com.sample.assessment.exercise8;

public class ChickenNugget extends Food implements Eatable{
    private String ketchup;

    public String getKetchup() {
        return ketchup;
    }

    public void setKetchup(String ketchup) {
        this.ketchup = ketchup;
    }

    @Override
    public void setTemperatureInCelcius(double temperatureInCelcius) {
        this.temperatureInCelcius = temperatureInCelcius;
    }

    void beServed(){
        System.out.println("Served");
    }

    public void beEaten(){
        System.out.println("eaten Chicken nugget");
    }

}
