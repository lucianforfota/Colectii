package exercitii.ex23cardsgame;

import java.util.List;

public abstract class Game {

    private List<Card> cards;

    private List<Player> players;

    public Game(List<Card> cards, List<Player> players) {
        this.cards = cards;
        this.players = players;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public abstract void deal();

    public abstract String play() throws Exception;



}
