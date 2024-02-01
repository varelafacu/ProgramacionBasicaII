package ar.edu.unlam.pb2.fondeaderoUnlam;

public class YateMotor extends Yate{
	
	private Integer desplazamiento;
	private String propulsion;
	private String potencia;
	private Integer velocidad;
	private Integer autonomia;
	private final static Double precioPorTipoMotor = 10000.0;
	
	public YateMotor(String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion, Integer peso, Integer desplazamiento, String propulsion, String potencia, Integer velocidad, Integer autonomia) {
		super(nombre, duenio, manga, calado, eslora, tripulacion, peso);
		this.desplazamiento = desplazamiento;
		this.propulsion = propulsion;
		this.potencia = potencia;
		this.velocidad = velocidad;
		this.autonomia = autonomia;
	}
	
	@Override
	public Double obtenerPrecioDeAmarre() {
		Double precioEslora = 3000.0;
		if (super.eslora <= 20.0) {
			precioEslora = 2000.0;
		}
		return precioEslora + precioPorTipoMotor;
	}

}
