package ar.edu.unlam.pb2.empresa;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlantaTemporariaTest {

	@Test
	public void queSePuedaCrearUnEmpleadoDePlantaTemporaria() {
		Integer horasTrabajadas = 80;
		Integer cantidadHijos = 0;
		Boolean estaCasado = true;
		Double esperado = 161_000.0;
		
		PlantaTemporaria natan = new PlantaTemporaria(horasTrabajadas, cantidadHijos, estaCasado);
		Double obtenido = natan.getSueldo();
		assertEquals(esperado, obtenido);
	}

}
