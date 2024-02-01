package ar.edu.unlam.pb2.aliciaEnElPaisDeLasMaravillas;

import java.util.ArrayList;
import java.util.Collections;

public class Personaje {
	private Integer altura;
	private Double peso;
	private String nombre;
	private Integer edad;
	private Integer dineroDisponible;
	private static final Integer ALTURA_MAXIMA_AGRANDADORA = 240;
	private static final Integer ALTURA_MINIMA_ACHICADORA = 100;
	
	private ArrayList<Alimento> alimentos = new ArrayList<>();
	
	public Personaje(Integer altura, Double peso, String nombre, Integer edad, Integer dineroDisponible) {
		this.altura = altura;
		this.peso = peso;
		this.nombre = nombre;
		this.edad = edad;
		this.dineroDisponible = dineroDisponible;
	}
	
	public Boolean comprarAlimento(Alimento nuevo) throws NoPuedeExcederseDeLaCantidadDeDineroDisponible {
		Integer dineroMinimo = 0;
		Boolean sePudoComprar = false;
		if (this.dineroDisponible > dineroMinimo) {
			this.dineroDisponible -= 25;
			this.alimentos.add(nuevo);
			sePudoComprar = true;
			return sePudoComprar;
		}
		throw new NoPuedeExcederseDeLaCantidadDeDineroDisponible();
	}
	
	public Integer consumirAlimento(Alimento consumido) {
		
		if (consumirAgrandador(consumido)) {
			this.alimentos.remove(consumido);
		}else if (consumirAchicador(consumido)) {
			this.alimentos.remove(consumido);
		}
		return this.altura;
	}
	
	public Boolean consumirAgrandador(Alimento agrandador) {
		Boolean resultado = false;
		Integer cantidadQueCrece = 40;
		
		if (agrandador instanceof Agrandador && this.altura < Personaje.ALTURA_MAXIMA_AGRANDADORA) {
			this.altura += cantidadQueCrece;
			resultado = true;
		}else if (this.altura > Personaje.ALTURA_MAXIMA_AGRANDADORA){
			this.altura = 280;
		}
		return resultado;
	}
	
	public Boolean consumirAchicador(Alimento achicador) {
		Boolean resultado = false;
		Integer cantidadQueAchica = 50;
		
		if (achicador instanceof Achicador && this.altura > Personaje.ALTURA_MINIMA_ACHICADORA) {
			this.altura -= cantidadQueAchica;
			resultado = true;
		}else if (this.altura < Personaje.ALTURA_MINIMA_ACHICADORA){
			this.altura = 50;
		}
		return resultado;
	}
	
	public void ordenarAlimentosPorNombreDescendente() {
		ComparadorDeAlimentos comparador = new ComparadorDeAlimentos();
		Collections.sort(alimentos, comparador);
	}
	
	public Integer getAltura() {
		return altura;
	}

	public Double getPeso() {
		return peso;
	}

	public String getNombre() {
		return nombre;
	}
	
	public Integer getEdad() {
		return edad;
	}
	
	public Integer getDineroDisponible() {
		return dineroDisponible;
	}
	
	public Object getCantidadDeAlimentos() {
		return this.alimentos.size();
	}
	
	public ArrayList<Alimento> getMisAlimentos() {
		return this.alimentos;
	}
	
}
