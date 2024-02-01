package ar.edu.unlam.pb2.aliciaEnElPaisDeLasMaravillas;

public abstract class Alimento {
	
	private String nombre;

	public Alimento(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
}
