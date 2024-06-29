package exercitii.ex17anagrame;

import java.util.HashMap;
import java.util.Map;

public class Main {

//Primeste ca parametrii doua cuvinte si returneaza true, daca cuvintele sunt anagrame.
//Exemple:
//Input1: “race”, “care”
//Output1: true, pentru ca care contine aceleasi litere ca si race, si literele apar de acelasi numar de ori
//Input2:”race”, “carec”
//Output2: false, pentru ca nu contin acelasi litere, de acelasi numar de ori


    public static void main(String[] args) {
        String word1="race";
        String word2="care";
        System.out.println(areAnagrame(word1,word2));
    }

    public static boolean areAnagrame(String word1, String word2) {
          Map<Character, Integer> word1Map = generateMap(word1);
          Map<Character, Integer> word2Map = generateMap(word2);
          return word1Map.equals(word2Map);
    }

    public static Map<Character, Integer> generateMap (String word){
        Map<Character, Integer> charFreqeuncyMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (!charFreqeuncyMap.containsKey(word.charAt(i))){
                charFreqeuncyMap.put(word.charAt(i), 1);
            }
            else{
                charFreqeuncyMap.put(word.charAt(i), charFreqeuncyMap.get(word.charAt(i))+1);
            }
        }
        return charFreqeuncyMap;
    }

}

