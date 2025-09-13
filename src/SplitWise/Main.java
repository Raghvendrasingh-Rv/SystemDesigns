package SplitWise;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        User rv = new User(1,"RV");
        User uddesh = new User(2,"Uddesh");
        User ayush = new User(3,"Ayush");

        Groups g1 = new Groups("Vanaras", 1);
        g1.addMember(rv);
        g1.addMember(uddesh);
        g1.addMember(ayush);

        // 300

        List<Split> splits = Arrays.asList(new Split(rv, 100), new Split(uddesh, 100),new Split(ayush, 100));

        Expense e1 = new Expense(1, 300, rv, SplitType.EQUAL, splits);

        g1.addExpense(e1);

        g1.showBalance();


    }
}
