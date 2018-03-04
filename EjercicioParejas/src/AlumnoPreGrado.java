import java.util.Vector;
/*
 *  @author Diego
 *  @author Pepe  
 *  
 *  @version 1.0
 */
public class AlumnoPreGrado extends Alumno{
	
	public AlumnoPreGrado(String nombre, String apellido, int id, double factura, int edad,
			Vector<Asignatura> asignaturas) {
		super(nombre, apellido, id, factura, edad, "Pre-Grado", asignaturas);
	}

}
