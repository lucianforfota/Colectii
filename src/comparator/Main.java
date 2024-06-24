package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Coin big  = new Coin (25,2006);
        Coin medium1  = new Coin (10,2016);
        Coin medium2  = new Coin (10,2001);
        Coin small  = new Coin (2,2000);

        List<Coin> coins = new ArrayList<>();
        coins.add(big);
        coins.add(medium1);
        coins.add(medium2);
        coins.add(small);

        Collections.sort(coins);

        coins.sort(new MIntYearComparator());

        System.out.println(coins);



        System.out.println(coins);





    }
}
