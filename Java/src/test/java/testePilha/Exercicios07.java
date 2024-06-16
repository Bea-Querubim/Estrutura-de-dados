package testePilha;

import java.util.Scanner;
import java.util.Stack;

public class Exercicios07 {
//Fala um algoritmo que faça conversao de decimal para binario

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a o numero a ser convertido: ");
        int numero = scan.nextInt();
        //resultado(numero);
        System.out.println("\n\n");

        int opcao = 1;

        while (opcao != 0) {
            opcao = menu(scan);
            
            switch (opcao) {
                case 1:
                String resultadoConversao = conversaoQlqBase(numero, 2);
                resultado( numero, resultadoConversao);
                    break;
                case 2:
                    System.out.println("Digite a base que irá converter o numero " + numero + ":");
                    int base = scan.nextInt();
                    resultadoConversao = conversaoQlqBase(numero, base);
                    resultado( numero, resultadoConversao);
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
            System.out.println("1: Converter o numero para binario.");
            System.out.println("2: Converter o numero para outra base");
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

    public static void resultado(int numero, String resultadoConversao) {
        System.out.println("O " + numero + " em binario é igual a: " + resultadoConversao);
    }

    /* 
    public static String conversaoBinario(int num) {
        Stack<Integer> stack = new Stack<>();
        String binario = "";
        int resto;

        while (num > 0) {
            resto = num % 2;
            stack.push(resto);
            num /= 2;
        }
        while (!stack.isEmpty()) {
            binario += stack.pop();
        }
        return binario;
    }
     */
    public static String conversaoQlqBase(int num, int base ) {
        Stack<Integer> stack = new Stack<>();
        String numBase = "";
        int resto;

        while (num > 0) {
            resto = num % base;
            stack.push(resto);
            num /= base;
        }
        while (!stack.isEmpty()) {
            numBase += stack.pop();
        }
        return numBase;
    }
}
