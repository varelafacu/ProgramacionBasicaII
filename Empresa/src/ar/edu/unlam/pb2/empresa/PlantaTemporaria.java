package ar.edu.unlam.pb2.empresa;

public class PlantaTemporaria extends Empleado {
	private static final Double VALOR_HORA = 2_000.0;

	public PlantaTemporaria(Integer horasTrabajadas, Integer cantidadHijos, Boolean estaCasado) {
		super(horasTrabajadas, cantidadHijos, estaCasado);
	}
	
	@Override
	public Double getSueldo() {
		return super.getHorasTrabajadas() * PlantaTemporaria.VALOR_HORA + super.getSalarioFamiliar();
	}
}
