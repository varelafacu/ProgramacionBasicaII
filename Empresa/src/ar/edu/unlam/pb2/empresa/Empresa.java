package ar.edu.unlam.pb2.empresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa{

	private Integer cuit;
	private String razonSocial;
	protected ArrayList<Empleado> empleados = new ArrayList<Empleado>();;

	public Empresa(Integer cuit, String razonSocial) {
		this.cuit = cuit;
		this.razonSocial = razonSocial;
	}

	public void setEmpleado(Empleado empleado1) {
		this.empleados.add(empleado1);
	}

	public Double getSalario() {
		Double salarioTotal = 0.0;
		for (Empleado empleado : empleados) {
			salarioTotal += empleado.getSueldo();
		}
		
		return salarioTotal;
	}

	
	
}
