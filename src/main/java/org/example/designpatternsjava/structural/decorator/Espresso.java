package org.example.designpatternsjava.structural.decorator;

public class Espresso implements  Coffee{

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
