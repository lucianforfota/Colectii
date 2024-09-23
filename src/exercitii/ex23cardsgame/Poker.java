package exercitii.ex23cardsgame;

import java.util.List;

public class Poker extends Game{

    public static final Integer numberOfHandCards = 8;

    public Poker(List<Card> cards, List<Player> players) {
        super(cards, players);
    }

    @Override
    public void deal() {

    }

    @Override
    public String play() {
        return "";
    }
}
