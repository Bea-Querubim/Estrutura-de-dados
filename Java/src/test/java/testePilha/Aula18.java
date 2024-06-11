package testePilha;

import java.util.Stack;

import aulas.Pilha.Pilha;

public class Aula18 {
    public static void main(String[] args) {    
        //classe que criamos
        Pilha<Integer> pilha = new Pilha<Integer>();
        
        //classe nativa API JAVA para a funcao pilha
        Stack<Integer> stack = new Stack<Integer>();

        //como a classe isVoid que montamos
        System.out.println(stack.isEmpty());

        //como a classe Empilhar que montamos
        System.out.println("adicionando elemento: "+stack.push(1));
        System.out.println("adicionando elemento: "+stack.push(2));
        System.out.println("adicionando elemento: "+stack.push(3));
        System.out.println(stack);

        //como a classe tamanho que montamos
        System.out.println("tamanho: "+stack.size());

        //como a classe lastElement que montamos -> Espia o ultimo elemento
        System.out.println("espiando ultimo elemento: "+stack.peek());

        //como a classe desempilhar que montamos
        System.out.println("desempilhando elemento: "+stack.pop());
        System.out.println(stack);
    }
}
