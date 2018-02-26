import java.util.Vector;

public class Universidad {

	private String nombreUniversidad;

	private Vector <Edificio> edificios;
	private Vector <Personal> personal;
	private Vector <Alumno> alumnos;


	/**
	 * @param nombreUniversidad
	 * @param edificios
	 * @param personal
	 * @param alumnos
	 */
	public Universidad(String nombreUniversidad, Vector<Edificio> edificios, Vector<Personal> personal,
			Vector<Alumno> alumnos) {
		super();
		this.nombreUniversidad = nombreUniversidad;
		this.edificios = edificios;
		this.personal = personal;
		this.alumnos = alumnos;
	}
	
	public boolean añadirEdificio(Edificio edificio) {
		boolean añadido = false;
		if(edificio != null) {
			edificios.add(edificio);
			añadido = true;
		}
		return añadido;
	}
	
	/*public boolean eliminarEdificio(Edificio edificio) {
		
		
	}*/
	
	public boolean añadirPersonalDocente(Docente docente) {
		boolean añadido = false;
		if(docente != null) {
			personal.add(docente);
			añadido = true;
		}
		return añadido;
	}
	
	public boolean añadirPersonalNoDocente(NoDocente noDocente) {
		boolean añadido = false;
		if(noDocente != null) {
			personal.add(noDocente);
			añadido = true;
		}
		return añadido;
	}
	
	public void listarPersonal() {
		System.out.println("\nLISTADO DE PERSONAL:");
		for (int i = 0; i < personal.size(); i++) {
			System.out.println("\t- " + personal.get(i).getNombre() + " " + personal.get(i).getApellidos());
		}
	}
	
	public void listarPersonalDocente() {
		
	}
	
	public void listarPersonalNoDocente() {
		
	}
	
	
	
	//--------------GETTERS Y SETTERS--------------

	public String getNombreUniversidad() {
		return nombreUniversidad;
	}


	public void setNombreUniversidad(String nombreUniversidad) {
		this.nombreUniversidad = nombreUniversidad;
	}


	public Vector<Edificio> getEdificios() {
		return edificios;
	}


	public void setEdificios(Vector<Edificio> edificios) {
		this.edificios = edificios;
	}


	public Vector<Personal> getPersonal() {
		return personal;
	}


	public void setPersonal(Vector<Personal> personal) {
		this.personal = personal;
	}


	public Vector<Alumno> getAlumnos() {
		return alumnos;
	}


	public void setAlumnos(Vector<Alumno> alumnos) {
		this.alumnos = alumnos;
	}


}
