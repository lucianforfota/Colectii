package exercitii.ex13spellchecker;

import java.util.HashSet;
import java.util.Set;

public class Main {
    //13. Implementeaza un spell checker
    //Cel mai simplu spell checker este bazat pe o lista de cuvinte cunoscute
    // (un dictionar). Daca scrii un text,
    // fiecare cuvant trebuie cautat in lista de cuvinte cunoscute,
    // iar daca nu este gasit, inseamna ca e eronat.
    // Implementeaza un astfel de spell checker.
    //
    //Ce intra in program?
    //Pe prima linie utilizatorul introduce numărul de cuvinte din lista de cuvinte cunoscute.
    //Apoi, pe câte o linie separată introduce fiecare cuvant din lista de cuvinte cunoscute.
    //Apoi, pe o linie, se introduce numărul de linii al textului de verificat.
    //Se introduc exact atâtea linii cu text (cuvinte separate prin spațiu).
    //Ce iese din program?
    //Trebuie să afișam acele cuvinte din text care nu se regăsesc în lista de cuvinte cunoscute.
    //Trebuie să verificăm fără să ținem cont de literele mici și mari.
    //Cuvintele care nu sunt găsite în dicționar nu ar trebui să fie duplicate, dacă le regăsim de mai multe ori în text.
    //Exemplu
    //Input:
    //3
    //a
    //bb
    //cCc
    //2
    //a bb aab aba
    //ccc c bb aaa
    //Output:
    //c
    //aab
    //aaa
    //aba


    public static void main(String[] args) {

    }

    public static Set<String> getBadWords (String text, Set<String> dictionary){
        //iau un set gol badwords
        //parcurgem fiecare cuvant din text
            //daca cuvantul nu este in dictionar
                //adaug cuvantul in setul de bad words

        Set<String> badWords = new HashSet<>();

        for (String textWord : text.split(" ")) {
            if (!dictionary.contains(textWord)){
                badWords.add(textWord);
            }
        }
        return badWords;
    }
}
