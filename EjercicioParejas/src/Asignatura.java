/*
 *  @author Diego
 *  @author Pepe  
 *  
 *  @version 1.0
 */
public class Asignatura {
	private	String nombre;
	private double creditos;
	private double nota; //Podriamos haber creado otro vector de notas pero no nos parecia relevante
	
	//CONSTRUCTOR
	/** Constructor de la clase Asignatura sin nota para la asignatura para asignarla mas tarde cuando "realice el examen"
	 * @param nombre
	 * @param creditos
	 */
	public Asignatura(String nombre, double creditos) {
		this.nombre = nombre;
		this.creditos = creditos;
	}
	
	/**
	 * Constructor de la clase Asignatura con nota para tener que evitar ponerla mas adelante a mano. 
	 * @param nombre
	 * @param creditos
	 * @param nota
	 */
	public Asignatura(String nombre, double creditos, double nota) {
		this.nombre = nombre;
		this.creditos = creditos;
		this.nota = nota;
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
	public void setNota(double nota) {
		this.nota = nota;
	}
}
