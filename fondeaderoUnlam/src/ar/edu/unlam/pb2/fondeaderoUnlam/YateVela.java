package ar.edu.unlam.pb2.fondeaderoUnlam;

public class YateVela extends Yate{
	
	private Double alturaMastil;
	private Integer superficieVelicaMayor;
	private Integer superficieTotal;
	
	public YateVela(String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion, Integer peso, Double alturaMastil, Integer superficieVelicaMayor, Integer superficieTotal) {
		super(nombre, duenio, manga, calado, eslora, tripulacion, peso);	
		this.alturaMastil = alturaMastil;
		this.superficieVelicaMayor = superficieVelicaMayor;
		this.superficieTotal = superficieTotal;	
	}
	
	@Override
	public Double obtenerPrecioDeAmarre() {
		Double precioEslora = 3000.0;
		if (super.eslora <= 20.0) {
			precioEslora = 2000.0;
		}
		return precioEslora + 9000.0;
	}

}
