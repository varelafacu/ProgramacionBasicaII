package ar.edu.unlam.pb2.empresa;

import static org.junit.Assert.*;

import org.junit.Test;

public class GerenteTest {

	/*
	 *  Un Gerente con 160 horas trabajadas, con esposa, un hijo y 10 	 	 *	años de antigüedad. (658.000)
	 */
	
	@Test
	public void queSePuedaCalcularElSueldoDeUnGerente() {

		Integer horasTrabajadas = 160;
		Integer cantidadHijos = 1;
		Boolean estaCasado = true;
		Integer antiguedad = 10;
		Double esperado = 658_000.0;

		Gerente natan = new Gerente(horasTrabajadas, cantidadHijos, estaCasado, antiguedad);
		Double obtenido = natan.getSueldo();
		assertEquals(esperado, obtenido);

	}

}
