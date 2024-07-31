package exercitii.algorithmics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Reversedpairs {

    //block(in java orice acolada care se deschide si se inchide este un bloc, sau orice if, for, etc. in block se pot reinitializa variabilele
//    {int c=3;}
//    {int c=3;}

//    int c=3;
//    int c=3;

    public static void main(String[] args) {
        //input-[diaper,abc,test,cba,repaid]
        //output-[diaper,repaid],[abc,cba]

        List<String> lista = List.of("diaper", "abc","abc", "test", "cba", "repaid","mos","som");
        System.out.println( getReversedPairs(lista));
    }

    public static List<List<String>> getReversedPairs(List<String> words) {
        List<List<String>> reversedPairs = new ArrayList<>();
        //construiesc un set cu toate cuvintele din words
        Set<String> wordsSet = new HashSet<>(words);
        //pt fiecare cuvant din lista de cuvinte
        for (String word : words) {
            //aflu inversul cuvantului curent
            String reversedWord = new StringBuilder(word).reverse().toString();
            //daca setul contne inversul
            if (wordsSet.contains(reversedWord)) {
                //bag in output o noua pereche cu cuvantul curent si inversul lui
                List<String> pair = new ArrayList<>();
                pair.add(word);
                pair.add(reversedWord);
                reversedPairs.add(pair);
                //sterg din set cuvantul curent
                wordsSet.remove(word);
                //sterg din set inversul lui
                wordsSet.remove(reversedWord);
            }


        }
        //returnez outputul
        return reversedPairs;
    }
}
