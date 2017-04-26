/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitcalculadora;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 239651
 */
public class CalculadoraTest extends TestCase{
    
    private Calculadora calc = new Calculadora();
    
    @Test
    public void testSoma() {
        assertEquals(30, calc.soma(10, 20), 0);
    }

    @Test
    public void testSubtrair() {
        assertEquals(10, calc.subtrair(20, 10), 0);
    }

    @Test
    public void testMultiplicar() {
        assertEquals(20, calc.multiplicar(10, 2), 0);
    }

    @Test
    public void testDivisao() {
        assertEquals(2, calc.divisao(10, 5), 0);
    }
    
}
