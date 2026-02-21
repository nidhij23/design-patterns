package org.example.designpatternsjava.creational.factory.advancedfactory;

public class RoadLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
