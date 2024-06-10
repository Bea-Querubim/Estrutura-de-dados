import aulas.Vetor.Vetor.VetorObject;

public class Aula10 {

    public static void main(String[] args) {
        // teste do VetorObject trocando o tipo String para Object

        VetorObject vetor = new VetorObject(5);
        /* 
        vetor.adicionaBool('a');
        vetor.adicionaBool(4);
        vetor.adicionaBool("contato");

        System.out.println("Tamanho = " + vetor.tamanho());
        System.out.println(vetor);
         */

        //testando os Contatos
        Contato contact1 = new Contato("Beatriz", "1234-2345", "beatriz@email.com");
        Contato contact2 = new Contato("Paulo", "1472-2580", "paulo@email.com");
        Contato contact3 = new Contato("Ana", "9873-6543", "ana@email.com");

        //criamos contato 4, apenas com o nome da variavel diferente, mas infos do obj iguais
        Contato contact4 = new Contato("Beatriz", "1234-2345", "beatriz@email.com");

        vetor.adicionaBool(contact1);
        vetor.adicionaBool(contact2);
        vetor.adicionaBool(contact3);

        System.out.println("Tamanho = " + vetor.tamanho());
        System.out.println(vetor);

        //testar antes de sobreescrever (sobrecarga) -> metodo equals
        int pos = vetor.busca(contact4);
        if(pos > -1) System.out.println("Elemento existe no vetor");
        else System.out.println("Elemento não existe no vetor");
    }
}
