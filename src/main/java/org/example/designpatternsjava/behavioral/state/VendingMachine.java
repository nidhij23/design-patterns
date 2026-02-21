package org.example.designpatternsjava.behavioral.state;

public class VendingMachine {
    private State state;
    public VendingMachine() {
        state = new NoCoinState(this);
    }

    public void setState(State state) {
        this.state= state;
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void pressButton(){
        state.pressButton();
    }
}
