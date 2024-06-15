package testePilha;

import java.util.Scanner;

import aulas.Pilha.Pilha;

public class Exercicios05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a palavra a ser verificada: ");
        String palavra = scan.nextLine();
        resultado(palavra);
    }

    public  static void resultado(String palavra){
        System.out.println(palavra + " é palindromo? ");
        System.out.println(isPalimdromo(palavra));
    }

    public static boolean isPalimdromo(String palavra) {
        Pilha<Character> pilha = new Pilha<Character>();

        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilhar(palavra.charAt(i)); // pega o caractere no index i
        }
        String inverso = "";
        while (!pilha.isVoid()) {
            inverso += pilha.desempilhar();
        }
        if (inverso.equalsIgnoreCase(palavra)) {
            return true;
        }
        return false;
    }
}
