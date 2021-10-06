import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCalculatorTest {

    private WordCalculator wc = new WordCalculator();

    @Test
    public void reemplaceWordTest(){
        String result = wc.reemplaceWord("Casa");
        assertEquals("casa",result);
    }

    @Test
    public void esPalindromoTest(){
        boolean result = wc.esPalindromo("neuquen");
        assertEquals(true, result);
    }

    @Test
    public void contarVocalesTest(){
        int resutl = wc.contarVocales("murcielago");
        assertEquals(5, resutl);
    }

    @Test
    public void comienzaConTestTrue(){
        boolean result = wc.comienzaCon("pipo","p");
        assertEquals(false,result);
    }

    @Test
    public void comienzaConTestFalse(){
        boolean result = wc.comienzaCon("pipo","o");
        assertEquals(true,result);
    }
}
