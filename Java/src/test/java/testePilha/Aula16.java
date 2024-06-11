package testePilha;

import aulas.Pilha.Pilha;

public class Aula16 {

    public static void main(String[] args) {
        Pilha<Integer> stack = new Pilha<Integer>();
        
        System.out.println(stack.lastElement());
        System.out.println(stack);

        stack.empilhar(2);
        stack.empilhar(10);

        System.out.println(stack.lastElement());
        System.out.println(stack);
    }
}
