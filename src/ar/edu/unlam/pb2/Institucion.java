package ar.edu.unlam.pb2;


import java.util.HashMap;
import java.util.TreeSet;

public class Institucion {
	private static Integer totalMiembros=5;
	private String nombre;
	private TreeSet< Miembro> lista;
	
	
	public Institucion(String nombre){
		this.nombre=nombre;
		lista = new TreeSet<>();
	}
	
	public TreeSet<Jugador> miembrosQueSonJugadores(){
		TreeSet<Jugador>listaJugadores = new TreeSet<Jugador>();
		for(Miembro e: lista){
			if(e instanceof Jugador){
				listaJugadores.add((Jugador) e);
			}
		}
		return listaJugadores;
	}
	
	
	
	
	public Boolean agregoMiembro(Miembro miembro1) throws cupoLleno{
		Boolean agrego = false;
		if( totalMiembros>lista.size()){
			lista.add( miembro1);
			agrego = true;
			
		}else{
			throw new cupoLleno();
		}
		return agrego;
	}

	
	
	
	
	
	
	
	
	
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TreeSet<Miembro> getLista() {
		return lista;
	}


	public void setLista(TreeSet<Miembro> lista) {
		this.lista = lista;
	}


}
	

	
	
	

