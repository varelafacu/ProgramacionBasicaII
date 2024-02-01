package ar.edu.unlam.pb2.empresa;

public class PlantaPermanente extends Empleado {

	private static final Double VALOR_ANTIGUEDAD = 1_000.0;
	private static final Double VALOR_HORA = 3_000.0;

	private Integer antiguedad;

	public PlantaPermanente(Integer horasTrabajadas, Integer cantidadHijos, Boolean estaCasado, Integer antiguedad) {
		super(horasTrabajadas, cantidadHijos, estaCasado);
		this.antiguedad = antiguedad;
	}
	
	@Override
	public Double getSueldo() {
		return super.getHorasTrabajadas() * PlantaPermanente.VALOR_HORA
				+ this.antiguedad * PlantaPermanente.VALOR_ANTIGUEDAD + super.getSalarioFamiliar();
	}

	protected Integer getAntiguedad() {
		return this.antiguedad;
	}

}
