package test.java.ejemplo;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.ejemplo.Calculadora;

public class TestAll {
	
	
	@Test
	public void testSuma(){
		Calculadora calculadora = new Calculadora();		
	    assertEquals(calculadora.suma(1,1),2);
	}
}
