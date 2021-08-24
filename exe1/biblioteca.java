package exe1;



/**
 *
 * @author ronei
 */
public class biblioteca {
        private String nome;
        private livro[] livros;

    public biblioteca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public livro[] getLivros() {
        return livros;
    }

    public void setLivros(livro[] livros) {
        this.livros = livros;
    }
        
        
}
