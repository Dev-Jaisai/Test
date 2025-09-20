package com.elasticBeanstalk.demo.FactoryDesignPattern;

public class VehicleFactory {

    public Vehicle getVehicle(String type){

        if (type.equalsIgnoreCase("car")) {
            // All complex setup in ONE place
            return new Car("V6", "Red", "Petrol", 5, true, true);
        }
        else if (type.equalsIgnoreCase("bike")) {
            return new Bike("Sports", 6);
        }
        else {
            return null;
        }
    }
}
