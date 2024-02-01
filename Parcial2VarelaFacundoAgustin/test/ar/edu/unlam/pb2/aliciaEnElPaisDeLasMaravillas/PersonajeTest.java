package ar.edu.unlam.pb2.aliciaEnElPaisDeLasMaravillas;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonajeTest {

	@Test
	public void queAlComprarUnAlimentoSeDescuenteElDineroDisponible() throws NoPuedeExcederseDeLaCantidadDeDineroDisponible {
		Personaje alicia = new Personaje(180, 80.0, "Alicia", 26, 100);
		
		Achicador alfajor = new Achicador("Alfajor");
		Agrandador bocadoDeChocolate = new Agrandador("Bocado De Chocolate");
		Integer dineroEsperado = 50;
		
		alicia.comprarAlimento(alfajor);
		alicia.comprarAlimento(bocadoDeChocolate);
		assertEquals(dineroEsperado, alicia.getDineroDisponible());
	}
	
	@Test (expected = NoPuedeExcederseDeLaCantidadDeDineroDisponible.class)
	public void queNoSeExcedaDelDineroDisponible() throws NoPuedeExcederseDeLaCantidadDeDineroDisponible {
		Personaje alicia = new Personaje(180, 80.0, "Alicia", 26, 100);
		
		Achicador alfajor = new Achicador("Alfajor");
		Achicador masita = new Achicador("Masita");
		Achicador bagels = new Achicador("Bagels");
		Agrandador bocadoDeChocolate = new Agrandador("Bocado De Chocolate");
		Agrandador caramelo = new Agrandador("Caramelo");
		
		alicia.comprarAlimento(alfajor);
		alicia.comprarAlimento(masita);
		alicia.comprarAlimento(bagels);
		alicia.comprarAlimento(bocadoDeChocolate);
		Integer dineroEsperado = 0;
		assertEquals(dineroEsperado, alicia.getDineroDisponible());
		
		alicia.comprarAlimento(caramelo);
	}
	
	@Test
	public void queAlConsumirUnAlimentoSeAgrandeElPersonaje() {
		Personaje alicia = new Personaje(180, 80.0, "Alicia", 26, 100);
		
		Agrandador bocadoDeChocolate = new Agrandador("Bocado De Chocolate");
		Agrandador caramelo = new Agrandador("Caramelo");
		
		alicia.consumirAlimento(bocadoDeChocolate);
		alicia.consumirAlimento(caramelo);
		Integer alturaEsperada = 260;
		
		assertEquals(alturaEsperada, alicia.getAltura());
	}
	
	@Test
	public void queAlConsumirUnAlimentoSeAchiqueElPersonaje() {
		Personaje alicia = new Personaje(180, 80.0, "Alicia", 26, 100);
		
		Achicador alfajor = new Achicador("Alfajor");
		Achicador masita = new Achicador("Masita");
		
		alicia.consumirAlimento(alfajor);
		alicia.consumirAlimento(masita);
		Integer alturaEsperada = 80;
		
		assertEquals(alturaEsperada, alicia.getAltura());
	}
	
	@Test
	public void queAlConsumirUnAlimentoNoSeAgrandeMasDe280cm() {
		Personaje alicia = new Personaje(220, 80.0, "Alicia", 26, 100);
		Agrandador bocadoDeChocolate = new Agrandador("Bocado De Chocolate");
		Agrandador caramelo = new Agrandador("Caramelo");
		Agrandador gomita = new Agrandador("Gomita");
		
		alicia.consumirAlimento(bocadoDeChocolate);
		alicia.consumirAlimento(caramelo);
		alicia.consumirAlimento(gomita);
		Integer alturaEsperada = 280;
		
		assertEquals(alturaEsperada, alicia.getAltura());
	}
	
	@Test
	public void queAlConsumirUnAlimentoNoSeAchiqueMenosDe50cm() {
		Personaje alicia = new Personaje(180, 80.0, "Alicia", 26, 100);
		Achicador alfajor = new Achicador("Alfajor");
		Achicador masita = new Achicador("Masita");
		Achicador bagels = new Achicador("Bagels");
		
		alicia.consumirAlimento(alfajor);
		alicia.consumirAlimento(masita);
		alicia.consumirAlimento(bagels);
		Integer alturaEsperada = 50;
		
		assertEquals(alturaEsperada, alicia.getAltura());
	}
	
	@Test
	public void queLosAlimentosSeOrdenenPorNombreDescendente() throws NoPuedeExcederseDeLaCantidadDeDineroDisponible {
		Personaje alicia = new Personaje(180, 80.0, "Alicia", 26, 100);
		Achicador alfajor = new Achicador("Alfajor");
		Achicador bagels = new Achicador("Bagels");
		Agrandador caramelo = new Agrandador("Caramelo");
		Agrandador gomita = new Agrandador("Gomita");
		
		alicia.comprarAlimento(alfajor);
		alicia.comprarAlimento(bagels);
		alicia.comprarAlimento(caramelo);
		alicia.comprarAlimento(gomita);
		alicia.ordenarAlimentosPorNombreDescendente();
		Integer esperado = 4;
		
		assertEquals(gomita, alicia.getMisAlimentos().get(0));
		assertEquals(alfajor, alicia.getMisAlimentos().get(3));
		assertEquals(esperado, alicia.getCantidadDeAlimentos());
	}
	
	@Test
	public void queAlConsumirUnAlimentoSeElminenDeLosDisponibles() throws NoPuedeExcederseDeLaCantidadDeDineroDisponible {
		Personaje alicia = new Personaje(180, 80.0, "Alicia", 26, 100);
		Achicador alfajor = new Achicador("Alfajor");
		Achicador bagels = new Achicador("Bagels");
		Agrandador caramelo = new Agrandador("Caramelo");
		Agrandador gomita = new Agrandador("Gomita");
		
		alicia.comprarAlimento(alfajor);
		alicia.comprarAlimento(bagels);
		alicia.comprarAlimento(caramelo);
		alicia.comprarAlimento(gomita);
		Integer esperado1 = 4;
		assertEquals(esperado1, alicia.getCantidadDeAlimentos());
		
		alicia.consumirAlimento(alfajor);
		alicia.consumirAlimento(caramelo);
		Integer esperado2 = 2;
		assertEquals(esperado2, alicia.getCantidadDeAlimentos());
	}
}
