import java.util.List;

public class ExpenseBill {

    private int id;
    private double price;
    private User paidBy;
    private List<Split> Splits;
    private SpiltStatus splitstatus;

    public ExpenseBill(int id, double price, User paidBy,List<Split> splits, SpiltStatus splitstatus) {
        this.id = id;
        this.price = price;
        this.paidBy = paidBy;
        Splits = splits;
        this.splitstatus = splitstatus;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Split> getSplits() {
        return Splits;
    }

    public void setSplits(List<Split> splits) {
        Splits = splits;
    }

    public SpiltStatus getSplitstatus() {
        return splitstatus;
    }

    public void setSplitstatus(SpiltStatus splitstatus) {
        this.splitstatus = splitstatus;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }
}
