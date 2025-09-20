package com.elasticBeanstalk.demo.FactoryDesignPattern;

public class VehicleCustomer {
    public static void main(String[] args) {


        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle car = vehicleFactory.getVehicle("car");
        car.drive();
        vehicleFactory.getVehicle("bike").drive();

        /*// Creating Car - Complex setup everywhere!
        Car car = new Car("V6", "Red", "Petrol", 5, true);
        car.drive();

        // Creating Bike
        Bike bike = new Bike("Sports", 6);
        bike.drive();

        // Now imagine doing this in 10 different files!
        // If car specifications change, update ALL 10 places!
*/
    }

}
