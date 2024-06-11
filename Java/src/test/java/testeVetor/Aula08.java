import aulas.Vetor.Vetor;

public class Aula08 {

    public static void main(String[] args) {

        Vetor vet = new Vetor(3);

        System.out.println(vet);
        
        vet.adicionaBool("elemento1"); // i=0
        vet.adicionaBool("elemento2"); // i=1
        vet.adicionaBool("elemento3"); // i=2
        vet.adicionaBool("elemento4"); // i=3
        vet.adicionaBool("elemento5"); // i=4

        System.out.println(vet);
    }
}
