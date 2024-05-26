package aulas;

//os comentarios foram retirados, pois esse arquivo é baseadao no Vetor.java
// apenas alteramos o tipo String para Tipo Object, tambem alteramos o nome da classe Vetor para VetorObject
public class VetorObject {

    private Object[] elementos;

    private int tamanho;

    public VetorObject(int capacidade) {
        elementos = new Object[capacidade];
        tamanho = 0;
    }

    //lembrando que ao usar esse metodo é necessario colocar try catch + chama o metodo
    public void adiciona(Object elemento) throws Exception {
        aumentaCapacidade();

        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
        } else {
            throw new Exception("Vetor cheio, não foi possivel adicionar o valor");
        }
    }

    public boolean adicionaBool(Object elemento) {
        aumentaCapacidade();
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public boolean adicionaBool(int posicao, Object elemento) {
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
        if (tamanho == elementos.length) {
            Object[] elementosNovos = new Object[elementos.length * 2];

            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }

    public Object busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição invalida!");
        }
        return elementos[posicao];
    }

    public boolean buscaBool(Object elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public int busca(Object elemento) {
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

    public void remove(VetorObject v, Object elemento) {
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

}
