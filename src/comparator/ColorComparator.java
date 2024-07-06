package comparator;

import java.util.Comparator;


public class ColorComparator implements Comparator<Coin> {

    @Override
    public int compare(Coin c1, Coin c2) {
        return c1.getColor().compareTo(c2.getColor());
    }
}
