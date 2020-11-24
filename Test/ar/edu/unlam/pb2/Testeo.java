package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testeo {

	@Test(expected = cupoLleno.class)
	public void testQueMesaltaExcepcionPorQueEstaLleno() throws cupoLleno {
		Institucion river = new Institucion ("RIver Plate");
		Miembro gallardo = new CuerpoTecnico("Marcelo", "Gallardo", 45, 5000.00, Cargo.DirectorTecnico);
		Miembro perotti = new CuerpoTecnico("Perotti", "Raul", 65, 2500.00, Cargo.AyudanteDeCampo);
		Miembro armani = new Jugador ("Armani", "Franco", 32, 5000.00, Posicion.Arquero ,1);
		Miembro montiel = new Jugador ("Montiel", "Nicolas", 33, 5000.00, Posicion.Arquero ,4);
		Miembro pinola = new Jugador ("Pinola", "Agustin", 21, 5000.00, Posicion.Arquero ,6);
		Miembro casco = new Jugador ("Casco", "Milton", 22, 5000.00, Posicion.Arquero ,3);
		Miembro angeleri = new Jugador ("Angeleri", "Julian", 28, 5000.00, Posicion.Arquero ,14);
		
		river.agregoMiembro(gallardo);
		river.agregoMiembro(angeleri);
		river.agregoMiembro(casco);
		river.agregoMiembro(pinola);
		river.agregoMiembro(montiel);
		river.agregoMiembro(armani);
		river.agregoMiembro(perotti);
	
		
	}
	
	
	@Test
	public void testQueVerificaQueReporteFuncionaBien() throws cupoLleno{
		Institucion river = new Institucion ("RIver Plate");
		Miembro gallardo = new CuerpoTecnico("Marcelo", "Gallardo", 45, 5000.00, Cargo.DirectorTecnico);
		
		Miembro armani = new Jugador ("Armani", "Franco", 32, 5000.00, Posicion.Arquero ,1);
		Miembro montiel = new Jugador ("Montiel", "Nicolas", 33, 5000.00, Posicion.Arquero ,4);
		Miembro pinola = new Jugador ("Pinola", "Agustin", 21, 5000.00, Posicion.Arquero ,6);
		Miembro casco = new Jugador ("Casco", "Milton", 22, 5000.00, Posicion.Arquero ,3);
		Miembro angeleri = new Jugador ("Angeleri", "Julian", 28, 5000.00, Posicion.Arquero ,14);
		
		river.agregoMiembro(gallardo);
		river.agregoMiembro(angeleri);
		river.agregoMiembro(casco);
		river.agregoMiembro(pinola);
	
		Integer ve= 3;
		Integer vo=river.miembrosQueSonJugadores().size();
		assertEquals(ve,vo);
		
		
	}
	
	@Test
	public void testQueVerificaQueNoSeIngresanJugadoresConElMismoNombre() throws cupoLleno{
		Institucion river = new Institucion ("RIver Plate");
		Miembro gallardo = new CuerpoTecnico("Marcelo", "Gallardo", 45, 5000.00, Cargo.DirectorTecnico);
		
		Miembro casco1 = new Jugador ("Casco", "Milton", 22, 5000.00, Posicion.Arquero ,1);
		Miembro gallardo1 = new Jugador ("Marcelo", "Gallardo", 45, 5000.00, Posicion.Arquero ,4);
		Miembro pinola = new Jugador ("Pinola", "Agustin", 21, 5000.00, Posicion.Arquero ,6);
		Miembro casco = new Jugador ("Casco", "Milton", 22, 5000.00, Posicion.Arquero ,3);
		Miembro angeleri = new Jugador ("Angeleri", "Julian", 28, 5000.00, Posicion.Arquero ,14);
		
		river.agregoMiembro(gallardo1);
		river.agregoMiembro(casco1);
		river.agregoMiembro(gallardo);
		river.agregoMiembro(angeleri);
		river.agregoMiembro(casco);
		river.agregoMiembro(pinola);
		
		System.out.println(river.getLista().size());
		
			
		}
}
