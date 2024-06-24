package exercitii.ex7countwords;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //7. Scrie o metoda care:
        //Primeste ca parametru o lista de cuvinte si
        // returneaza de cate ori apare fiecare cuvant in lista
        //Exemplu:
        //Input: {“ana”, “are”, “mere”, “are”}
        //Output: {ana=1, are=2, mere=1}

        System.out.println(countWords(List.of("ana","are","mere","are")));
    }

    public static Map<String, Integer> countWords (List<String> words){
        Map<String,Integer> result = new HashMap<>();
        for (String word: words){
            if (!result.containsKey(word)){
                result.put(word, 1);
            } else{
                result.put(word, result.get(word)+1);
            }
        }
        return result;
    }
}
