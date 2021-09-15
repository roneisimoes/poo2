
package main;

import java.util.Random;

/**
 *
 *  @author ronei
 */
public class baralho {
   private carta[] cartas;

    public baralho() throws Exception {
        cartas = new carta[52];
        
        String[] naipes = {"copas","espadas","ouros","paus"};
        
        for(int i = 0; i<52; i++){
            cartas[i] = new carta((i%13)+1, naipes[i/13]);
            
            //System.out.println("[" + i + "]" + cartas[i]);
        }
    }
   
    public void embaralhar(){
        Random embaralhando = new Random();
        int indice1 = 0;
        int indice2 = 0;
        for(int i = 0; i<100; i++){
            indice1 = embaralhando.nextInt(52);
            indice2 = embaralhando.nextInt(52);
            carta tmp = cartas[indice1];
            cartas[indice1] = cartas[indice2];
            cartas[indice2] = tmp;
        }
    }
    
    @Override
    public String toString(){
        String str = "Cartas do baralho\n";
        for(int i=0; i< 52; i++){
            str = str.concat("[" + (i+1) + "]" + cartas[i] + "\n");
        }
       return str;
    }
}
