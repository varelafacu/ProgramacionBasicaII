package ar.edu.unlam.pb2.aliciaEnElPaisDeLasMaravillas;

import java.util.Comparator;

public class ComparadorDeAlimentos implements Comparator<Alimento>{
	
	@Override
	public int compare(Alimento alimento1, Alimento alimento2) {
		String nombreAlimento1 = alimento1.getNombre();
		String nombreAlimento2 = alimento2.getNombre();
		
		return nombreAlimento2.compareTo(nombreAlimento1);
	}
}
