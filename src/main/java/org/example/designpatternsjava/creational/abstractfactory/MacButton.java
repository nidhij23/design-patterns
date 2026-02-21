package org.example.designpatternsjava.creational.abstractfactory;

public class MacButton implements Button{
    @Override
    public void paint() {
        System.out.println("Rendering mac Button");
    }
}
