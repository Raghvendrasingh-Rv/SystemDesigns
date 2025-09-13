package VendingMachine;

public interface State {

    public void clickInsertButton(VendingMachines machine) throws Exception;

    public void insertCoin(VendingMachines machine, int coin) throws Exception;

    public void clickSelectButton(VendingMachines machine) throws Exception;

    public void selectProduct(VendingMachines machine, int code) throws Exception;

    public int getChange(int extraMoney) throws Exception;

    public Product dispenseProduct(VendingMachines machine, int code) throws Exception;

    public void UpdateInventory(VendingMachines machine, Product product, int Quantity) throws Exception;

    public void refundOrCancel(VendingMachines machine) throws Exception;
}
