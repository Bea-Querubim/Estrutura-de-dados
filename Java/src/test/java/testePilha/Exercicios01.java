package testePilha;

import java.util.Scanner;

import aulas.Pilha.Pilha;

public class Exercicios01 {

    public static void main(String[] args) {
//---------Exercicio 1-------------------
        //Escreva um porgrama que leia 10 numeros
        Pilha<Integer> pilhaTeste = new Pilha<Integer>();
        //pilhaTeste.pilha(10);

        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n");
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEntre com o " + (i + 1) + "º numero: ");
            int num = scan.nextInt();
            //se o num digitado for par, empilhe
            if (num % 2 == 0) {
                pilhaTeste.empilhar(num);
            } //se o num digitado for impar desempilhe
            else if ((num % 2 != 0) && (!pilhaTeste.isVoid())) {
                pilhaTeste.desempilhar();
            }//se a pilha estiver vazia mostre uma mensagem
            else {
                System.out.println("Pilha vazio, não é possivel desempilhar!");
            }
        }

        //no final de nao tiver vazia, coloque os valores na tela, desempilhando-os
        System.out.println("\nImprimindo valores da pilha: ");
        while (!pilhaTeste.isVoid()) {//da pra fazer com if tambem
            for (int i = 0; i <= pilhaTeste.tamanho(); i++) {
                System.out.println(pilhaTeste.lastElement());
                pilhaTeste.desempilhar();
            }
        }
    }
}
