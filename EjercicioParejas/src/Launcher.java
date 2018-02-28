import java.util.Vector;

public class Launcher {
	
	public static void main(String[] args) {
		
		Edificio edificio = new Edificio("Pepirlo", "TIC");
		edificio.listarClases();
		edificio.reservarClase(edificio.getClases().get(20));
		edificio.listarClasesReservadas();
		edificio.reservarClase(20);
		edificio.listarClasesReservadas();
		edificio.quitarReservaClase(21);
		edificio.listarClasesReservadas();
		
		System.out.println("----------------------------");
		
		Vector<Edificio> edificios = new Vector<Edificio>();
		edificios.add(edificio);
		Vector<Alumno> alumnos = new Vector<Alumno>();
		Universidad uem = new Universidad("uem", edificios, null, alumnos);
		
		for (int i = 0; i < 20; i++) {
			Alumno alumno = new AlumnoPreGrado("Alumno " + (i+1), null, i*1000, 13000, 18, null);
			alumnos.add(alumno);
		}
		
		uem.listarAlumnos();
		
		for (int i = 0; i < 10; i++) {
			Alumno postGrado = new AlumnoPostGrado(20000, 30, null, (AlumnoPreGrado) alumnos.get(i));
			alumnos.add(i,postGrado);
		}
		/*Alumno postGrado = new AlumnoPostGrado(20000, 30, null, (AlumnoPreGrado) alumnos.get(3));
		alumnos.add(3,postGrado);*/

		
		uem.listarAlumnos();

	}

}
