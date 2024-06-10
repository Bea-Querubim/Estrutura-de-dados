import aulas.Vetor.Vetor;

public class Aula04 {

    public static void main(String[] args) {
        Vetor vet = new Vetor(10);

        vet.adicionaBool("elemento 1");
        vet.adicionaBool("elemento 2");
        vet.adicionaBool("elemento 3");

        //saida do tamanho do array preenchido
        System.out.println(vet.tamanho()); 

        //saida dos valores dentro do array
        System.out.println(vet.toString()); 

    }
}
