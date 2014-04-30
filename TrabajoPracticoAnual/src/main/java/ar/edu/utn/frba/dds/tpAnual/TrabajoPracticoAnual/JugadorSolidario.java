package ar.edu.utn.frba.dds.tpAnual.TrabajoPracticoAnual;

public class JugadorSolidario implements Jugador {

	JugadorSolidario jugadorSolidario;

	public void inscribir(Partido partido){
	partido.agregarJugadorSolidario(this);
	}
}
