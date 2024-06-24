package listsetmap;

import comparator.Coin;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, String> productsMap = new HashMap<>();
        productsMap.put(1000, "Notebook");
        productsMap.put(2000, "Phone");
        productsMap.put(3000, "Keyboard");

        System.out.println(productsMap);

        System.out.println(productsMap.get(1000));

        productsMap.remove(1000);

        System.out.println(productsMap.get(1000));

        System.out.println(productsMap.containsKey(3000));

        for (Integer productCode : productsMap.keySet()){
            System.out.println(productsMap.get(productCode));
        }

        for ( Map.Entry<Integer, String> entry : productsMap.entrySet()){
            System.out.println(entry.getKey()  + "  " + entry.getValue());
        }

        Map<String, Set<String>> synonyms = new HashMap<>();
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Set<String> set3 = new HashSet<>();
        set1.add("mirobolant");
        set2.add("perspicace");
        set2.add("iute");
        set3.add("facil");
        set3.add("lejer");
        synonyms.put("frumos", set1);
        synonyms.put("rapid", set2);
        synonyms.put("simplu", set3);

        System.out.println(synonyms);


        String newWord = "word";
        String newKey = "key";

        if (!synonyms.containsKey(newKey)){
            Set<String> value = new HashSet<>();
            value.add(newWord);
            synonyms.put(newKey, value);
        } else{
            synonyms.get(newKey).add(newWord);
        }

        System.out.println(synonyms);
    }




}
