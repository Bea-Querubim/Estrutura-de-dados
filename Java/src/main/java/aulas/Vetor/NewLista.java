package aulas.Vetor;
import aulas.Base.EstruturasEstaticasBase;

public class NewLista extends EstruturasEstaticasBase<T>{
    public NewLista(){
        super();
    }

    public NewLista(int capacidade) {
        super(capacidade);
    }

    public boolean adiciona(T elemento){
        return super.adiciona(elemento);
    }

    public boolean adiciona(int posicao, T elemento){
        return super.adiciona(posicao, elemento);
    }


}
