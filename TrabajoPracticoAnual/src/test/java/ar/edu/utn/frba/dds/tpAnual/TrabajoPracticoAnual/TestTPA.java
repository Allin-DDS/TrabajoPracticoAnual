package ar.edu.utn.frba.dds.tpAnual.TrabajoPracticoAnual;




import java.time.LocalTime;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test; 



public class TestTPA {
	public Partido partido;
	
	
	@Before
		public void nuevoPartido(){

		partido = new Partido();
		
		
	}

	@Test 
	public void setearHoraDia(){
		partido.setFecha(LocalDate.of(2014, 04, 25));
		partido.setHorario(LocalTime.of(18, 00, 00));
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
		
	
		partido.listaDeLosQueJuegan();
		
	int n = 0;
		 for(Jugador jugador : partido.totalDeJugadoresSolidarios){
			 n = n+1;
			 System.out.println(n);
			 
			 
		 }
		
	}

		
	
}
