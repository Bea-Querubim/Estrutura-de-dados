package testePilha;

import java.util.Stack;

public class Exercicios08 {

    public static void main(String[] args) {
        Stack<Integer> pilhaInicio = new Stack<>();
        Stack<Integer> pilhaAux = new Stack<>();
        Stack<Integer> pilhaDestino = new Stack<>();

        pilhaInicio.push(3);
        pilhaInicio.push(2);
        pilhaInicio.push(1);
        System.out.println("Inicio: " + pilhaInicio);
        System.out.println("Destino: " + pilhaDestino);
        System.out.println("Aux: " + pilhaAux);
        
        torreDeHanoi(pilhaInicio.size(), pilhaInicio, pilhaDestino, pilhaAux);

    }

    public static void torreDeHanoi(int n, Stack<Integer> inicio, Stack<Integer> dest, Stack<Integer> aux) {


        if (n > 0) {
            torreDeHanoi(n - 1, inicio, aux, dest);
            dest.push(inicio.pop());

            System.out.println("-------------");
            System.out.println("Inicio: " + inicio);
            System.out.println("Destino: " + dest);
            System.out.println("Aux: " + aux);

            torreDeHanoi(n - 1, aux, dest, inicio);

        }
    }
}
