package org.example.designpatternsjava.creational.factory.advancedfactory;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivering by sea using Ship");
    }

}
