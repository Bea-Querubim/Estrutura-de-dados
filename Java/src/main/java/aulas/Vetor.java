package aulas;

public class Vetor {

    //iniciando vetor
    private String[] elementos;

    //controla o tamanho do vetor
    private int tamanho;

    //cria o vetor com a capacidade/tamanho passada via metodo
    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    // adiciona valores quando a posição do array nao for null
    /*metodo basico
    public void adiciona(String elemento){
        for (int i=0; i<this.elementos.length; i++){
            if(this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }*/
    //metodo melhorado *Opção1* (mensagem de exceção)-- throws exception no construtor quando usar exception 
    public void adiciona(String elemento) throws Exception {
        
        // colocamos um metodo para dobrar a capacidade do vetor caso ele esteja no limite
        aumentaCapacidade();

        //validação para verificar o tamanho do array, caso nao haja espaço exibe uma excecao
        if (this.tamanho < this.elementos.length) {
            //fazemos o input no array
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor cheio, não foi possivel adicionar o valor");
        }
    }

    //metodo melhorado  *Opção2* (mensagem de true/false)
    public boolean adicionaBool(String elemento) {
        
        // colocamos um metodo para dobrar a capacidade do vetor caso ele esteja no limite
        aumentaCapacidade();

        //validação para verificar o tamanho do array
        if (this.tamanho < this.elementos.length) {
            //fazemos o input no array
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    // sobrecarga do metodo adicionaBool, passando a posição e o valor que queremos adicionar ao vetor,
    public boolean adicionaBool(int posicao, String elemento) {
        // colocamos um metodo para dobrar a capacidade do vetor caso ele esteja no limite
        aumentaCapacidade();

        if (!(posicao >= 0 && posicao <= tamanho)) {
            throw new IllegalArgumentException("Posição invalida!");
        }
        /*  //Opção feita para caso o vetor nao tenha a tratativa de aumentarCapacidade();  o qual dobra o tamanho do vetor quando esta no limite

        if (tamanho + 1 >= this.elementos.length) {
            throw new IllegalArgumentException("vetor cheio");
        }
        */

        for (int i = this.tamanho; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    private void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length){
            String[] elementosNovos = new String[this.elementos.length * 2];

            for (int i=0; i<this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }

            this.elementos = elementosNovos;
        }
    }

    //metodo de busca
    public String busca(int posicao) {
        //se a posicao estiver fora dos limites de tamanho do array, exibe uma exception (uso da exception da classe do java para argumentos)    
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição invalida!");
        }
        // se a posicao estiver dentro do array, exibe o elemento buscado
        return this.elementos[posicao];
    }

    //metodo de busca retornando true ou false, na verificação se o elemento(inteiro) existe
    public boolean verificaElementoBool(String elemento) {
        //corre o vetor comparando se o elemento existe   
        for (int i = 0; i < this.tamanho; i++) {
            // verifica de o valor do elemtento[i] é igual ao elemento que estamos passando  -> nesse caso nao podemos usar == pois String é um objeto, devemos usar o metodo Equals
            if (this.elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    //metodo de busca(como o de cima) retornando a posicao inves de true ou false
    public int verificaElementoInt(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i; //apresenta a posicao do elemento
            }
        }
        return -1; // apresenta a posicao -1,se o elemento nao existe
    }

     // metodo para remover um elemento atraves da posicao
     public void remove(int posicao) {

        if (!(posicao >= 0 && posicao <= tamanho)) {
            throw new IllegalArgumentException("Posição invalida!");
        }
        for (int i = posicao; i < this.tamanho-1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }

    // sobrecarga do metodo de remover, passando vetor + a string que sera removida.
    //para isso é necessario fazer uma busca no vetor para encontrar o elemento, pegar a posição do mesmo para fazer a remoção
    public void remove(Vetor v, String elemento){
        int pos = v.verificaElementoInt(elemento);
        if(pos >= 0){
            v.remove(pos);
        }
    }

    //retorna o tamanho preenchido do vetor
    public int tamanho() {
        return this.tamanho;
    }

    //classe do java para criar superstring
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        //verifica o final da string para evitar um exception
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");
        return s.toString();
    }

}
