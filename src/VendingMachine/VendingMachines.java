package VendingMachine;

import VendingMachine.States.IdleState;

import java.util.List;

public class VendingMachines {

    State state;
    int balance;
    Inventory inventory;

    public VendingMachines() {
        this.state = new IdleState();
        this.balance = 0;
        this.inventory = new Inventory();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
