package ar.edu.utn.frba.dds.tpAnual.TrabajoPracticoAnual;




import java.time.LocalTime;
import java.time.LocalDate;


import org.junit.Before;
import org.junit.Test; 



public class TestTPA {
	public Partido partido;
	public Partido partidoB;


	public Fixture fixture;

	
	@Before
		public void nuevoPartido(){

		fixture = new Fixture();
		partido = new Partido(LocalDate.of(2014, 04, 25),LocalTime.of(18, 00, 00));
		fixture.agregar(partido);
		partidoB = new Partido(LocalDate.of(2014, 02, 25),LocalTime.of(18, 00, 00));
		fixture.agregar(partidoB);
		
		
		
	}


	@Test
	public void incripcionAPartido() {
		
		CondicionDelJugador condicionDelJugador = null;
		
		Jugador nicolasPardo = new JugadorStandard();
		Jugador santiPugliese = new JugadorCondicional(condicionDelJugador);
		Jugador juanManrique = new JugadorSolidario();
		Jugador nicoLedesma = new JugadorSolidario();
		Jugador matiasReinoso = new JugadorStandard();

			
		nicolasPardo.inscribir(partido);
		santiPugliese.inscribir(partido);
		nicoLedesma.inscribir(partido);
		juanManrique.inscribir(partido);
		matiasReinoso.inscribir(partido);
		matiasReinoso.inscribir(partidoB);
		

		partido.listaDeLosQueJuegan();
		
		
		
	
	}
	}



		
	

