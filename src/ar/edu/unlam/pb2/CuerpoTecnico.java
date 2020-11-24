package ar.edu.unlam.pb2;

public class CuerpoTecnico extends Miembro {
	private Cargo cargo;

public CuerpoTecnico(String nombre, String apellido, Integer edad, Double sueldo, Cargo cargo) {
		super(nombre, apellido, edad, sueldo);
		this.cargo= cargo;
	}

public Cargo getCargo() {
	return cargo;
}

public void setCargo(Cargo cargo) {
	this.cargo = cargo;
}






}
