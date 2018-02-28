public class Asignatura {
	private	String nombre;
	private double creditos;
	private double nota;
	
	//CONSTRUCTOR
	public Asignatura(String nombre, double creditos) {
		this.nombre = nombre;
		this.creditos = creditos;
	}
	
	
	//METODOS
	
	
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getCreditos() {
		return creditos;
	}
	public void setCreditos(double creditos) {
		this.creditos = creditos;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
}
