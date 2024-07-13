package exercitii.algorithmics;

import java.util.List;

public class Ex1MaxProfit {

    //Ca si input ai un array cu preturile unei actiuni in fiecare zi.
    // Va trebui sa determini in ce zi trebuie sa cumperi si in ce zi trebuie sa vinzi ca sa obtii profitul maxim
    //
    //Exemplu:
    //
    //Input: [100, 180, 260, 310, 40, 535, 695]
    //Output: Cumpara in ziua 5 (la pretul de 40) si vinde in ziua 7 (la pretul de 695),
    // adica profit maxim 695-40=655
    //Input2: [2, 3, 10, 6, 4, 8, 1]
    //Output: Cumpara in ziau 0 (la pretul de 2) si vinde in ziua 2 (la pretul de 10),
    // adica profit maxim 10-2=8

    public static void main(String[] args) {
        //varianta 1
        //diferenta maxima este 0 initial
        //pentru fiecare element din array
             //pentru fiecare element de dupa elementul curent
                     //diferenta curenta devine elementul de dupa curent - elementul curent
                     //daca diferenta  este mai mare decat diferenta maxima
                            //diferenta maxima devina diferenta curenta

        //varianta 2
        //initial min este infinit
        //initial diferenta maxima este 0
        //pentru fiecare element din array
            //daca elementul curent este mai mic decat min
                //min devine elementul curent
            //altfel daca diferente dintre elementul curent si min este mai mare decat diferenta maxima
                //diferenta maxima devine diferenta dintre elementul curent si min




    }

    public static Integer getMaxProfit(List<Integer> prices){
        Integer minPrice = Integer.MAX_VALUE;
        Integer maxProfit = 0;
        for (Integer price: prices){
            if (price < minPrice){
                minPrice = price;
            } else if (price - minPrice > maxProfit){
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}
