import java.util.Vector;

public class Docente extends Personal {

	private String rol;
	private Vector<Asignatura> asignaturas;
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param id
	 */
	public Docente(String nombre, String apellidos, String dni, int id, int edad, double salario, 
			String rol, Vector<Asignatura> asignaturas) {
		super(nombre, apellidos, dni, id, edad, salario);
		this.rol = rol;
		this.asignaturas = asignaturas;
	}
	

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Vector<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Vector<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}
	
}
