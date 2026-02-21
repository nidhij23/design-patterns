package org.example.designpatternsjava.behavioral.visitor;

public interface Visitor {
    void visit(Circle circle);
    void visit(Rectangle rectange);
}
