package ar.edu.utn.frba.dds.tpAnual.TrabajoPracticoAnual;


public class JugadorStandard implements Jugador {
	
	
	JugadorStandard jugadorStandard;
	
	
	public void inscribir(Partido partido){
			if(partido.hayLugarDisponible()){
			
				partido.agregarJugadorStandard(jugadorStandard);
			}
			
	}



	
	

}
