import carro.Carro;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarroTeste {
    
    @Test
    public void testeAcelerar(){
        Carro c1 = new Carro(7,0);
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        assertEquals(28, c1.obterVelocidade());
    }
    
    @Test
    public void testeFrear(){
        Carro c1 = new Carro(7,0);
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.frear();
        assertEquals(0, c1.obterVelocidade());
    }
}
