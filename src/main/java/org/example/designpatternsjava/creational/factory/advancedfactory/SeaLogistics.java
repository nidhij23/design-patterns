package org.example.designpatternsjava.creational.factory.advancedfactory;

public class SeaLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
