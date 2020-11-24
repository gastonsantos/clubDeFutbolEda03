package ar.edu.unlam.pb2;

public class Miembro  implements Comparable<Miembro>{
	private String nombre;
	private String apellido;
	private Integer edad;
	private Double sueldo;
	
	//Metodos Constructor
	
	public Miembro(String nombre, String apellido, Integer edad, Double sueldo) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sueldo = sueldo;
	}
	//Getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Double getSueldo() {
		return sueldo;
	}
	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Miembro))
			return false;
		Miembro other = (Miembro) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Miembro [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", sueldo=" + sueldo + "]";
	}
	@Override
	public int compareTo(Miembro miembro1) {
		if(this.apellido.compareTo(miembro1.apellido)==0){
			return this.edad.compareTo(miembro1.edad);
		}
		return this.apellido.compareTo(miembro1.apellido);
	}
	
	


	
	
	
}
