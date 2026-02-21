package org.example.designpatternsjava.creational.factory.advancedfactory;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivering by road using Truck");
    }
}
