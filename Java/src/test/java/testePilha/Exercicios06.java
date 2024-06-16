package testePilha;

import java.util.Scanner;
import java.util.Stack;

public class Exercicios06 {
/* 
Verifique se uma expressao matematica esta escrita abrindo e fechando () ou [] ou {} de forma correta 
ou seja
1-> numero de ()[]{} sao iguais ( abertura e fechamento)
2-> se toda abertura tem um fechamento
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a expressao a ser verificada: ");
        String expressao = scan.nextLine();
        resultado(expressao);
    }

    public static void resultado(String expressao) {
        System.out.println("A expressao "+expressao+ " esta escrita de forma correta? ");
        System.out.println(verifica(expressao));
    }

    //final => usado para constantes no java
    final static String ABRE = "([{";
    final static String FECHA = ")]}";

    public static boolean verifica(String exp) {
        int i = 0;
        char simbolo, top;
        Stack<Character> stack = new Stack<Character>();

        while (i < exp.length()) {
            simbolo = exp.charAt(i);

            if (ABRE.indexOf(simbolo) > -1) {
                stack.push(simbolo);
            } else if (FECHA.indexOf(simbolo) > -1) {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    top = stack.pop();
                    if (ABRE.indexOf(top) != FECHA.indexOf(simbolo)) {
                        return false;
                    }
                }
            }
            i++;
        }
        return true;
    }
}
