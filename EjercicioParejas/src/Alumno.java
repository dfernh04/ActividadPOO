import java.util.Vector;

public class Alumno {

	private String nombre;
	private String apellido;
	private String dni;
	private Vector<Asignatura> asignaturas = new Vector<>(); 
	private double factura;

	//CONSTRUCTOR
	public Alumno(String nombre, String apellido, String dni, double factura, Vector<Asignatura> asignaturas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.factura = factura;
		this.asignaturas = asignaturas;
	}


	//METODOS
	public void aniadirAsignatura(Asignatura s) {
		this.asignaturas.add(s);
	}
	
	public void eliminarAsignatura(Asignatura s) {
		this.asignaturas.remove(s);
	}
	
	public float calcularMedia() {
		float media = 0;
		if(this.asignaturas.size() > 0) {
			for(int i = 0; i < this.asignaturas.size(); i++) {
				media += this.asignaturas.get(i).getNota();
			}
			media = media/this.asignaturas.size();
		}
		
		return media;
	}
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
	public double getFactura() {
		return factura;
	}
	public void setFactura(double factura) {
		this.factura = factura;
	}

}
