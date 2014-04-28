package ar.edu.utn.frba.dds.tpAnual.TrabajoPracticoAnual;

import java.time.LocalTime;

import java.time.LocalDate;
import java.util.ArrayList; 
import java.util.Collection;

public class Partido {
	
	LocalTime horario;
	   public LocalTime getHorario() {
		return horario;
	}


	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}


	LocalDate fecha;

	
	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	Collection<Jugador> equipo = new ArrayList<Jugador>();



	
	

	
}
