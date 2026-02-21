package org.example.designpatternsjava.behavioral.visitor;

public class Rectangle implements Shape{
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width=width;
        this.height=height;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
