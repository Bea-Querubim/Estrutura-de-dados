package aulas;

import java.lang.reflect.Array;

// copia de VetorObject, para modificar e deixar a classe mais genérica (apenas um tipo de dado -> object do com elementos apenas string, apenas int, etc) 
public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    //Famoso jeitinho para passar o instanciar um vetor passando dinamicamente o tipo - via 'refletion' - acessa métodos e atributos sendo possivel manipular eles
    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public boolean adiciona(T elemento) {
        aumentaCapacidade();
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, T elemento) {
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

    public Object busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição invalida!");
        }
        return elementos[posicao];
    }

    public boolean buscaBool(T elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public int busca(T elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao <= tamanho)) {
            throw new IllegalArgumentException("Posição invalida!");
        }
        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
    }

    public void remove(VetorObject v, T elemento) {
        int pos = v.busca(elemento);
        if (pos >= 0) {
            v.remove(pos);
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

    /**
     * ************** EXERCICIOS ***************
     */
    //1- Melhore a classe Lista e implemente o metodo contem  ( semelhante ao contains da classe ArrayList)
    /* 
        para fins de manuteção, para nao mexer em 2 codigos posteriormente faremos o metodo contem usando o metodo busca do arquivo Lista.java (o metodo contem é o mesmo codigo do metodo buscaBool e busca)
     */
    public boolean contem(T element) {
        return busca(element) > -1;
        /* ##CORREÇÃO## 
         outra maneira do mesmo codigo

         * int posicao = busca(element);
         * if(posicao > -1) return true;
         * else return false;
         */
    }

    //2-Melhore a classe Lista e implemente o metodo ultimoIndice semelhante ao metodo lastIndexOf da clase ArrayList
    
    // metodo feito levado em consideração a forma do exercicio anterior
    public int ultimoIndice(T element) {
        for(int i = this.tamanho; i >0; i--){
            if(this.elementos[i]==element) return  i;
        }
        return 0;
    }

    /*##CORREÇÃO##
    Outras formas do codigo
    
    public int ultimoIndice(T element) {
        
        int ultimaPos = -1;
        for(int i = 0; i < this.tamanho; i++){
            if(this.elementos[i].equals(elemento)) ultimaPos = i;
        }
        return ultimaPos;
    }
      ou

          public int ultimoIndice(T element) {
        for(int i = this.tamanho-1; i>=0; i--){
            if(this.elementos[i].equals(elemento)) return i;
        }
        return -1;
    }
     */
}
