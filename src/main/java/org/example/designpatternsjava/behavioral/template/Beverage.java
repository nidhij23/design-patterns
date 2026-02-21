package org.example.designpatternsjava.behavioral.template;

abstract public class Beverage {
    public final void prepareRecipe() {
        boilWater();
        pourInCup();
        addCondiments();
    }

    private void boilWater(){
        System.out.println("Boiling Water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void brew();
    protected  abstract  void addCondiments();

}
