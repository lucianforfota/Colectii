package exercitii.algorithmics;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        //input- yo,act,flop,tac,foo,cat,oy,olfp
        //output-[[yo,oy],[act,cat,tac],[flop,olfp],[foo]]
        List<String>list=List.of("oy","act","flop","tac","foo","cat","oy","olfp","yo","oy");
        System.out.println(groupAnagrams(list));

    }

    public static List<List<String>> groupAnagrams(List<String> words) {
        Map<String, List<String>> anagramsMap = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        //pentru fiecare word din words
        for (String word : words) {

            //aflu cuvantul curent sortat alfabetic

            //se transforma stringul intr-un array de caractere
            char[] charArray = word.toCharArray();
            //se sorteaza  arrayul de caractere pe clasa Arrays din JAVA
            Arrays.sort(charArray);
            //conversia arrayului sortat inapoi intr-un sir  new String(charArray)
            String sortedWord = new String(charArray);

            //daca mapa noastra  contine ca si cheie cuvantul sortat
            if (anagramsMap.containsKey(sortedWord)) {
                //adaug la valoarea cheii cuvantului sortat(care e o lista) cuvantul curent
                anagramsMap.get(sortedWord).add(word);
                //altfel  bag in mapa ca si cheie cuvantul sortat si ca si valoare o lista cu cuvantul curent
            } else {
                List<String> value = new ArrayList<>();
                value.add(word);
                anagramsMap.put(sortedWord, value);
            }
        }

        //pentru fiecare cheie din setul de chei al mapei
        for (String word : anagramsMap.keySet()) {
            //iau valoarea de la cheie si o adaug in lista result
            result.add(anagramsMap.get(word));
        }
        //returnez result
        return result;
    }
}

