package VendingMachine.States;

import VendingMachine.Product;
import VendingMachine.State;
import VendingMachine.VendingMachines;

public class IdleState implements State {

    @Override
    public void clickInsertButton(VendingMachines machine) throws Exception {
        System.out.println("Coin insert button clicked");
        machine.setState(new HashMoneyState());
    }

    @Override
    public void insertCoin(VendingMachines machine, int coin) throws Exception {
        throw new Exception("You can not insert, click insert button");
    }

    @Override
    public void clickSelectButton(VendingMachines machine) throws Exception {
        throw new Exception("Vending machine in Idle state");
    }

    @Override
    public void selectProduct(VendingMachines machine, int code) throws Exception {
        throw new Exception("Vending machine in Idle state");
    }

    @Override
    public int getChange(int extraMoney) throws Exception {
        throw new Exception("Vending machine in Idle state");
    }

    @Override
    public Product dispenseProduct(VendingMachines machine, int code) throws Exception {
        throw new Exception("You have not selected items yet");
    }

    @Override
    public void UpdateInventory(VendingMachines machine, Product product, int Quantity) throws Exception {
        throw new Exception("Vending machine in Idle state");
    }

    @Override
    public void refundOrCancel(VendingMachines machine) throws Exception {
        throw new Exception("Vending machine in Idle state");
    }
}
