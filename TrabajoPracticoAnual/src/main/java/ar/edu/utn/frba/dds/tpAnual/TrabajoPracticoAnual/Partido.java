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
	Queue<Jugador> colaDeJugadoresCondicionales = new LinkedList<Jugador>();
	Stack<Jugador> pilaDeJugadoresSolidarios = new Stack <Jugador>();



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

		
	
	public void agregarJugadorStandard(JugadorStandard jugadorStandard) {
		equipo.add(jugadorStandard);
		
	}


	public void agregarJugadorCondicional(JugadorCondicional jugadorCondicional) {
		colaDeJugadoresCondicionales.add(jugadorCondicional);

		
	}


	public void agregarJugadorSolidario(JugadorSolidario jugadorSolidario) {
		pilaDeJugadoresSolidarios.add(jugadorSolidario);

	}

	public void listaDeLosQueJuegan(){
		
		
	
		while(equipo.size()<10 && !(this.colaDeJugadoresCondicionales.isEmpty())){
			agregarJugadoresCondicionales();
		}
		
		while(equipo.size()<10  && !(this.pilaDeJugadoresSolidarios.empty())){	
			agregarJugadoresSolidarios();
			
		}
	}

	private void agregarJugadoresSolidarios() {
		Jugador jugadorSolidarioAJugar = this.pilaDeJugadoresSolidarios.peek();
		equipo.add(jugadorSolidarioAJugar);
		this.pilaDeJugadoresSolidarios.pop();		
	}

	private void agregarJugadoresCondicionales() {
		
		Jugador jugadorCondicionalAJugar = (this.colaDeJugadoresCondicionales.element());
		equipo.add(jugadorCondicionalAJugar);
		this.colaDeJugadoresCondicionales.remove();
		
	}
	 

		
		
	}
	

	

	
	

	

