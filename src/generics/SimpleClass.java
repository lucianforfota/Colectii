package generics;

public class SimpleClass {

    //aceasta este o functie generica
    public <T> void printArray(T[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
