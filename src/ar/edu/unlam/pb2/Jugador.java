package ar.edu.unlam.pb2;

public class Jugador extends Miembro {
	
	private Posicion posicion;
	private Integer numeroCamista;

public Jugador(String nombre, String apellido, Integer edad, Double sueldo, Posicion posicion, Integer numeroCamiseta) {
		super(nombre, apellido, edad, sueldo);
		this.posicion = posicion;
		this.numeroCamista = numeroCamiseta;
	}

public Posicion getPosicion() {
	return posicion;
}

public void setPosicion(Posicion posicion) {
	this.posicion = posicion;
}

public Integer getNumeroCamista() {
	return numeroCamista;
}

public void setNumeroCamista(Integer numeroCamista) {
	this.numeroCamista = numeroCamista;
}










	
	
}
