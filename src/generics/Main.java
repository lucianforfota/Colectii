package generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GenericClass<Integer> object1 = new GenericClass<>(500);
        GenericClass<String> object2 = new GenericClass<>("abc");

        Integer number = object1.get();
        String text = object2.get();

        System.out.println(number);
        System.out.println(text);


        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);


        SimpleClass simpleClass = new SimpleClass();
        Character[] characters ={'a','b'};
        Integer[] numbers = {1,2,3};
        
        simpleClass.printArray(characters);
        simpleClass.printArray(numbers);

    }


}
