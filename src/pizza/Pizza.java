package pizza;

import java.util.HashMap;
import java.util.Map;


public class Pizza {
    //armazena a quantidade de ingredientes
    public int ingredientes;
    
    //armazena o total de ingredientes
    private static int total_ingredientes;
    
    //hashmap para controlar a quantidade de ingredientes
    static Map<String, Integer> tabelaIngredientes = new HashMap();
    
    public Pizza(){
        this.total_ingredientes++;
    }
    
    public void adicionarIngrediente(String nome){
        if(tabelaIngredientes.containsKey(nome)){
            int qnt = (tabelaIngredientes.get(nome) + 1);
        } else {
            tabelaIngredientes.put(nome, 1);
        }
        this.total_ingredientes++;
        contabilizaIngredientes();
    }

    private void contabilizaIngredientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
