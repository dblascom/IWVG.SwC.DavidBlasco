package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

    private Fraction f;

    @Before
    public void before(){
        f = new Fraction(2,3);
    }
    
    @Test
    public void testFractionIntInt() {
        assertNull("should be null", null);
    }

    @Test
    public void testFraction() {
        f = new Fraction();
        assertEquals(1, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals((double)2/3, f.decimal(), 0.001);
    }
    
	@Test
	public void testIsEquivalente() {
		equals(f.isEquivalente(6, 9));
	}

    @Test 
    public void testSuma(){
    	Fraction resultado = f.suma(new Fraction(3,5));
		assertEquals((double)19/15, resultado.decimal(), 0.001);
    }
}
