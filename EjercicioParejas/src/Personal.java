
public class Personal {
	private String nombre;
	private String apellidos;
	private String dni;
	private int id;
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param id
	 */
	public Personal(String nombre, String apellidos, String dni, int id) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
}
