package ar.edu.utn.frba.dds.tpAnual.TrabajoPracticoAnual;



import java.util.ArrayList;
import java.util.Collection;

import java.time.LocalTime;
import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test; 




public class TestTPA {
	Partido partido;
	@Before
		public void crearPartido(){
			
			Collection<Equipo> jugadores = new ArrayList<Equipo>();
	
		
	}

	@Test
	public void incripcionAPartido() {
		
		Condicion condicion = null;
		
		Jugador nicolasPardo = new JugadorStandard();
		Jugador santiPugliese = new JugadorCondicional(condicion);
		Jugador juanManrique = new JugadorSolidario();
		Jugador nicoLedesma = new JugadorSolidario();

		partido.setFecha(LocalDate.of(2014, 04, 25));
		partido.setHorario(LocalTime.of(18, 00, 00));
		
		nicolasPardo.inscribir(partido);
		santiPugliese.inscribir(partido);
		nicoLedesma.inscribir(partido);
		juanManrique.inscribir(partido);

	}
	
	

}
