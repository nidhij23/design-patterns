package org.example.designpatternsjava.creational.abstractfactory;

public class WindowsCheckbox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Rendering Windows Button");
    }
}
