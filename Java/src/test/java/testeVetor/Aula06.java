import aulas.Vetor.Vetor;

public class Aula06 {
    public static void main(String[] args) {
        
        Vetor vet = new Vetor(5);

        vet.adicionaBool("1"); // i=0
        vet.adicionaBool("2"); // i=1
        vet.adicionaBool("3"); // i=2
        vet.adicionaBool("4"); // i=3

        System.out.println(vet.verificaElementoBool("1"));
        System.out.println(vet.verificaElementoBool("10"));

        System.out.println();
        System.out.println(vet.verificaElementoInt("2"));
        System.out.println(vet.verificaElementoInt("20"));

    }
}
