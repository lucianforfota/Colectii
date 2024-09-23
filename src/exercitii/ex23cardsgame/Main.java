package exercitii.ex23cardsgame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    //23. Joc de carti
    //Dezvoltati o aplicatie Java pentru simularea jocurilor de carti:
    //
    //BlackJack
    //Poker
    //
    // Pentru a juca este nevoie de jucatori(Player) care sunt caracterizati de nume.
    //Pentru tipurile de joc, mai este nevoie de un set de carti(Card) care sunt caracterizate de:
    //
    //numar(1-15)
    //simbol(rosu - hearts, negru - spades, romb - diamonds, trefla - clubs).
    //Un joc este caraterizat de:
    //
    //Nr. de jucatori (BlackJack - maxim 6, Poker - maxim 4)
    //setul de carti
    //lista de jucatori
    //Ambele jocuri au casi comporttamente comune:
    //
    //a juca (play)
    //a imparti cartile(deal). Fiecare joc implementeaza diferit metodele play, deal.
    //La impartirea cartilor(deal) se distribuie fiecarui jucator un subset de carti din setul predefinit al jocului curent
    // astfel ca se genereaza pentru fiecare player(cheie) un set de carti aleator(valoare).
    //
    //Pentru jocul de BlackJack se distribuie cate 5 carti fiecarui jucator si castiga jucatorul
    // care are suma cartilor cea mai apropiata de 21.
    //
    //Pentru Poker se distribuie cate 8 carti fiecarui jucator si castiga jucatorul cu cea mai mare carte.
    //
    //Pentru pornirea jocurilor se creeaza o clasa GameStarter care contine metoda de start in interiorul careia
    // se fac declararile si initializarile pentru un anumit joc.
    //
    //Daca se incearca inceperea unui joc u un numar mai mare de jucatori decat cel suportat de jocul respectiv,
    // se genereaza o exceptie NoOfPlayersNotSuportedException
    //
    //Totodata sa se creeze o clasa de test pentru diferite scenarii ale metodei play.

    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();
        Player player1 = new Player("j1");
        Player player2 = new Player("j2");
        Player player3 = new Player("j3");
        players.add(player1);
        players.add(player2);
        players.add(player3);

        BlackJack game1 = new BlackJack(createDeck(),players);
        game1.deal();

        try{
            game1.play();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    private static List<Card> createDeck(){
        List<Card> deck = new ArrayList<>();
        List<String> symbols = Arrays.asList("hearts","spades","diamonds","clubs");
        for(int i=1;i<=13;i++){
            //parcrug simnolurile din lista de simboluri
            for (String symbol: symbols){
                deck.add(new Card(i, symbol));
            }
        }
        return deck;
    }
}
