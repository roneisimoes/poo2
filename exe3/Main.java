
package main;

/**
 *
 * @author ronei
 */
public class Main {

    
    public static void main(String[] args) throws Exception {
        //carta carta = new carta(3,"espadas");
        
        //System.out.println(carta.getNumero());
        //System.out.println(carta.getNaipe());
        
        baralho baralho = new baralho();
        baralho.embaralhar();
        System.out.println(baralho);
    }
    
}
