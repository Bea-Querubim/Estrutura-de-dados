package testePilha;

public class Livro {
    private String nome;
    private String isbn;
    private int ano;
    private String autor;

    public Livro(){
        super();
    }

    public Livro(String nome, String isbn, int ano, String autor){
        super();
        this.nome = nome;
        this.isbn = isbn;
        this.ano = ano;
        this.autor = autor;
    }

    public String getNome(){
        return nome;
    }
    public String getIsbn(){
        return isbn;
    }
    public int getAno(){
        return ano;
    }
    public String getAutor(){
        return autor;
    }

    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", isbn=" + isbn + ", ano=" + ano + ", autor=" + autor + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
        result = prime * result + ano;
        result = prime * result + ((autor == null) ? 0 : autor.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (isbn == null) {
            if (other.isbn != null)
                return false;
        } else if (!isbn.equals(other.isbn))
            return false;
        if (ano != other.ano)
            return false;
        if (autor == null) {
            if (other.autor != null)
                return false;
        } else if (!autor.equals(other.autor))
            return false;
        return true;
    }  
    
}
