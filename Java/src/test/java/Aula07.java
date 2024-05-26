
import aulas.Vetor;

public class Aula07 {

    public static void main(String[] args) {

        Vetor vet = new Vetor(10);

        vet.adicionaBool("A"); // i=0
        vet.adicionaBool("C"); // i=1
        vet.adicionaBool("E"); // i=2
        vet.adicionaBool("F"); // i=3

        System.out.println(vet);
        vet.adicionaBool(1, "B"); // i=1 valor "B"
        System.out.println(vet);
        vet.adicionaBool(3, "D"); // i=3 valor "D"
        System.out.println(vet);
    }
}
