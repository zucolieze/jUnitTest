import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCalculatorTest {

    private WordCalculator wc = new WordCalculator();

    @Test
    public void esPalindromoTest(){
        String word = "neuquen";
        boolean result = wc.esPalindromo(word);
        assertEquals(true, result);
    }
}
