
package main;

/**
 *
 * @author ronei
 */
public class carta {
    private int numero;
    private String naipe;

    public carta(int numero, String naipe) throws Exception {
        this.setNumero(numero);
        this.setNaipe(naipe);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero)throws Exception {
        if(numero>0 && numero<=13){
            this.numero = numero;
        }else{
            throw new Exception("Carta inválida!!");
        }
        
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe)throws Exception {
        if(naipe=="copas" || naipe=="espadas"  || naipe=="ouros" || naipe=="paus"){
            this.naipe = naipe;
        }else{
            throw new Exception("Carta inválida!!");    
        }
        
    }  
    
    @Override
    public String toString(){
        return numero + " de " + naipe;
    }
}
