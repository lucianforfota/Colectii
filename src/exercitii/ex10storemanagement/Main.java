package exercitii.ex10storemanagement;

public class Main {

    public static void main(String[] args) {
        //10. Gestiunea produselor dintr-un magazin
        //Într-un magazin există produse, caracterizate de nume, preț, categorie.
        // Categoria este un enum, care are valorile LACTATE, MEZELURI, LEGUME&FRUCTE.
        // Task-ul este să grupăm produsele după categorii.
        //
        //Astfel, avem:
        //
        //Clasa Product
        //Enum-ul Category
        //Într-o clasă Shop, avem atributul products, care este o mapă având cheia Category (care este un enum) și valoarea o listă de produse (din acea categorie).
        //
        //Metode:
        //Add product
        //Adaugă un produs nou în mapa.
        //Dacă categoria produsului există deja, se va adăuga produsul la acea categorie în mapa, altfel se va crea o nouă categorie în care va fi inițial produsul adăugat.
        //getProductByCategory
        //Va returna toate produsele dintr-o anumită categorie.
        //getAllCategories
        //Va returna toate categoriile din mapa.
        //deleteProduct
        //Va șterge un produs din mapa.
    }
}
