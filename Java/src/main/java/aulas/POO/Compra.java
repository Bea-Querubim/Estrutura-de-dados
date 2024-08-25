package aulas.POO;

public class Compra {
    int valorTotal;
    int numeroParcelas;

    //a vista
    public Compra(int valor){
        valorTotal = valor;
        numeroParcelas =1;
    }

    //parcelado
    public Compra(int qtdeParcela, int valorParcela){
        numeroParcelas = qtdeParcela;
        valorTotal = valorParcela * qtdeParcela;
    }

    public int getValorTotal(){
        return valorTotal;
    }

    public int getValorParcela(){
        return valorTotal/numeroParcelas;
    }

    public int getNumeroParcelas(){
        return numeroParcelas;
    }
}
