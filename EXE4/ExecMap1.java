
package execmap1;

import java.util.*;

/**
 *
 * @author ronei
 */
public class ExecMap1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> hm = new HashMap<>();
       
        String nome = "";
        String telefone= "";
        
        while (!nome.equals("*") && !telefone.equals("*")){
                System.out.println("Digite um nome ('*' finaliza): ");
                nome = sc.nextLine();
                if(nome.equals("*")) continue;
                System.out.println("Digite um telefone ('*' finaliza): ");
                telefone = sc.nextLine();
                if(telefone.equals("*")) continue;
                hm.put(nome, telefone);
                System.out.println(hm);
        }
        do {
            System.out.println("Digite um nome para pesquisar ('*' finaliza): ");
            nome = sc.nextLine().toUpperCase();
            for (String key : hm.keySet()) {
		if (key.toUpperCase().equals(nome)) {
                    System.out.println(key + ": " + hm.get(key));
		} else if (key.toUpperCase().contains(nome)){
                    System.out.println(key + ": " + hm.get(key));
		}
            }
                    
        } while (!nome.equals("*"));
        sc.close(); 
    }
}