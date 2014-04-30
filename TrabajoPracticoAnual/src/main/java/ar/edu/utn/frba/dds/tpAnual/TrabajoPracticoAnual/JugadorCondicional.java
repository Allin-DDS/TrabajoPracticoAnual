package ar.edu.utn.frba.dds.tpAnual.TrabajoPracticoAnual;

public class JugadorCondicional implements Jugador {
	

	JugadorCondicional jugadorCondicional;
	

	public CondicionDelJugador condicionDelJugador;
	

	public  JugadorCondicional(CondicionDelJugador condicionDelJugador){
		this.condicionDelJugador = condicionDelJugador;
	}
	
	
	public void inscribir(Partido partido){ 
		if(condicionDelJugador == null){ //falta crear los tipos de condiciones por el momento usamos solo condicion Null
		partido.agregarJugadorCondicional(this);
	}
	}
	
	/*private boolean cumpleCondicion() {
		if(this.condicionDelJugador == null){  //falta crear los tipos de condiciones
			return true;
			
		}
		return false;
	}*/
	

}
