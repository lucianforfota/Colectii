package exercitii.algorithmics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex5GroupSameElements {

    public static void main(String[] args) {
        //1,3,2,1,2,1
        //1,1,1,3,2,2

    }

    public static List<Integer> groupElements (List<Integer> numbers){
        Map<Integer, Integer> elFrequency = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (Integer number: numbers){
//            if (!elFrequency.containsKey(number)){
//                elFrequency.put(number,1);
//            } else{
//                elFrequency.put(number, elFrequency.get(number)+1);
//            }
            elFrequency.put(number, elFrequency.getOrDefault(number, 0) + 1);

        }

        for (Integer element: elFrequency.keySet()){
            for (int i = 0; i < elFrequency.get(element); i++) {
                result.add(element);
            }
        }

        return  result;
    }
}
