package conversor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class temperaturatest {
	
	//test para la tercera comprobación en Junit:
	//"4 celsius equivalen a 39 Farenh y 277 Kelvin."
	//cambiando las cifras se pueden buscar los demás resultados.
	
	@Test
public void testFarenh() {
	double resultadoF= temperaturasresueltas.celaFa(4);
	assertEquals(39.2, resultadoF, 0.0001);
	}
	
	@Test
	public void testKelvin () {
		double resultadoK= temperaturasresueltas.celaKe(4);
		assertEquals(277.15, resultadoK, 0.0001);

}
}


