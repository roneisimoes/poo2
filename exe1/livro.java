package exe1;

/**
 *
 * @author ronei.calistro
 */
public class livro {
        private String isbn;
        private String nome;
        private autor autor;
        private biblioteca biblioteca;
        private capitulo[] capitulos;

    public livro(String isbn, String nome, autor autor, biblioteca biblioteca) {
        this.isbn = isbn;
        this.nome = nome;
        this.autor = autor;
        this.biblioteca = biblioteca;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public autor getAutor() {
        return autor;
    }

    public void setAutor(autor autor) {
        this.autor = autor;
    }

    public biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public capitulo[] getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(capitulo[] capitulos) {
        this.capitulos = capitulos;
    }
        
        
        
}
