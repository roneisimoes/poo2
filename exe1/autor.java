
package exe1;

/**
 *
 * @author ronei.calistro
 */
public class autor {
        private String nome;
        private livro[] livros;

    public autor(String nome) {
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
