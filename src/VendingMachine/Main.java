package VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachines vendingMachine = new VendingMachines();

        Product p1 = new Product(1,"a",5);
        Product p2 = new Product(2,"b",10);
        Product p3 = new Product(3,"c",15);
        Product p4 = new Product(4,"a",20);

        vendingMachine.inventory.addProducts(p1,7);
        vendingMachine.inventory.addProducts(p2,10);
        vendingMachine.inventory.addProducts(p3,2);
        vendingMachine.inventory.addProducts(p4,5);

        try{
            vendingMachine.state.clickInsertButton(vendingMachine);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try{
            vendingMachine.state.insertCoin(vendingMachine, 5);
            vendingMachine.state.insertCoin(vendingMachine, 25);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try{
            vendingMachine.state.clickSelectButton(vendingMachine);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            vendingMachine.state.selectProduct(vendingMachine,2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}