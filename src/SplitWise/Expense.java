package SplitWise;

import java.util.List;

public class Expense {

    private int expenseId;
    private int amount;
    private User paidby;
    private SplitType splitype;
    private List<Split> splits;



    public Expense(int expenseId, int amount, User paidby, SplitType splitype, List<Split> splits) {
        this.expenseId = expenseId;
        this.amount = amount;
        this.paidby = paidby;
        this.splitype = splitype;
        this.splits = splits;
    }

    public int getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public User getPaidby() {
        return paidby;
    }

    public void setPaidby(User paidby) {
        this.paidby = paidby;
    }

    public SplitType getSplitype() {
        return splitype;
    }

    public void setSplitype(SplitType splitype) {
        this.splitype = splitype;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public void setSplits(List<Split> splits) {
        this.splits = splits;
    }
}
