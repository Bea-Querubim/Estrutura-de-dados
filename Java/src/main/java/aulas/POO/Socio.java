package aulas.POO;

/*
| Socio |
|-------|
| **Atributos** |
| +Nome: String |
| +RG: String |
| +CPF: String |
| +Endereco: String |
| +Telefone: String |
|-------|
| **Métodos** |
| +Cadastrar() |
| +ConfirmarCadastro() |
| +Alterar() |
| +Remover() |
 */
//criando a primeira classe - socio
public class Socio {

    String Nome;
    int Rg;
    int Cpf;
    String Endereco;
    String Tipo;
    int Telefone;

    //criando construtores
    public Socio(String nome, int rg, int cpf, String end, int tel, String tipo) {

        this.Nome = nome;  //posso usar o this para dizer que a variavel da classe esta recebendo o valor
        Rg = rg; //ou posso nao usar o this
        this.Cpf = cpf;
        Endereco = end;
        this.Telefone = tel;
        Tipo = tipo;
    }

    public Socio(String tipo) {
// posso fazer diferentes contrutores, apenas mudando os parametros
        this.Nome = "";
        Rg = 0;
        this.Cpf = 0;
        Endereco = "";
        this.Telefone = 0; // posso setar um valor
        Tipo = tipo;
    }

    public Socio() {
    }

    @Override
    public String toString() {
        return "Socio [Nome=" + Nome + ", Rg=" + Rg + ", Cpf=" + Cpf + ", Endereco=" + Endereco + ", Tipo=" + Tipo
                + ", Telefone=" + Telefone + "]";
    }

    

    
}
