package comparator;

import java.util.Comparator;
import java.util.Objects;

public class Coin implements Comparable<Coin> {

    private int nominalValue;
    private int mintYear;

    public Coin(int nominalValue, int mintYear) {
        this.nominalValue = nominalValue;
        this.mintYear = mintYear;
    }

    public int getNominalValue() {
        return nominalValue;
    }

    public void setNominalValue(int nominalValue) {
        this.nominalValue = nominalValue;
    }

    public int getMintYear() {
        return mintYear;
    }

    public void setMintYear(int mintYear) {
        this.mintYear = mintYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return nominalValue == coin.nominalValue && mintYear == coin.mintYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominalValue, mintYear);
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominalValue=" + nominalValue +
                ", mintYear=" + mintYear +
                '}';
    }

    @Override
    public int compareTo(Coin coin) {
        if (this.nominalValue == coin.nominalValue){
            return 0;
        } else if (this.nominalValue < coin.nominalValue) {
            return -1;
        }
        return 1;
    }
}
