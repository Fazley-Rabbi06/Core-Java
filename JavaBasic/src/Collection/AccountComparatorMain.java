package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AccountComparatorMain {
    public static void main(String[] args) {

        List<Account> accHolder = new ArrayList<Account>();
        accHolder.add(new Account(01,"x@gmail.comName",500,"Rahim",11288));
        accHolder.add(new Account(02,"y@gmail.comName",300,"Kahim",123577));
        accHolder.add(new Account(03,"a@gmail.comName",700,"Pahim",123456));
        accHolder.add(new Account(04,"z@gmail.comName",200,"Sahim",123466));

        for (Account obj: accHolder
             ) {
            System.out.println(obj);
        }

        //After sorting based on balance
        Comparator<Account> com = new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                if (o1.balance>o2.balance)
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(accHolder,com);
        System.out.println("After Sorting:");
        accHolder.forEach(System.out::println);

    }
}
