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
