package com.sample.assessment.exercise8;

import java.util.Date;

public class Employee {
    public Date dateHired;
    public Date dateFired;
    public double weeklySalary;

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    public Date getDateFired() {
        return dateFired;
    }

    public void setDateFired(Date dateFired) {
        this.dateFired = dateFired;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public void serveCustomer(){
        System.out.println("Customer served");
    }
    public void takeBreak(){
        System.out.println("take break");
    }

}
