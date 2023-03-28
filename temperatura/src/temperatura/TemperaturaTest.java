package temperatura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class TemperaturaTest {
	
	Temperatura temperatura = new Temperatura (); 


	@Test
	void testCelsiusAFharenheit() {
		
		
		double resultado = temperatura.celsiusAFharenheit(5);	
		assertEquals (41, resultado); //esperado-obtenido
	
	}


	@Test
	void testCelsiusAReamur() {
		
		double resultado = temperatura.celsiusAReamur(5);
		assertEquals (4, resultado); 
		
	}
	
	

}
