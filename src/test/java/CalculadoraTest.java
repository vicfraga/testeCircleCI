import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    public void teste (){

        Calculadora calc = new Calculadora ();
        int resultado = calc.soma(6,4);

        assertEquals(10, resultado);

         }

}