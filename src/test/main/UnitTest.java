
import org.junit.Test;
import static org.junit.Assert.*;

public class UnitTest {

    @Test
    public void testSuma() throws Exception {
        Main.setCalculo("1 + 3 + 158 - 4 - 100 + 9");
        Main.operar();
        String esperado = "1 + 3 + 158 - 4 - 100 + 9 = 67";
        String obtenido = Main.getResultado();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testMultiplicacion() throws Exception {
        Main.setCalculo("8 * 3");
        Main.operar();
        String esperado = "8 * 3 = 24";
        String obtenido = Main.getResultado();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testDivision() throws Exception {
        Main.setCalculo("18 / 2");
        Main.operar();
        String esperado = "18 / 2 = 9";
        String obtenido = Main.getResultado();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testPorcentaje() throws Exception {
        Main.setCalculo("10 % 200");
        Main.operar();
        String esperado = "10 % 200 = 20";
        String obtenido = Main.getResultado();
        assertEquals(esperado, obtenido);
    }

}
