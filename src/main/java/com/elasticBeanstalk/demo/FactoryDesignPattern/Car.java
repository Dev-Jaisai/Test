package com.elasticBeanstalk.demo.FactoryDesignPattern;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car implements Vehicle{
    private String engineType;
    private String color;
    private String fuelType;
    private int seatingCapacity;
    private boolean hasSunroof;
    private boolean newProp;



    @Override
    public void drive() {
        System.out.println("Driving car with: " + engineType + " engine, " + color + " color");
        System.out.println("Fuel: " + fuelType + ", Seats: " + seatingCapacity + ", Sunroof: " + hasSunroof);
    }
}
