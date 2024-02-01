package ar.edu.unlam.pb2.empresa;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpresaTest {

	@Test
	public void queSePuedaGenerarUnaEmpresaConEmpleados() {
		Integer cuit = 123456789;
		String razonSocial = "La Perseverancia";
		
		//datos de empleado 1
		Integer horasTrabajadas = 80;
		Integer cantidadHijos = 2;
		Boolean estaCasado = true;
		Integer antiguedad = 6;
		//datos de empleado 2
		Integer horasTrabajadas1 = 160;
		Integer cantidadHijos1 = 0;
		Boolean estaCasado1 = false;
		Integer antiguedad1 = 4;
		//datos de empleado 3
		Integer horasTrabajadas2 = 160;
		Integer cantidadHijos2 = 1;
		Boolean estaCasado2 = true;
		Integer antiguedad2 = 10;
		//datos de empleado 4
		Integer horasTrabajadas3 = 80;
		Integer cantidadHijos3 = 0;
		Boolean estaCasado3 = true;
		
		PlantaPermanente empleado1 = new PlantaPermanente(horasTrabajadas, cantidadHijos, estaCasado, antiguedad);
		PlantaPermanente empleado2 = new PlantaPermanente(horasTrabajadas1, cantidadHijos1, estaCasado1, antiguedad1);
		
		Gerente empleado3 = new Gerente(horasTrabajadas2, cantidadHijos2, estaCasado2, antiguedad2);
		
		PlantaTemporaria empleado4 = new PlantaTemporaria(horasTrabajadas3, cantidadHijos3, estaCasado3);
		
		Empresa empresa1 = new Empresa(cuit, razonSocial);
		
		//carga de empleados
		empresa1.setEmpleado(empleado1);
		empresa1.setEmpleado(empleado2);
		empresa1.setEmpleado(empleado3);
		empresa1.setEmpleado(empleado4);
		Double esperado = 1_554_000.0;
		
		Double obtenido = empresa1.getSalario();
		
		
		assertEquals(esperado, obtenido);
	}

}
