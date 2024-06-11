package aulas.Pilha;

import aulas.Base.EstruturasEstaticasBase;

public class Pilha<T> extends EstruturasEstaticasBase<T>{
    public Pilha(){
        super();
    }

    public pilha(int capacidade){
        super.(capacidade); 
    }

    public void empilhar(T elemento){
        super.adiciona(elemento);
    }

    // espiar o ultimo elemento
    public T lastElement(){
        if(this.isVoid()){
            return null;
        }
        return this.elementos[tamanho-1];
    }

    public T desempilhar(){
        T elemento = lastElement();
         if(elemento != null) tamanho--;
        return elemento;
    }
}
