package ar.edu.unlam.pb2.fondeaderoUnlam;

import java.util.Objects;

public abstract class Yate implements Comparable<Yate>{

	private String nombre;
	private String duenio;
	private Double manga;
	private Double calado;
	protected Double eslora;
	private Integer tripulacion;
	private Integer peso;
	
	public Yate(String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion, Integer peso) {
		super();
		this.nombre = nombre;
		this.duenio = duenio;
		this.manga = manga;
		this.calado = calado;
		this.eslora = eslora;
		this.tripulacion = tripulacion;
		this.peso = peso;
	}
	
	public abstract Double obtenerPrecioDeAmarre();
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Yate other = (Yate) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	public int compareTo(Yate otra) {
		/*if (this.eslora > o.eslora) {
			return 1;
		}else if (this.eslora < o.eslora){
			return -1;
		}else {
			return 0;
		}*/
		
		//Forma resumida
		return this.eslora.compareTo(otra.eslora);
	}
}
