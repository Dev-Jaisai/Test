package com.elasticBeanstalk.demo.FactoryDesignPattern;

public class Customer {

    public static void main(String[] args) {
        BalajiOrderCounter counter = new BalajiOrderCounter();

        // Just order and get READY samosa!
        System.out.println("Me: Can I get 1 aloo samosa?");
        Samosa mySamosa = counter.orderSamosa("aloo");
        // No need to call prepare(), fry(), serve() - it's already DONE!

        System.out.println("\nFriend: I want 1 paneer samosa!");
        Samosa friendSamosa = counter.orderSamosa("paneer");
        // Already ready to eat!
    }
}
