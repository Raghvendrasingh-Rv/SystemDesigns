import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group {

    private int id;
    private String name;
    private List<User> users;
    private List<ExpenseBill> expenseBills;
    private Map<User, Map<User,Double>> balanceSheet;

    public Group(int id, String name) {
        this.id = id;
        this.name = name;
        this.users = new ArrayList<>();
        this.expenseBills = new ArrayList<>();
        this.balanceSheet = new HashMap<>();
    }

    public void addUser(User user){
        users.add(user);
    }

    public void addExpense(ExpenseBill exbill){
        expenseBills.add(exbill);
//        if(exbill.getSplitstatus() == SpiltStatus.UNEQUAL){
//            newPSlit
//        }else if(){
//
//        }
        updateBalance(exbill);
    }

    public void updateBalance(ExpenseBill expenseBill){
        User paidBy = expenseBill.getPaidBy(); //A

        for(Split split: expenseBill.getSplits()){
            User paidTo = split.getUser(); //B

            if(paidTo.getId()==paidBy.getId()) continue;

            if(!balanceSheet.containsKey(paidTo)){
                balanceSheet.put(paidTo,new HashMap<>());
            }

            if(!balanceSheet.get(paidTo).containsKey(paidBy)){
                balanceSheet.get(paidTo).put(paidBy,0.0);
            }

            balanceSheet.get(paidTo).put(paidBy,balanceSheet.get(paidTo).get(paidBy)+split.getPrice());
        }

    }

    public void viewBalanceSheet(){
            for(User paidTo : balanceSheet.keySet()){
                for(User paidBy: balanceSheet.keySet()){
                    double amount = 0.0;
                    amount = balanceSheet.get(paidTo).getOrDefault(paidBy,0.0);

                    if(amount>0){
                        System.out.println(paidTo.getName() + " owes " + amount + " of " + paidBy.getName());
                    }
                }
            }
    }
}
