package com.elasticBeanstalk.demo.FactoryDesignPattern;

class BalajiOrderCounter {
    public Samosa orderSamosa(String type) {
        System.out.println("Order received for: " + type + " samosa");

        if (type.equalsIgnoreCase("aloo")) {
            Samosa samosa = new AlooSamosa();
            samosa.makeAndServe();  // Factory makes it READY!
            return samosa;
        } else if (type.equalsIgnoreCase("paneer")) {
            Samosa samosa = new PaneerSamosa();
            samosa.makeAndServe();  // Factory makes it READY!
            return samosa;
        } else {
            System.out.println("Sorry! We don't have " + type + " samosa");
            return null;
        }
    }
}