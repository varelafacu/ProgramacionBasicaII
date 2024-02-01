package ar.edu.unlam.pb2.empresa;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlantaPermanenteTest {
/*
 * Un empleado de Planta Permanente (que no sea gerente) con 80 horas 
 * trabajadas, con esposa, 2 hijos y 6 años de antigüedad. (251.000) 
 * 
 */
	@Test
	public void queSePuedaCrearUnEmpleadoDePlantaPermanente() {
		Integer horasTrabajadas = 80;
		Integer cantidadHijos = 2;
		Boolean estaCasado = true;
		Integer antiguedad = 6;
		Double esperado = 251_000.0;
		
		PlantaPermanente natan = new PlantaPermanente(horasTrabajadas, cantidadHijos, estaCasado, antiguedad);
		Double obtenido = natan.getSueldo();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void queSePuedaCalcularElSueldoDeUnEmpleadoDePlantaPermanenteNoGerente() {
		Integer horasTrabajadas = 160;
		Integer cantidadHijos = 0;
		Boolean estaCasado = false;
		Integer antiguedad = 4;
		Double esperado = 484_000.0;
		
		PlantaPermanente natan = new PlantaPermanente(horasTrabajadas, cantidadHijos, estaCasado, antiguedad);
		Double obtenido = natan.getSueldo();
		assertEquals(esperado, obtenido);
	}

}
