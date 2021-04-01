package com.sample.assessment.exercise8;

import java.util.Date;

public class Restaurant implements Payable, Hireable, Fireable{

    public String address;
    public Integer numberOfPlaces;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public void setNumberOfPlaces(Integer numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }

    public Employee hireEmployee(){
        Employee hiredEmployee = new Employee();
        hiredEmployee.setDateHired(new Date());
        return hiredEmployee;
    }
    public void serveCustomer(){
        System.out.println("Customer Served");
    }

    public Employee fireEmployee(){
        Employee hiredEmployee = new Employee();
        hiredEmployee.setDateFired(new Date());
        return hiredEmployee;
    }

    public void receiveMoney(){
        System.out.println("received money");
    }

    public void signContract(){
        System.out.println("Sign contract");
    }
    public void beHired(){
        System.out.println("Be hired");
    }

    public void beFired(){
        System.out.println("Be fired");
    }
}
