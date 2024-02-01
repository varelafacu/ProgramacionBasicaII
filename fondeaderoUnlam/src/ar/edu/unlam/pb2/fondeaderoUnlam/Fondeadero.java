package ar.edu.unlam.pb2.fondeaderoUnlam;

import java.util.Collections;
import java.util.LinkedList;

public class Fondeadero {

	private Integer maximoAmarras;
	private LinkedList<Yate> amarras = new LinkedList<>();

	public Fondeadero(Integer maximoAmarras) {
		this.maximoAmarras = maximoAmarras;
	}

	public Integer obtenerCantidadMximaDeAmarras() {
		return this.maximoAmarras;
	}
	
	public Integer obtenerCantidadDeAmarrasDisponibles() {
		return this.maximoAmarras - this.amarras.size();
	}

	public void amarrarYate(Yate yate) {
		if (this.obtenerCantidadDeAmarrasDisponibles()>0 && !this.validarYateDuplicado(yate)) {
			this.amarras.add(yate);
		}
	}

	private boolean validarYateDuplicado(Yate yate) {
		return this.amarras.contains(yate);
	}

	public void desamarrarYate(Yate yate) {
		if (obtenerCantidadDeAmarrasDisponibles() > 0) {
			this.amarras.remove(yate);
		}
		
	}

	public Object[] getAmarras() {
		return this.amarras.toArray();
	}

	public void ordenarYates() {
		Collections.sort(this.amarras);
	}

	
}
