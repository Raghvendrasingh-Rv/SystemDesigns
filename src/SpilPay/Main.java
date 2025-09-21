import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User A = new User(1, "A");
        User B = new User(2, "B");
        User C = new User(3, "C");

        Group g1 = new Group(1, "NorthTrip");

        g1.addUser(A);
        g1.addUser(B);
        g1.addUser(C);

//        A owes 1000.0 of B
//        B owes 600.0 of A
//        C owes 100.0 of A
//        C owes 2000.0 of B
        //first expense

        List<Split> splits = new ArrayList<>();
        Split SA = new Split(A, 300);
        Split SB = new Split(B, 600);
        Split SC = new Split(C, 100);

        splits.add(SA);
        splits.add(SB);
        splits.add(SC);

        ExpenseBill eb1 = new ExpenseBill(1, 1000.0, A,splits,SpiltStatus.UNEQUAL);

        g1.addExpense(eb1);

        // second bill

        splits = new ArrayList<>();
//        Split SA1 = new Split(A, 0);
        Split SB1 = new Split(B, 1000);
        Split SC1 = new Split(C, 1000);

//        splits.add(SA1);
        splits.add(SB1);
        splits.add(SC1);

        ExpenseBill eb2 = new ExpenseBill(2, 2000.0, B,splits,SpiltStatus.UNEQUAL);

        g1.addExpense(eb2);

        // third bill

        splits = new ArrayList<>();
        Split SA11 = new Split(A, 1000);
        Split SB11 = new Split(B, 1000);
        Split SC11 = new Split(C, 1000);

        splits.add(SA11);
        splits.add(SB11);
        splits.add(SC11);

        ExpenseBill eb3 = new ExpenseBill(3, 3000.0, B,splits,SpiltStatus.UNEQUAL);

        g1.addExpense(eb3);

        g1.viewBalanceSheet();
    }
}
