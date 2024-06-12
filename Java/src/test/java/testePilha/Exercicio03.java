package testePilha;

import java.util.Scanner;

import aulas.Pilha.Pilha;

public class Exercicio03 {

    public static void main(String[] args) {
//---------Exercicio 2-------------------
        //Pilha com capacidade para 20 livros
        Pilha<Livro> pilhaLivros = new Pilha<Livro>();

        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n");
        //pilhaLivros.pilha(20);
        //exibe menu
        int opcao = 1;

        while (opcao != 0) {
            opcao = menu(scan);
            switch (opcao) {
                case 1:
                    addLivro(scan, pilhaLivros);
                    break;
                case 2:
                    verificarUltimoLivro(pilhaLivros);
                    break;
                case 3:
                    tirarLivro(pilhaLivros);
                    break;
                default:
                    break;
            }
        }
    }

    //apresenta menu
    protected static int menu(Scanner scan) {

        boolean entradaValida = false;
        int opcao = 0;
        String entrada;

        while (!entradaValida) {

            System.out.println("\n\nDigite a opção desejada:\n");
            System.out.println("1: Adiciona 1 livro a Pilha");
            System.out.println("2: Verifica o ultimo livro da pilha");
            System.out.println("3: Tira um livro da pilha");
            System.out.println("0: Sair\n\n");

            try {
                entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao >= 0 && opcao <= 3) {
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

    protected static String leituraDados(String msg, Scanner scan) {
        System.out.println(msg);
        String entradaDados = scan.nextLine();
        return entradaDados;
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

    private static void addLivro(Scanner scan, Pilha<Livro> pilha) {
        System.out.println("Entre com as informações do Livro...\n");

        String nome = leituraDados("Entre com o nome: ", scan);
        String isbn = leituraDados("\nEntre com o isbn: ", scan);
        int ano = leituraDadosInt("\nEntre com o ano: ", scan);
        String autor = leituraDados("\nEntre com o autor: ", scan);

        Livro livro = new Livro(nome, isbn, ano, autor);
        try {
            pilha.empilhar(livro);
            System.out.println(livro + " empilhado com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao adicionar livro a pilha...");
        }
    }

    private static void verificarUltimoLivro(Pilha<Livro> pilha) {
        System.out.println("O ultimo livro da pilha é: " + pilha.lastElement());
    }

    private static void tirarLivro(Pilha<Livro> pilha) {
        System.out.println("Desempilhando...: "+pilha);
        pilha.desempilhar();
        System.out.println("Atual pilha de livros:\n" + pilha);
    }
}
