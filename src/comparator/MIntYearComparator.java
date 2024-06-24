package comparator;

import java.util.Comparator;

public class MIntYearComparator implements Comparator<Coin> {
    @Override
    public int compare(Coin c1, Coin c2) {
        return Integer.valueOf(c1.getMintYear()).compareTo(Integer.valueOf(c2.getMintYear()));
    }
}
