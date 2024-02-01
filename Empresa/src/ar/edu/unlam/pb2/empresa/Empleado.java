package ar.edu.unlam.pb2.empresa;

public abstract class Empleado {
	
	private static final Double VALOR_CONYUGE = 1_000.0;
	private static final Double VALOR_HIJO = 2_000.0;
	private static final Double VALOR_HORA = 2_000.0;
	private Integer horasTrabajadas;
	private Integer cantidadHijos;
	private Boolean estaCasado;

	public Empleado(Integer horasTrabajadas, Integer cantidadHijos, Boolean estaCasado) {
		/*
		 * tiene un "super();" implicitamente
		 */
		this.horasTrabajadas = horasTrabajadas;
		this.cantidadHijos = cantidadHijos;
		this.estaCasado = estaCasado;
	}

	public abstract Double getSueldo();

	protected Double getSalarioFamiliar() {
		Double salarioFamiliar = this.cantidadHijos * VALOR_HIJO;

		if (this.estaCasado) {
			salarioFamiliar += VALOR_CONYUGE;
		}
		return salarioFamiliar;
	}
	
	protected Integer getHorasTrabajadas() {
		return this.horasTrabajadas;
	}
}
