package org.example.designpatternsjava.creational.abstractfactory;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkBox = guiFactory.createCheckBox();
    }
    public void render(){
        button.paint();
        checkBox.paint();
    }
}
