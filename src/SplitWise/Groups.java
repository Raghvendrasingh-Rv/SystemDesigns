package SplitWise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Groups {

    private int groupId;
    private String groupName;
    private List<User> members;
    private List<Expense> expanses;
    public Map<User, Map<User, Integer>> balanceSheet = new HashMap<>();

    public void addMember(User user){
        members.add(user);
    }
    public void addExpense(Expense exp){
        expanses.add(exp);
        addExpenseInList(exp);
    }

    public void addExpenseInList(Expense e1){
        User paidBy = e1.getPaidby();

        for(Split split : e1.getSplits()){
            User user = split.getUser();
            if(user == paidBy) continue;

            balanceSheet.putIfAbsent(user, new HashMap<>());
            balanceSheet.get(user).put(paidBy, balanceSheet.get(user).getOrDefault(paidBy, 0)+ split.getAmount());
        }
    }

    public void showBalance(){
        for(User u1: balanceSheet.keySet()){
            for(User u2 : balanceSheet.get(u1).keySet()){
                int amount = balanceSheet.get(u1).get(u2);
                if(amount>0){
                    System.out.println(u1.getName() + " owes "+ u2.getName()+" : "+ amount
                    );
                }
            }
        }
    }



    public Groups(String groupName, int groupId) {
        this.groupName = groupName;
        this.groupId = groupId;
        this.members = new ArrayList<>();
        this.expanses = new ArrayList<>();
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    public List<Expense> getExpanses() {
        return expanses;
    }

    public void setExpanses(List<Expense> expanses) {
        this.expanses = expanses;
    }
}
