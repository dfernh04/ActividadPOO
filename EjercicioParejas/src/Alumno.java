import java.util.Vector;

public class Alumno {
	private String nombre;
	private String apellido;
	private String dni;
	private Vector<Asignatura> asignaturas = new Vector<>(); 
	private int mensualidad;
	//GETTERS Y SETTERS
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
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Vector<Asignatura> getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(Vector<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}
	public int getMensualidad() {
		return mensualidad;
	}
	public void setMensualidad(int mensualidad) {
		this.mensualidad = mensualidad;
	}
	//CONSTRUCTOR
	public Alumno(String nombre, String apellido, String dni, Vector<Asignatura> asignaturas, int mensualidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.asignaturas = asignaturas;
		this.mensualidad = mensualidad;
	}
	//METODOS
	public void aniadirAsignatura(Asignatura s) {
		asignaturas.add(s);
	}
	public void eliminarAsignatura(Asignatura s) {
		asignaturas.remove(s);
	}


}
