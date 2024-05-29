
import aulas.Lista;
import java.util.Scanner;

public class ExerciciosContato {

    public static void main(String[] args) {
        /* Exercicios 
        //insira 30 contatos no vetor
        for (int i = 0; i < 30; i++) {
            Contato contact = new Contato(null, null, null);
            contacts.adiciona(contact);
        }
        System.out.println(contacts);
         */

        //crie um vetor com capacidade para 20 contatos
        Lista<Contato> contacts = new Lista<Contato>(20);

        //variaveis
        Scanner scan = new Scanner(System.in);

        //exibe menu
        int opcao = 1;

        while (opcao != 0) {
            opcao = menu(scan);

            switch (opcao){
                case 0:

                    break;
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:

                    break;
                case 11:

                    break;
                default:
                    throw new AssertionError();
            }
        }

        System.out.println("Encerrando ... ");
    }

    //apresenta menu
    protected static int menu(Scanner scan) {

        boolean entradaValida = false;
        int opcao = 0;
        String entrada;

        while (!entradaValida) {

            System.out.println("Digite a opção desejada:\n");
            System.out.println("1: Adiciona um contato ao final do vetor");
            System.out.println("2: Adiciona contato em uma posição específicado vetor");
            System.out.println("3: Obtém contato de uma posição específica");
            System.out.println("4: Consulta um contato");
            System.out.println("5: Consulta último índide do contato");
            System.out.println("6: Verifica se contato existe");
            System.out.println("7: Excluir por posição do vetor");
            System.out.println("8: Excluir um contato");
            System.out.println("9: Verifica tamanho do vetor");
            System.out.println("10: Excluir todos os contatos do vetor");
            System.out.println("11: Imprime vetor\n");
            System.out.println("0: Sair\n\n");

            try {
                entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao >= 0 && opcao <= 11) {
                    entradaValida = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Erro,por favor digite uma entrada válida! \n\n");
                clear();
            }
        }

        return opcao;
    }

    // Opções do menu
    //limpa Console
    public final static void clear() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addContato(){

    }
    
}
