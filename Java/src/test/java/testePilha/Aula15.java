package testePilha;

import aulas.Pilha.Pilha;

public class Aula15 {
public static void main(String[] args) {
    Pilha<Integer> stack = new Pilha<Integer>();

    System.out.println(stack.isVoid());

    
    stack.empilhar(1);
    System.out.println(stack.isVoid());
}
}
