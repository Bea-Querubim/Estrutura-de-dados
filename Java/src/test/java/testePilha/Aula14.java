package testePilha;

import aulas.Pilha.Pilha;

public class Aula14 {
 public static void main(String[] args) {
     Pilha<Integer> stack = new Pilha<Integer>();

     for (int i = 0; i < 10; i++) {
        stack.empilhar(i);
     }

     System.out.println(stack);
     System.out.println(stack.tamanho());
 
 // stack overflow  - exception da Pilha --> Sobrecarga de pilha 
 //Acontece quando uma funcao é executada de forma recursiva(Quando dentro de uma funcao é feita uma ou mais chamadas a ela mesma - loop infinito), criando um objeto que vai empilhando valores, ate estourar o recurso da memoria
    }
}
