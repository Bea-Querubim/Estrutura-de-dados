import aulas.Lista;

public class Aula11 {
    public static void main(String[] args) {
        Lista<String> v = new Lista<String>(3);

        v.adiciona("elemento");
        v.adiciona("2");

        System.out.println(v);
        /*
        nesses exemplos a baixo o proprio compliador nao permite passar parametros diferentes de string no vetor, pois colocamos o tipo dele como String
        
        v.adicionaBool(1);
        v.adicionaBool(new Contato("bea", "1245-1234", "bea@email.com"))
        */
        Lista<Contato> vetContato = new Lista<Contato>(4);
        Contato contact1 = new Contato("Beatriz", "1234-2345", "beatriz@email.com");
        Contato contact2 = new Contato("Paulo", "1472-2580", "paulo@email.com");
        Contato contact3 = new Contato("Ana", "9873-6543", "ana@email.com");
        
        vetContato.adiciona(contact1);
        vetContato.adiciona(contact2);
        vetContato.adiciona(contact3);

        System.out.println(vetContato);
    }
}
