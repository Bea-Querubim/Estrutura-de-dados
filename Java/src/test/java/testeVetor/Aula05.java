import aulas.Vetor.Vetor;

public class Aula05 {

    public static void main(String[] args) {
        Vetor vet = new Vetor(3);
        
        try {
            vet.adiciona("elemento 1"); //posicao 0
            vet.adiciona("elemento 2");//posicao 1
            vet.adiciona("elemento 3");//posicao 2
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println(vet.busca(1));
        System.out.println(vet.busca(15));

    }
}
