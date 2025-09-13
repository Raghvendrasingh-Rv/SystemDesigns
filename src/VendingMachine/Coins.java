package VendingMachine;

public enum Coins {

    TEN(10),
    FIFTY(50),
    HUNDRED(100),
    FIVE(5);

    private final int value;

    Coins(int value){
        this.value=value;
    }

    public int getValue(){
        return this.value;
    }
}
