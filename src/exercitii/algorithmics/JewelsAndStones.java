
package exercitii.algorithmics;
//You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
// Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
//
//Letters are case sensitive, so "a" is considered a different type of stone from "A".
//
//
//
//Example 1:
//
//Input: jewels = "aA", stones = "aAAbbbb"
//Output: 3
//Example 2:
//
//Input: jewels = "z", stones = "ZZ"
//Output: 0

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

    public static void main(String[] args) {
        String jewels="ab";
        String stones="aabbccddeeababab";
        System.out.println(countJewels(jewels,stones));
    }
private static Set<Character>convertStringToSet(String jewels){
        Set<Character>characterSet=new HashSet<>();
        for(char c:jewels.toCharArray()){
            characterSet.add(c);
        }
        return characterSet;
}



    public static int countJewels (String jewels, String stones ){
        //trasnfrom de la string-ul jewels la un set cu toate caracterele din jewels
        //count initial este 0
        //pentru fiecare caracter din stones
            //daca setul contine caracterul curent
               //count++
        int count=0;
        Set<Character>characterSet=convertStringToSet(jewels);
        for(int i=0;i<stones.length();i++){
            if(characterSet.contains(stones.charAt(i))){
                count++;
            }
        }

        //returnez count;
        return count;
    }
}
