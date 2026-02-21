package org.example.designpatternsjava.behavioral.state;

public class NoCoinState implements State{
    private VendingMachine machine;

    public NoCoinState(VendingMachine machine){
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted");
        machine.setState(new HasCoinState(machine));
    }

    @Override
    public void pressButton() {
        System.out.println("Insert coin first");
    }
}
