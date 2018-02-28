import java.util.Vector;

public class Alumno {

	private String nombre;
	private String apellido;
	private int id;
	private double factura;
	private int edad;
	private String rol;
	private Vector<Asignatura> asignaturas = new Vector<>(); 

	//CONSTRUCTOR
	public Alumno(String nombre, String apellido, int id, double factura, int edad, String rol, Vector<Asignatura> asignaturas) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.factura = factura;
		this.edad = edad;
		this.setRol(rol);
		this.asignaturas = asignaturas;
	}


	//METODOS
	public void aniadirAsignatura(Asignatura s) {
		this.asignaturas.add(s);
	}
	
	public void eliminarAsignatura(Asignatura s) {
		this.asignaturas.removeElement(s);
	}
	
	public void listarAsignaturas() {
		System.out.println("\nLISTADO DE ASIGNATURAS:");
		if(!this.asignaturas.isEmpty()) {
			for (int i = 0; i < this.asignaturas.size(); i++) {
				System.out.println(this.asignaturas.get(i).getNombre());
			}
		}
	}
	
	public double calcularMedia() {
		double media = 0;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getRol() {
		return rol;
	}


	public void setRol(String rol) {
		this.rol = rol;
	}

}
