import aulas.Vetor.Vetor;

public class Aula09 {

    public static void main(String[] args) {

        Vetor vet = new Vetor(5);
        //Vetor vet = new Vetor(1);

        vet.adicionaBool("A"); // i=0
        vet.adicionaBool("teste"); // i=1
        vet.adicionaBool("B"); // i=2
        vet.adicionaBool("teste2"); // i=3
        vet.adicionaBool("C"); // i=4

        System.out.println(vet);
        vet.remove(1); // i=1 remover valor "teste"
        System.out.println(vet);
        //vet.remove(1); // removendo novamente para dar excecao

        vet.remove(vet, "teste2"); // usando a sobrecarga do metodo para buscar o elemento com valor igual a teste2 e remover do vetor
        System.out.println(vet);


    }
}
