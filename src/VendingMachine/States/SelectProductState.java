package VendingMachine.States;

import VendingMachine.*;

import java.util.Map;

public class SelectProductState implements State {
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
        System.out.println("Select button already clicked");
    }

    @Override
    public void selectProduct(VendingMachines machine, int code) throws Exception {
        Inventory inventory = machine.getInventory();
        Product product = inventory.checkProduct(code);
        if(product!=null){
            int price = product.getPrice();

            if(price>machine.getBalance()){
                System.out.println("insufficient balance, please add more balance");
            }else{
                getChange(machine.getBalance() - price);
                machine.setState(new DispenseState(machine,code));
            }
        }else{
            System.out.println("Product is out of stock");
        }

    }

    @Override
    public int getChange(int extraMoney) throws Exception {
        System.out.println("Extra Money is: "+ extraMoney);
        return extraMoney;
    }

    @Override
    public Product dispenseProduct(VendingMachines machine, int code) throws Exception {
        throw new Exception("Can not dispense with confirming the product");
    }

    @Override
    public void UpdateInventory(VendingMachines machine, Product product, int Quantity) throws Exception {
        throw new Exception("Can not add");

    }

    @Override
    public void refundOrCancel(VendingMachines machine) throws Exception {
        throw new Exception("Can not refund");
    }
}
