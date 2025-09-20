package com.elasticBeanstalk.demo.FactoryDesignPattern;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class PaneerSamosa implements Samosa {
    int i;

    public void makeAndServe() {
        System.out.println("Expert preparing: Grating paneer, adding cheese spices!");
        System.out.println("Frying until crispy and cheesy!");
        System.out.println("🧀 Serving delicious Paneer Samosa!");
        System.out.println("🧀 Serving delicious Paneer Samosa!");
        System.out.println("🧀 Serving delicious Chicken ");
        System.out.println("🧀 Serving delicious Soup ");

    }
}