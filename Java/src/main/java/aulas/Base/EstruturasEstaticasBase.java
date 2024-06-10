package aulas.Base;

/*  desenho de entendimento de uma pilha -> é como um vetor porem na vertical
 *
 * [5]   []  -->topo da pilha
 * [4]   []
 * [3]   []
 * [2]   [valor3]
 * [1]   [valor2]
 * [0]   [valor1] --> base da pilha
 * 
 * Quando precisamos empilhar (coloca em cima da pilha, ou seja no topo da pilha) --> push
 * 
 * Quando precisamos desempilhar --> pop. (pega o 1 valor do topo da pilha (ou o ultimo valor da pilha, mesma coisa) )
 * 
 * Comportamento dapilha --> LIFO
 * Last In, First Out  -> ultimo a entrar (empilhar), primeiro a sair (desempilhar)
 */

public class EstruturasEstaticasBase<T> {

    private T[] elementos;
    private int tamanho;

    public EstruturasEstaticasBase(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturasEstaticasBase() {
        this(10);
    }

    protected boolean adiciona(T elemento) {
        aumentaCapacidade();
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    protected boolean adiciona(int posicao, T elemento) {
        aumentaCapacidade();

        if (!(posicao >= 0 && posicao <= tamanho)) {
            throw new IllegalArgumentException("Posição invalida!");
        }
        for (int i = tamanho; i >= posicao; i--) {
            elementos[i + 1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;
        return true;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];

            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public int tamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i = 0; i < tamanho - 1; i++) {
            s.append(elementos[i]);
            s.append(", ");
        }
        if (tamanho > 0) {
            s.append(elementos[tamanho - 1]);
        }

        s.append("]");
        return s.toString();
    }
}
