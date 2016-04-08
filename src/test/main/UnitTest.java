
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UnitTest {
    
    public UnitTest() {
    }

    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSuma() throws Exception {
        Main.setCalculo("1 + 3 + 158 - 4 - 100 + 9");
        Main.operar();
        String esperado = "1 + 3 + 158 - 4 - 100 + 9 = 67";
        String obtenido = Main.getResultado();
        assertEquals(esperado, obtenido);
    }
    
}
