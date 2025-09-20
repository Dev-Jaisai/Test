package com.elasticBeanstalk.demo.Singleton;

public class Singleton implements Cloneable {//thappa class


    private static Singleton instance;

    private Singleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() to create Singleton object");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("fi");
        return instance;
    }
}
//2 nway serialization
