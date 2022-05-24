package calculadora;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testGetAdicao() {
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        double retornoEsperado = 6.0;
        double retornoFeito = calculadora.getAdicao();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}