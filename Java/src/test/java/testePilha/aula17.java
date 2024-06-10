package testePilha;

import aulas.Pilha.Pilha;

public class aula17 {

    public static void main(String[] args) {
        Pilha<Integer> stack = new Pilha<Integer>();

        stack.empilhar(2);
        stack.empilhar(3);
        stack.empilhar(4);
        stack.empilhar(10);
        
        System.out.println(stack);
        System.out.println("Desempilhando... elemento" + stack.desempilhar());
        System.out.println(stack);
    }
}
