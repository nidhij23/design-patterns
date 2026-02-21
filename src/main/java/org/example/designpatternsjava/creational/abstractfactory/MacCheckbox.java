package org.example.designpatternsjava.creational.abstractfactory;

public class MacCheckbox implements  CheckBox{
    @Override
    public void paint() {
        System.out.println("Rendering Mac Checkbox");
    }
}
