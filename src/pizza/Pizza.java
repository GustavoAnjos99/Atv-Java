package pizza;

import java.util.HashMap;
import java.util.Map;


public class Pizza {
    //armazena a quantidade de ingredientes
    public int total_ingredientes;
    
    //armazena o total de ingredientes
    private static int total_pizza;
    
    //hashmap para controlar a quantidade de ingredientes
    static Map<String, Integer> tabelaIngredientes = new HashMap();
    
    public Pizza(){
        this.total_ingredientes++;
        this.total_pizza++;
    }
    
    public void adicionarIngrediente(String nome){
        if(tabelaIngredientes.containsKey(nome)){
            int qnt = (tabelaIngredientes.get(nome) + 1);
            tabelaIngredientes.replace(nome, qnt);
        } else {
            tabelaIngredientes.put(nome, 1);
        }
        this.total_ingredientes++;
        contabilizaIngredientes();
    }

    public int getTotalIngredientes(){
        return total_ingredientes;
    }
    public void contabilizaIngredientes() {
        this.total_ingredientes++;
    }
    public double getPreco(){
        if (this.total_ingredientes <=2) return (45.0);
        if (this.total_ingredientes <=5) return (60.0);
        return (90.0);
    }
    public int getTotalPizzas() {
        return this.total_pizza;
    }
    
}
