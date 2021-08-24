
package exe1;

/**
 *
 * @author ronei
 */
public class EXE1 {

    
    public static void main(String[] args) {
        biblioteca b = new biblioteca("IFSC");        
        autor a = new autor("Javamen");
        livro l = new livro("12345","Rei do java",a,b);
        capitulo c = new capitulo(10,l);
        
        System.out.println("A biblioteca " + b.getNome() + " possui o livro " + l.getNome() 
                + " que contem " + c.getNumero() + " capitulos e pertence ao autor " + a.getNome());
         
    }
    
}
