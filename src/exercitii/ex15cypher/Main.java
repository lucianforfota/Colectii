package exercitii.ex15cypher;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    //15. Implementează un cifru (encryption - decryption)
    //Cel mai simplu cifru este definit de o regulă în care fiecare caracter este codificat prin alt caracter.
    //
    //De exemplu, dacă un cifru are la dispoziție:
    //
    //Caractere valide: {'a', 'e', 'i', 'o', 'u', 'c', 'n', 'd', 'b', 's', 'l', 'm'}
    //Codificările caracterelor valide: {'s', 't', 'n', 'f', 'g', 'h', 'j', 'k', 'x', 'y', 'z', 'q'}
    //Atunci când încercăm să codificăm cuvântul “slab”, vom obține “yzsx”.
    // Iar atunci când încercăm să decodificăm “qsjs”, vom obține “mana”.
    //
    //Asigură operațiile de codificare și decodificare pentru un cuvânt,
    // având la dispoziție lista de caractere valide și lista de caractere codificate.
    //
    //Creează clasa Cypher
    //Atribute:
    //inputChars: (lista de caractere valide)
    //outputChars: (lista de caractere codificate)
    //Metode:
    //initializeCypher()
    //Construiește o mapă în care fiecare cheie este un caracter și fiecare valoare este codificarea caracterului.
    //De exemplu, pentru exemplul de mai sus, mapa va arăta așa: {a=s, b=x, c=h, d=k, e=t, i=n, l=z, m=q, n=j, o=f, s=y, u=g}
    //encrypt()
    //Primește ca parametru un cuvânt și returnează cuvântul codificat
    //decrypt()
    //Primește ca parametru un cuvânt și returnează cuvântul decodificat
    //Creează clasa Main
    //Aici vor fi apelate metodele cifrului
    public static void main(String[] args) {
        List<Character> normalCharacters = List.of('a', 'e', 'i', 'o', 'u', 'c', 'n', 'd', 'b', 's', 'l', 'm');
        List<Character> encryptedCharacters = List.of('s', 't', 'n', 'f', 'g', 'h', 'j', 'k', 'x', 'y', 'z', 'q');
        String messageTOEcrypt = "slab";
        Map<Character, Character> cypherMap = buildCypherMap(normalCharacters, encryptedCharacters);
        System.out.println(encrypt(cypherMap,messageTOEcrypt));
    }

    public static Map<Character, Character> buildCypherMap (List<Character> normalCharacters, List<Character> encryptedCHaractes){
        Map<Character, Character> cypherMap = new HashMap<>();
        for (int i = 0; i < normalCharacters.size(); i++){
            cypherMap.put(normalCharacters.get(i), encryptedCHaractes.get(i));
        }
        return cypherMap;
    }

    public static String encrypt (Map<Character, Character> cypherMap, String messageToEcnrypt){
        String encryptedMessage="";
        for (int i = 0; i < messageToEcnrypt.length(); i++) {
            encryptedMessage += cypherMap.get(messageToEcnrypt.charAt(i));
        }
        return encryptedMessage;
    }
}
