package ar.edu.utn.frba.dds.tpAnual.TrabajoPracticoAnual;

import java.time.LocalTime;
import java.time.LocalDate;
import java.util.ArrayList; 
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Partido {
	
	LocalTime horario;
	LocalDate fecha;
	Collection<Jugador> equipo = new ArrayList<Jugador>();
	Queue<Jugador> totalDeJugadoresCondicionales = new LinkedList<Jugador>();
	Stack<Jugador> totalDeJugadoresSolidarios = new Stack <Jugador>();



	public Partido(LocalDate of, LocalTime of2) {
		this.fecha= of;
		this.horario= of2;
	}

	/*public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	
	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
*/

	public  boolean hayLugarDisponible(){
		
		
		int cupos = equipo.size();
		
		if(cupos < 10){
			return true;
			
		}
		else{
			return false;

		}
	
		
	}
	
	
	public void agregarJugadorStandard(JugadorStandard jugadorStandard) {
		equipo.add(jugadorStandard);
		
	}


	public void agregarJugadorCondicional(JugadorCondicional jugadorCondicional) {
		totalDeJugadoresCondicionales.add(jugadorCondicional);

		
	}


	public void agregarJugadorSolidario(JugadorSolidario jugadorSolidario) {
		totalDeJugadoresSolidarios.add(jugadorSolidario);

	}

	public void listaDeLosQueJuegan(){
		
		
	
		while(this.hayLugarDisponible() && !(this.totalDeJugadoresCondicionales.isEmpty())){
			agregarJugadoresCondicionales();
		}
		
		while(this.hayLugarDisponible() && !(this.totalDeJugadoresSolidarios.empty())){	
			agregarJugadoresSolidarios();
			
		}
	}

	private void agregarJugadoresSolidarios() {
		Jugador jugadorSolidarioAJugar = this.totalDeJugadoresSolidarios.peek();
		equipo.add(jugadorSolidarioAJugar);
		this.totalDeJugadoresSolidarios.pop();		
	}

	private void agregarJugadoresCondicionales() {
		
		Jugador jugadorCondicionalAJugar = (this.totalDeJugadoresCondicionales.element());
		equipo.add(jugadorCondicionalAJugar);
		this.totalDeJugadoresCondicionales.remove();
		
	}
	 
	public void agregarPartido(Fixture fixture){
		fixture.agregar(this);
		
		
	}
	

	

	
	

	
}
