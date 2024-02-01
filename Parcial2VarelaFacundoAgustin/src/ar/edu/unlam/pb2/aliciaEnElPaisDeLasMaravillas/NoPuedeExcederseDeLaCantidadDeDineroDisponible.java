package ar.edu.unlam.pb2.aliciaEnElPaisDeLasMaravillas;

public class NoPuedeExcederseDeLaCantidadDeDineroDisponible extends Exception {
	private static final long serialVersionUID = 1L;
	
	public NoPuedeExcederseDeLaCantidadDeDineroDisponible() {
		super("No se puede gastar mas del dinero disponible");
	}
}
