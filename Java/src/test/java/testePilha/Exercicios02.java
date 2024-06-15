package testePilha;

import java.util.Scanner;

import aulas.Pilha.Pilha;

public class Exercicios02 {

    public static void main(String[] args) {
//---------Exercicio 2-------------------
        //Escreva um porgrama que leia 10 numeros
        Pilha<Integer> pilhaPar = new Pilha<Integer>();
        Pilha<Integer> pilhaImpar = new Pilha<Integer>();

        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n");

        for (int i = 0; i < 10; i++) {
            System.out.println("\nEntre com o " + (i + 1) + "º numero: ");
            int num = scan.nextInt();
            //se o num digitado for 0 desempilhe um de cada
            //se alguma pilha estiver vaiza, mostre uma mensagem
            if ((num == 0)) {
                if ((pilhaImpar.isVoid()) || (pilhaPar.isVoid())) {
                    System.out.println("Pilha vazia, não é possivel desempilhar!");
                }else {
                    pilhaPar.desempilhar();
                    pilhaImpar.desempilhar();
                }

            }//se o num digitado for par, empilhe
            else if (num % 2 == 0) {
                pilhaPar.empilhar(num);
            } //se o num digitado for impar empilhe
            else {
                pilhaImpar.empilhar(num);
            }//se a pilha estiver vazia mostre uma mensagem

        }

        //no final de nao tiver vazia, coloque os valores na tela, desempilhando-os
        System.out.println("\nImprimindo valores da pilha Par: ");
        while (!pilhaPar.isVoid()) {
            for (int i = 0; i <= pilhaPar.tamanho(); i++) {
                System.out.println(pilhaPar.lastElement());
                pilhaPar.desempilhar();
            }
        }
        System.out.println("\nPilha par vazia!");

        System.out.println("\nImprimindo valores da pilha Impar: ");
        while (!pilhaImpar.isVoid()) {
            for (int i = 0; i <= pilhaImpar.tamanho(); i++) {
                System.out.println(pilhaImpar.lastElement());
                pilhaImpar.desempilhar();
            }
        }
        System.out.println("\nPilha Impar vazia!");
    }
}
