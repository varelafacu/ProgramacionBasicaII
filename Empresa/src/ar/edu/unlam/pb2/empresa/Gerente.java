package ar.edu.unlam.pb2.empresa;

public class Gerente extends PlantaPermanente {

	private static final Double VALOR_ANTIGUEDAD = 1_500.0;
	private static final Double VALOR_HORA = 4_000.0;

	public Gerente(Integer horasTrabajadas, Integer cantidadHijos, Boolean estaCasado, Integer antiguedad) {
		super(horasTrabajadas, cantidadHijos, estaCasado, antiguedad);
	}
	
	@Override
	public Double getSueldo() {
		return super.getHorasTrabajadas() * Gerente.VALOR_HORA + super.getAntiguedad() * Gerente.VALOR_ANTIGUEDAD
				+ super.getSalarioFamiliar();
	}

}
