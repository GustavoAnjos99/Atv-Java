import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import pizza.Pizza;

public class TestePizza {
    
    @Test
    public void testeTotalPizzas(){
        Pizza p1 = new Pizza();
        Pizza p2 = new Pizza();
        Pizza p3 = new Pizza();
        
        assertEquals(3, p1.getTotalPizzas());
    }
    
    @Test
    public void testePreco(){
        Pizza p1 = new Pizza();
        p1.adicionarIngrediente("oregano");
        p1.adicionarIngrediente("mussarela");
        assertEquals(45.0, p1.getPreco());
    }
}
