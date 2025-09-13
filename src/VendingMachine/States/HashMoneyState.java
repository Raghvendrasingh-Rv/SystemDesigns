package VendingMachine.States;

import VendingMachine.Coins;
import VendingMachine.Product;
import VendingMachine.State;
import VendingMachine.VendingMachines;

public class HashMoneyState implements State {
    @Override
    public void clickInsertButton(VendingMachines machine) throws Exception {
        throw new Exception("You can insert");
    }

    @Override
    public void insertCoin(VendingMachines machine, int coin) throws Exception {
        int balance = machine.getBalance();
        balance+=coin;
        machine.setBalance(balance);
        System.out.println("Coin added");
    }

    @Override
    public void clickSelectButton(VendingMachines machine) throws Exception {
        System.out.println("Select button clicked");
        machine.setState(new SelectProductState());
    }

    @Override
    public void selectProduct(VendingMachines machine, int code) throws Exception {
        throw new Exception("Vending machine in HashMoney state");

    }

    @Override
    public int getChange(int extraMoney) throws Exception {
        throw new Exception("Vending machine in HashMoney state");
    }

    @Override
    public Product dispenseProduct(VendingMachines machine, int code) throws Exception {
        throw new Exception("Vending machine in HashMoney state");
    }

    @Override
    public void UpdateInventory(VendingMachines machine, Product product, int Quantity) throws Exception {
        throw new Exception("Can not update");

    }

    @Override
    public void refundOrCancel(VendingMachines machine) throws Exception {
        throw new Exception("Can not update");
    }
}
