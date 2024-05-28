import aulas.Lista;
import java.util.ArrayList;

public class Exercicios {
    public static void main(String[] args) {
        Lista<String> Alist1 = new Lista<String>(5);
    
        /*Exercicios 1 - teste */
        Alist1.adiciona("Ana");
        Alist1.adiciona("Bianca");
        Alist1.adiciona("Cecilia");
        Alist1.adiciona("Dandara");
        System.out.println(Alist1);

        System.out.println(Alist1.contem("Ana"));
        System.out.println(Alist1.contem("Beatriz"));
        System.out.println("----------------------------------------------\n");
    /*Exercicios 2 - teste */
    ArrayList<String> teste = new ArrayList<String>(5);
    teste.add("A");
    teste.add("C");
    teste.add("D");
    teste.add("B");

    //lastIndexOf retorna o index se  o parametro for o ultimo item do array, retorna -1 se o parametro nao for o ultimo item do array

    System.out.println(teste.lastIndexOf("B")); // retorna 3
    System.out.println(teste.lastIndexOf("A")); //retorna 0
    
    Lista<String> Alist2 = new Lista<String>(5);
    
    Alist2.adiciona("um"); // indice 0
    Alist2.adiciona("dois"); // indice 1
    Alist2.adiciona("um"); // indice 2

    System.out.println(Alist2.ultimoIndice("dois"));
    System.out.println(Alist2.ultimoIndice("um"));
    System.out.println("----------------------------------------------\n");
    }
}
