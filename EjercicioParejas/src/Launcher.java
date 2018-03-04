import java.util.Vector;
/*
 *  @author Diego
 *  @author Pepe  
 *  
 *  @version 1.0
 */
public class Launcher {
	
	public static void main(String[] args) {
		
		Vector<Edificio> edificios = new Vector<Edificio>();
		Vector<Personal> personal = new Vector<Personal>();
		Vector <Asignatura> asignaturasGrado = new Vector<Asignatura>();
		Vector <Asignatura> asignaturasPostGrado = new Vector<Asignatura>();
		Vector<Alumno> alumnos = new Vector<Alumno>();
		
		for (int i = 0; i < 12; i++) {
			Asignatura asignatura = new Asignatura("AsignaturaGrado" + i+1 , 6, Math.random()*10); //Aqui incluimos las notas en el constructor
			asignaturasGrado.add(asignatura);
		}
		
		for (int i = 0; i < 6; i++) {
			Asignatura asignatura = new Asignatura("AsignaturaPostGrado" + i+1 , 6);
			asignatura.setNota(Math.random()*10);//Aqui asignamos de otra forma distinta a la anterior las notas al vector de notas PostGrado
			asignaturasPostGrado.add(asignatura);
		}

		

		
		
		System.out.println("\n--------PRUEBAS DE EDIFICIO A---------");
		
		Edificio edificio = new Edificio("Edificio A", "TIC");
		edificio.listarClases();
		edificio.reservarClase(edificio.getClases().get(20)); //tenemos dos metodos para reservar clases uno pasando como argumento una clase
		edificio.reservarClase(21);//y otro pasando como argumento el numero de la clase
		edificio.listarClasesReservadas();
		edificio.quitarReservaClase(20);
		edificio.listarClasesReservadas();
		
		Edificio edificio2 = new Edificio("Edificio B", "CCSS");
		edificios.add(edificio);
		edificios.add(edificio2);
		
		
		System.out.println("-----------------------------------------------");
		
		Universidad uem = new Universidad("uem", edificios, null, alumnos);
		
		for (int i = 0; i < 20; i++) {
			Alumno alumno = new AlumnoPreGrado("Alumno ", String.valueOf(i+1) , i*1000, 13000, 18, asignaturasGrado);
			alumnos.add(alumno);
		}
		
		uem.listarAlumnos();
		
		for (int i = 0; i < 10; i++) {
			Alumno postGrado = new AlumnoPostGrado(20000, 30, asignaturasPostGrado, (AlumnoPreGrado) alumnos.get(i));
			alumnos.add(i,postGrado);
		}

		
		uem.listarAlumnos();
		uem.listarAlumnosPostGrado();
		uem.listarAlumnosPreGrado();
		
		
		for (int i = 0; i < 10; i++) {
			Personal noDocente = new PersonalNoDocente("PersonalNoDocente", String.valueOf(i+1) , "123457H", i*12, 40, 20000, "Finanzas");
			personal.add(noDocente);
		}
		
		for (int i = 0; i < 10; i++) {
			Vector <Asignatura> aux;
			if(i%3==0)
				aux = asignaturasPostGrado;
			else 
				aux = asignaturasGrado;
					
			Personal noDocente = new PersonalDocente("PersonalDocente", String.valueOf(i+1) , "123457H", i*12, 40, 40000, "Jefe de departamento", aux);
			personal.add(noDocente);
		}
		
		
		System.out.println("\n---------PRUEBAS AGREGAR NOTA A UN ALUMNO EN CONCRETO Y CALCULAR MEDIA-------");
		
		for (int i = 0; i < asignaturasPostGrado.size(); i++) { //En este caso vamos a coger un alumno de postgrado la media tiene que dar 5.5 -> 33/6 = 5.5
			alumnos.get(1).aniadirNotaAsignatura(3+i, asignaturasPostGrado.get(i));
		}
		
		System.out.println("Nota media del alumno "+ alumnos.get(1).getNombre() + alumnos.get(1).getApellido() + ": " + alumnos.get(1).calcularMedia());
		
		
		uem.setPersonal(personal);
		uem.listarPersonalNoDocente();
		uem.listarPersonalDocente();
		
		uem.listarGastosUniversidad();
		uem.listarIngresosUniversidad();
		
		uem.balancePerdidasYGanancias();
		
		

	}

}
