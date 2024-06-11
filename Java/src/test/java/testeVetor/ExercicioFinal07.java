import java.util.ArrayList;
import java.util.Scanner;

/* Exercicio 7 */
public class ExercicioFinal07 extends ExerciciosContato {

    public static void main(String[] args) {

        ArrayList<Contato> contactsList = new ArrayList<Contato>(20);
        //variaveis
        Scanner scan = new Scanner(System.in);
        //exibe menu
        int opcao = 1;

        while (opcao != 0) {
            opcao = menu(scan);

            switch (opcao) {
                case 1:
                    addContato(scan, contactsList);
                    break;
                case 2:
                    addContatoPos(scan, contactsList);
                    break;
                case 3:
                    obtemContatoPos(scan, contactsList);
                    break;
                case 4:
                    pesquisaContato(scan, contactsList);
                    break;
                case 5:
                    pesquisaUltimoContato(scan, contactsList);
                    break;
                case 6:
                    verificaContato(scan, contactsList);
                    break;
                case 7:
                    excluirPosicao(scan, contactsList);
                    break;
                case 8:
                    excluirContato(scan, contactsList);
                    break;
                case 9:
                    tamanhoVetor(contactsList);
                    break;
                case 10:
                    limpaVetor(contactsList);
                    break;
                case 11:
                    imprimeVetor(contactsList);
                    break;
                default:
                    break;
            }
        }
        System.out.println("Encerrando ... ");
    }

    //preenche contatos
    private static void preencheContato(int quantidade, ArrayList<Contato> lista) {

        Contato contact;
        String nomeString, telefoneString, emailString;

        for (int i = 1; i <= quantidade; i++) {
            nomeString = ("Contato" + i);
            telefoneString = ("000000000" + i);
            emailString = ("contato" + i + "@contato.com.br");

            contact = new Contato(nomeString, telefoneString, emailString);
            lista.add(contact);
        }
    }

    protected static void addContato(Scanner scan, ArrayList<Contato> lista) {
        System.out.println("Entre com as informações para criar o novo contato...\n");
        String nome = leituraDados("Entre com o nome: ", scan);
        String telefone = leituraDados("\nEntre com o telefone: ", scan);
        String email = leituraDados("\nEntre com o email: ", scan);

        Contato contato = new Contato(nome, telefone, email);
        lista.add(contato);
        
        System.out.println("\n\nContato adicionado!");
        System.out.println(contato);
    }

    protected static void addContatoPos(Scanner scan, ArrayList<Contato> lista) {
        System.out.println("Entre com as informações para criar o novo contato...\n");
        
        String nomeString = leituraDados("Entre com o nome: ", scan);
        String telefoneString = leituraDados("\nEntre com o telefone: ", scan);
        String emailString = leituraDados("\nEntre com o email: ", scan);

        Contato contato = new Contato(nomeString, telefoneString, emailString);

        int pos = leituraDadosInt("\n\nEntre com a posição desejada: ", scan);
        try {
            lista.add(pos, contato);
            System.out.println("\n\nContato adicionado!");
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Contato não adicionado, posição invalida!");
        }
    }

    protected static void obtemContatoPos(Scanner scan, ArrayList<Contato> lista) {

        int pos = leituraDadosInt("Entre com a posição a ser pesquisada no vetor: ", scan);
        try {
            Contato contato = lista.get(pos);

            System.out.println("Contato encontrado: ");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição invalida!");
        }
    }

    protected static void pesquisaContato(Scanner scan, ArrayList<Contato> lista) {

        int pos = leituraDadosInt("Entre com a posicao a ser pesquisada: ", scan);
        try {
            Contato contato = lista.get(pos);
            System.out.println("Contato encontrado: ");
            System.out.println(contato);

            System.out.println("No momento apenas é possível pesquisar a posição desse contato.");

            pos = lista.indexOf(contato);
            System.out.println("Contato encontrado na posição " + pos);
        } catch (Exception e) {
            System.out.println("Posição invalida!");
        }
    }

    protected static void pesquisaUltimoContato(Scanner scan, ArrayList<Contato> lista) {

        int pos = leituraDadosInt("Entre com a posição a ser pesquisada no vetor: ", scan);
        try {
            Contato contato = lista.get(pos);
            System.out.println("Ultimo Contato encontrado: ");
            System.out.println(contato);

            pos = lista.lastIndexOf(contato);
            System.out.println("Contato encontrado na posição " + pos);
        } catch (Exception e) {
            System.out.println("Posição invalida!");
        }
    }

    protected static void verificaContato(Scanner scan, ArrayList<Contato> lista) {

        int pos = leituraDadosInt("Entre com a posição a ser pesquisada no vetor: ", scan);
        try {
            Contato contato = lista.get(pos);
            Boolean existe = lista.contains(contato);
            if (existe) {
                System.out.println("Contato existe: ");
                System.out.println(contato);
            } else {
                System.out.println("Contato não existe");
            }
        } catch (Exception e) {
            System.out.println("Posição invalida!");
        }
    }

    protected static void excluirPosicao(Scanner scan, ArrayList<Contato> lista) {

        int pos = leituraDadosInt("Entre com a posição a ser removida: ", scan);
        try {
            lista.remove(pos);
            System.out.println("Contato removido com sucesso.");
        } catch (Exception e) {
            System.out.println("Posição invalida!");
        }
    }

    protected static void excluirContato(Scanner scan, ArrayList<Contato> lista) {

        int pos = leituraDadosInt("Entre com a posição a ser removida: ", scan);
        try {
            Contato contato = lista.get(pos);
            lista.remove(contato);
            System.out.println("Contato removido com sucesso.");
        } catch (Exception e) {
            System.out.println("Posição invalida!");
        }
    }

    protected static void tamanhoVetor(ArrayList<Contato> lista) {
        System.out.println("O vetor possui tamanho igual a: " + lista.size());
    }

    protected static void limpaVetor(ArrayList<Contato> lista) {
        System.out.println("Todos os contatos foram removidos, o vetor está vazio!");
    }

    protected static void imprimeVetor(ArrayList<Contato> lista) {
        System.out.println(lista);
    }
}
