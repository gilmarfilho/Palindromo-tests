import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Gilmar-Filho on 27/09/2017.
 */
public class TestPalindromo {
    Palindromo palindromo = new Palindromo();

    @Test
    public void testPalindromo1(){
        Assert.assertTrue(palindromo.ehPalindromo("Socorram-me subi no onibus em Marrocos"));
    }

    @Test
    public void testPalindromo2(){
        Assert.assertTrue(palindromo.ehPalindromo("Anotaram a data da maratona"));
    }

    @Test
    public void testPalindromo3(){
        Assert.assertTrue(palindromo.ehPalindromo("A grama é amarga"));
    }

    @Test
    public void testPalindromo4(){
        Assert.assertTrue(palindromo.ehPalindromo("O teu dueto"));
    }

    @Test
    public void testPalindromo5(){
        Assert.assertTrue(palindromo.ehPalindromo("A mala nada na lama"));
    }

    @Test
    public void testNotPalindromo1(){
        Assert.assertFalse(palindromo.ehPalindromo("O boi come capim"));
    }

    @Test
    public void testNotPalindromo2(){
        Assert.assertFalse(palindromo.ehPalindromo("A vaca também"));
    }

    @Test
    public void testNotPalindromo3(){
        Assert.assertFalse(palindromo.ehPalindromo("Já fiz o trabalho pra amanhã"));
    }

    @Test
    public void testNotPalindromo4(){
        Assert.assertFalse(palindromo.ehPalindromo("A prova é depois do feriado"));
    }

    @Test
    public void testNotPalindromo5(){
        Assert.assertFalse(palindromo.ehPalindromo("Não vou hoje a noite"));
    }
}
