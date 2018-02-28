import java.util.Vector;

public class AlumnoPostGrado  extends Alumno{
	
	private AlumnoPreGrado alumnoPreGrado;
	
	/**  Constructor de la clase AlumnoPostGrado, requiere de la existencia de un alumno de pregrado, 
	 * ya que sino termina el grado no se debería poder hacer el postgrado.
	 * @param factura define el precio del posgrado, que debe cambiar respecto al del grado
	 * @param edad define la edad del alumno, que puede cambiar con respecto a cuando sacó el grado
	 * @param asignaturas define el total de asignaturas de este postgrado
	 * @param alumnoPreGrado define el alumno que ha terminado el grado
	 */
	public AlumnoPostGrado(double factura, int edad, Vector<Asignatura> asignaturas, AlumnoPreGrado alumnoPreGrado) {
		super(alumnoPreGrado.getNombre(), alumnoPreGrado.getApellido(), alumnoPreGrado.getId(), factura, edad, "Post-Grado", asignaturas);
			Universidad.getAlumnos().removeElement(alumnoPreGrado); //eliminamos el alumno de pregrado para añadirle a postgrado
	}

	
	public AlumnoPreGrado getPreGrado() {
		return alumnoPreGrado;
	}

	public void setPreGrado(AlumnoPreGrado alumnoPreGrado) {
		this.alumnoPreGrado = alumnoPreGrado;
	}

}
