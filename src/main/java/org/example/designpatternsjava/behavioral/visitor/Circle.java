package org.example.designpatternsjava.behavioral.visitor;

public class Circle implements Shape{
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
