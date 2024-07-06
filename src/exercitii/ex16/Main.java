package exercitii.ex16;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Main {
    public static void main(String[] args) {

        Book b1 = new Book(2005,"sdfsdf",Genre.NOVEL,"sfgfdg");
        Book b2 = new Book(2007,"sdfsdf",Genre.HOWTO,"sfgfdg");
        System.out.println(b1.compareTo(b2));


    }
}




