import aulas.Lista;
import java.util.Scanner;

/* Exercicio 6 */
public class ExerciciosContato {

    public static void main(String[] args) {

        //crie um vetor com capacidade para 20 contatos
        Lista<Contato> contactsList = new Lista<Contato>(10);

        //preenche contatos dinamicamente
        //insira 30 contatos no vetor -> exercicio
        //preencheContato(2, contactsList);
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
    private static void preencheContato(int quantidade, Lista<Contato> lista) {

        Contato contact;
        String nomeString, telefoneString, emailString;

        for (int i = 1; i <= quantidade; i++) {
            nomeString = ("Contato" + i);
            telefoneString = ("000000000" + i);
            emailString = ("contato" + i + "@contato.com.br");

            contact = new Contato(nomeString, telefoneString, emailString);
            lista.adiciona(contact);
        }
    }

    //apresenta menu
    protected static int menu(Scanner scan) {

        boolean entradaValida = false;
        int opcao = 0;
        String entrada;

        while (!entradaValida) {

            System.out.println("\n\nDigite a opção desejada:\n");
            System.out.println("1: Adiciona um contato ao final do vetor");
            System.out.println("2: Adiciona contato em uma posição específica do vetor");
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
            }
        }

        return opcao;
    }

    // Opções do menu
    private static void addContato(Scanner scan, Lista<Contato> lista) {
        System.out.println("Entre com as informações para criar o novo contato...\n");
        String nome = leituraDados("Entre com o nome: ", scan);
        String telefone = leituraDados("\nEntre com o telefone: ", scan);
        String email = leituraDados("\nEntre com o email: ", scan);

        Contato contato = new Contato(nome, telefone, email);
        System.out.println("\n\nContato adicionado!");
        System.out.println(contato);
    }

    protected static String leituraDados(String msg, Scanner scan) {
        System.out.println(msg);
        String entradaDados = scan.nextLine();
        return entradaDados;
    }

    private static void addContatoPos(Scanner scan, Lista<Contato> lista) {
        System.out.println("Entre com as informações para criar o novo contato...\n");
        String nome = leituraDados("Entre com o nome: ", scan);
        String telefone = leituraDados("\nEntre com o telefone: ", scan);
        String email = leituraDados("\nEntre com o email: ", scan);

        Contato contato = new Contato(nome, telefone, email);

        int pos = leituraDadosInt("\n\nEntre com a posição desejada: ", scan);
        try {
            lista.adiciona(pos, contato);
            System.out.println("\n\nContato adicionado!");
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Contato não adicionado, posição invalida!");
        }
    }

    protected static int leituraDadosInt(String msg, Scanner scan) {
        boolean entradaValida = false;
        int num = 0;
        while (!entradaValida) {
            try {
                System.out.println(msg);
                String entradaDados = scan.nextLine();

                num = Integer.parseInt(entradaDados); // se o parse der ruim, ele ja cai na exceção, nao executa a proxima linha de codigo

                entradaValida = true;

            } catch (Exception e) {
                System.out.println("\nEntrada invalida, tente novamente...\n\n");
            }
        }
        return num;
    }

    private static void obtemContatoPos(Scanner scan, Lista<Contato> lista) {

        int pos = leituraDadosInt("Entre com a posição a ser pesquisada no vetor: ", scan);
        try {
            Contato contato = lista.obtem(pos);

            System.out.println("Contato encontrado: ");
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Posição invalida!");
        }
    }

    private static void pesquisaContato(Scanner scan, Lista<Contato> lista) {

        int pos = leituraDadosInt("Entre com a posicao a ser pesquisada: ", scan);
        try {
            Contato contato = lista.busca(pos);
            System.out.println("Contato encontrado: ");
            System.out.println(contato);

            System.out.println("No momento apenas é possível pesquisar a posição desse contato.");

            pos = lista.busca(contato);
            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição invalida!");
        }
    }

    private static void pesquisaUltimoContato(Scanner scan, Lista<Contato> lista) {

        int pos = leituraDadosInt("Entre com a posição a ser pesquisada no vetor: ", scan);
        try {
            Contato contato = lista.busca(pos);
            System.out.println("Ultimo Contato encontrado: ");
            System.out.println(contato);

            pos = lista.ultimoIndice(contato);
            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição invalida!");
        }
    }

    private static void verificaContato(Scanner scan, Lista<Contato> lista) {

        int pos = leituraDadosInt("Entre com a posição a ser pesquisada no vetor: ", scan);
        try {
            Contato contato = lista.busca(pos);
            Boolean existe = lista.contem(contato);
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

    private static void excluirPosicao(Scanner scan, Lista<Contato> lista) {

        int pos = leituraDadosInt("Entre com a posição a ser removida: ", scan);
        try {
            lista.remove(pos);
            System.out.println("Contato removido com sucesso.");

        } catch (Exception e) {
            System.out.println("Posição invalida!");
        }
    }

    private static void excluirContato(Scanner scan, Lista<Contato> lista) {

        int pos = leituraDadosInt("Entre com a posição a ser removida: ", scan);
        try {
            Contato contato = lista.busca(pos);
            lista.remove(contato);
            System.out.println("Contato removido com sucesso.");

        } catch (Exception e) {
            System.out.println("Posição invalida!");
        }
    }

    private static void tamanhoVetor(Lista<Contato> lista) {

        System.out.println("O vetor possui tamanho igual a: " + lista.tamanho());
    }

    private static void limpaVetor(Lista<Contato> lista) {

        lista.limpar();
        System.out.println("Todos os contatos foram removidos, o vetor está vazio!");
    }

    private static void imprimeVetor(Lista<Contato> lista) {
        System.out.println(lista);
    }
}
