package VendingMachine.States;

import VendingMachine.Coins;
import VendingMachine.Product;
import VendingMachine.State;
import VendingMachine.VendingMachines;

public class DispenseState implements State {

    DispenseState(VendingMachines machines, int code) throws Exception{
        System.out.println("Product is in Dispense state");
        dispenseProduct(machines, code);
    }

    @Override
    public void clickInsertButton(VendingMachines machine) throws Exception {
        throw new Exception("In Dispense State");
    }

    @Override
    public void insertCoin(VendingMachines machine, int coin) throws Exception {
        throw new Exception("In Dispense State");
    }

    @Override
    public void clickSelectButton(VendingMachines machine) throws Exception {
        throw new Exception("In Dispense State");
    }

    @Override
    public void selectProduct(VendingMachines machine, int code) throws Exception {
        throw new Exception("In Dispense State");
    }

    @Override
    public int getChange(int extraMoney) throws Exception {
        throw new Exception("In Dispense State");
    }

    @Override
    public Product dispenseProduct(VendingMachines machine, int code) throws Exception {

        System.out.println("Product dispensed");
        machine.getInventory().soldProduct(code);
        Product product = machine.getInventory().getProducts().get(code);
        machine.setState(new IdleState());
        return product;
    }

    @Override
    public void UpdateInventory(VendingMachines machine, Product product, int Quantity) throws Exception {
        System.out.println("Can not add");
    }

    @Override
    public void refundOrCancel(VendingMachines machine) throws Exception {
        System.out.println("can not refund");
    }
}
