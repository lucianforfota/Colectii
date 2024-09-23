package exercitii.ex23cardsgame;

import java.util.List;
import java.util.Random;

public class BlackJack extends Game{

    public static final Integer numberOfHandCards = 5;

    public BlackJack(List<Card> cards, List<Player> players){
        super(cards, players);
    }

    @Override
    public void deal() {
        //pentru fiecare jucator al jocului
             //repet de 5 ori
                //generez random o pozitie din arrat-ul de carti al jocului
                //cartea de la pozitia generata random din array-ul de carti al jocului o adaug in lista de carti a jucatorului curent
                //cartea de la pozitia generata random o stergem din array-ul de carti al jocului

        Random random = new Random();
        for (Player player: getPlayers()){
            for (int i = 0; i < 5; i++) {
                int randomIndex = random.nextInt(getCards().size());
                player.getHand().add(getCards().get(randomIndex));
                getCards().remove(randomIndex);
            }
        }
    }
    @Override
    public String play() throws Exception{
        //initial suma maxima este 0;
        //initial castigarul este string vid
        //petru fiecare jucator al joclui
              //calculam suma cartilor jucatorului
              //daca suma mai mare decat suma maxima SI suma mai mica sau egal decat 21
                     //suma maxima devine suma actuala
                     //castigatorul devine numele player-ului curent
        //returnam castigatorul
        int maxSum = 0;
        String winner = "";
        for (Player player: getPlayers()){
            /*int sum = 0;
            for (Card card: player.getHand()){
                sum += card.getNumber();
            }*/
            Integer sum = getPlayerHandSum(player);
            if (sum > maxSum && sum<=21){
                maxSum = sum;
                winner = player.getName();
            }
        }
        if (winner.isEmpty()){
            throw  new Exception("n-avem castigator");
        }
        return winner;
    }

    private static Integer getPlayerHandSum(Player player) {
        return  player.getHand().stream()
                .map(card -> card.getNumber())
                .reduce((cardSum, number) -> cardSum+number).get();

    }
}
