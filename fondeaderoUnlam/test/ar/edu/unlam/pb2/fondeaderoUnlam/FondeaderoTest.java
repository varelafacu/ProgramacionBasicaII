package ar.edu.unlam.pb2.fondeaderoUnlam;

import static org.junit.Assert.*;

import org.junit.Test;

public class FondeaderoTest {

	@Test
	public void queSePuedaSaberElValorDeAmarraDeUnYateMotor() {
		YateMotor miYateMotor = new YateMotor("AZ1", "Andras Borgeat", 18.87, 5.15, 119.0, 37, 5500, 5959, "2x Motores Diesel MAN RK2805", "9000", 23, 6500);
		Double valorObtenido = 0.0;
		Double valorEsperado = 13000.0;
		
		valorObtenido = miYateMotor.obtenerPrecioDeAmarre();
		
		
		assertEquals(valorEsperado, valorObtenido, 0.2);
	}
	
	@Test
	public void queSePuedaSaberElValorDeAmarraDeUnYateVela() {
		YateVela miYateVela = new YateVela("XXR", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400, 21.5, 85, 133);
		Double valorObtenido = 0.0;
		Double valorEsperado = 11000.0;
		
		valorObtenido = miYateVela.obtenerPrecioDeAmarre();
		
		
		assertEquals(valorEsperado, valorObtenido, 0.2);
	}
	
	@Test
	public void queSePuedaCrearUnFondeaderoCon70Amarras() {
		Fondeadero fondeaderoPuertoMadero = new Fondeadero(70);
		Integer valorObtenido = 0;
		Integer valorEsperado = 70;
		
		valorObtenido = fondeaderoPuertoMadero.obtenerCantidadDeAmarrasDisponibles();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queSePuedaAmarrarUnYate() {
		Fondeadero fondeaderoPuertoMadero = new Fondeadero(70);
		YateMotor miYateMotor = new YateMotor("AZ1", "Andras Borgeat", 18.87, 5.15, 119.0, 37, 5500, 5959, "2x Motores Diesel MAN RK2805", "9000", 23, 6500);
		Integer valorObtenido = 0;
		Integer valorEsperado = 69;
		
		fondeaderoPuertoMadero.amarrarYate(miYateMotor);
		valorObtenido = fondeaderoPuertoMadero.obtenerCantidadDeAmarrasDisponibles();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queSePuedaDesamarrarUnYate() {
		Fondeadero fondeaderoPuertoMadero = new Fondeadero(70);
		YateMotor miYateMotor = new YateMotor("AZ1", "Andras Borgeat", 18.87, 5.15, 119.0, 37, 5500, 5959, "2x Motores Diesel MAN RK2805", "9000", 23, 6500);
		Integer valorObtenido = 0;
		Integer valorEsperado = 70;
		
		fondeaderoPuertoMadero.amarrarYate(miYateMotor);
		fondeaderoPuertoMadero.desamarrarYate(miYateMotor);
		valorObtenido = fondeaderoPuertoMadero.obtenerCantidadDeAmarrasDisponibles();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queNoSePuedaAmarrarUnYateDuplicado() {
		Fondeadero fondeaderoPuertoMadero = new Fondeadero(70);
		YateMotor miYateMotor = new YateMotor("AZ1", "Andras Borgeat", 18.87, 5.15, 119.0, 37, 5500, 5959, "2x Motores Diesel MAN RK2805", "9000", 23, 6500);
		YateMotor miYateMotor2 = new YateMotor("AZ1", "Andras Borgeat", 18.87, 5.15, 119.0, 37, 5500, 5959, "2x Motores Diesel MAN RK2805", "9000", 23, 6500);
		Integer valorObtenido = 0;
		Integer valorEsperado = 69;
		
		fondeaderoPuertoMadero.amarrarYate(miYateMotor);
		fondeaderoPuertoMadero.amarrarYate(miYateMotor2);
		valorObtenido = fondeaderoPuertoMadero.obtenerCantidadDeAmarrasDisponibles();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queSePuedaOrdenarLosYates() {
		Fondeadero fondeaderoPuertoMadero = new Fondeadero(70);
		Fondeadero fondeaderoEsperado = new Fondeadero(70);
		YateMotor miYateMotor = new YateMotor("AZ1", "Andras Borgeat", 18.87, 5.15, 110.0, 37, 5500, 5959, "2x Motores Diesel MAN RK2805", "9000", 23, 6500);
		YateMotor miYateMotor2 = new YateMotor("AZZ", "Ruben Moreira", 18.90, 5.20, 119.0, 37, 5600, 5959, "2x Motores Diesel MAN RK2805", "9000", 23, 6500);
		YateVela miYateVela = new YateVela("XXR", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400, 21.5, 85, 133);
		
		fondeaderoEsperado.amarrarYate(miYateVela);
		fondeaderoEsperado.amarrarYate(miYateMotor);
		fondeaderoEsperado.amarrarYate(miYateMotor2);
		
		fondeaderoPuertoMadero.amarrarYate(miYateMotor);
		fondeaderoPuertoMadero.amarrarYate(miYateMotor2);
		fondeaderoPuertoMadero.amarrarYate(miYateVela);
		fondeaderoPuertoMadero.ordenarYates();
		
		assertArrayEquals(fondeaderoEsperado.getAmarras(), fondeaderoPuertoMadero.getAmarras());
	}
}
