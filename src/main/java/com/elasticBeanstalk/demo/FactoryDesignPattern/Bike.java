package com.elasticBeanstalk.demo.FactoryDesignPattern;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bike implements Vehicle{
    private String bikeType;
    private int gearCount;


    @Override
    public void drive() {
        System.out.println("Riding " + bikeType + " bike with " + gearCount + " gears");
    }
}
