package org.example.designpatternsjava.behavioral.state;

public class HasCoinState implements State{

    private VendingMachine machine;
    public HasCoinState(VendingMachine machine){
        this.machine = machine;
    }

    @Override
    public void insertCoin(){
        System.out.println("Coin already inserted.");
    }

    @Override
    public void pressButton() {
        System.out.println("Dispensing item...");
        machine.setState(new NoCoinState(machine));
    }
}
