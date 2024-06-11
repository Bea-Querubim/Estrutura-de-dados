import aulas.Vetor.Vetor;

public class Aula03 {
    public static void main(String[] args) {
        Vetor vet = new Vetor(2);

        vet.adicionaBool("elemento 1");
        vet.adicionaBool("elemento 2");
        vet.adicionaBool("elemento 3");
        
        try {
            vet.adiciona("elemento 1");
            vet.adiciona("elemento 2");
            vet.adiciona("elemento 3");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(vet);
    }
}
