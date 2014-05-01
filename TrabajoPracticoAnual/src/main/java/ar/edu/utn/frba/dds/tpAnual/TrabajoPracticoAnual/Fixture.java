package ar.edu.utn.frba.dds.tpAnual.TrabajoPracticoAnual;

import java.util.ArrayList;
import java.util.Collection;


public class Fixture {
	Fixture fixture;
	
	Collection<Partido> partidos = new ArrayList<Partido>();
	
	

	public Collection<Partido> mostrar(){
		return partidos;
	};

	public void agregar(Partido partido){
		partidos.add(partido);
	
	}
}
