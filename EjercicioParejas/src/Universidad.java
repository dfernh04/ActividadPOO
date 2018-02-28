import java.util.Vector;

public class Universidad {

	private String nombreUniversidad;

	private Vector <Edificio> edificios;
	private Vector <Personal> personal;
	private static Vector <Alumno> alumnosU;


	/**
	 * @param nombreUniversidad
	 * @param edificios
	 * @param personal
	 * @param alumnos
	 */
	public Universidad(String nombreUniversidad, Vector<Edificio> edificios, Vector<Personal> personal,
			Vector<Alumno> alumnosV) {
		super();
		this.nombreUniversidad = nombreUniversidad;
		this.edificios = edificios;
		this.personal = personal;
		alumnosU = alumnosV;
	}

	public boolean aniadirEdificio(Edificio edificio) {
		boolean aniadido = false;
		if(edificio != null) {
			this.edificios.add(edificio);
			aniadido = true;
		}
		return aniadido;
	}

	public boolean eliminarEdificio(Edificio edificio) {
		boolean eliminado = false;
		if(edificio != null) {
			this.edificios.removeElement(edificio);
			eliminado = true;
		}
		return eliminado;
	}

	public boolean aniadirPersonal(Personal empleado) {
		boolean aniadido = false;
		if(empleado != null) {
			this.personal.add(empleado);
			aniadido = true;
		}
		return aniadido;
	}

	public void listarPersonal() {
		System.out.println("\nLISTADO DE PERSONAL:");
		if(!this.personal.isEmpty()) {
			for (int i = 0; i < this.personal.size(); i++) 
				System.out.println("\t- " + this.personal.get(i).getNombre() + " " + this.personal.get(i).getApellidos());
		}else
			System.out.println("\tERROR: No hay personal asociado a esta universidad.");

			
	}

	public void listarPersonalDocente() {
		System.out.println("\nLISTADO DE PERSONAL DOCENTE:");
		if(!this.personal.isEmpty()) {
			for (int i = 0; i < this.personal.size(); i++) 
				if (this.personal.get(i) instanceof PersonalDocente) {
					PersonalDocente docente = (PersonalDocente)this.personal.get(i);
					System.out.println("\t- " + docente.getNombre() + " " + docente.getApellidos() + ", con rol " + docente.getRol());
				}
		} else
			System.out.println("\tERROR: No hay personal docente asociado a esta universidad.");
	}

	public void listarPersonalNoDocente() {
		System.out.println("\nLISTADO DE PERSONAL NO DOCENTE:");
		if(!this.personal.isEmpty()) {
			for (int i = 0; i < this.personal.size(); i++) 
				if (this.personal.get(i) instanceof PersonalNoDocente) {
					PersonalNoDocente noDocente = (PersonalNoDocente)this.personal.get(i);
					System.out.println("\t- " + noDocente.getNombre() + " " + noDocente.getApellidos() + ", trabajando en el area " + noDocente.getArea());
				}
		} else
			System.out.println("\tERROR: No hay personal no docente asociado a esta universidad.");
	}

	public double salarioTotalPersonal() {
		double salario = 0;
		if(!this.personal.isEmpty()) {
			salario = this.salarioTotalPersonalDocente() + this.salarioTotalPersonalNoDocente();
		}
		return salario;
	}

	public double salarioTotalPersonalDocente() {
		double salario = 0;
		if(!this.personal.isEmpty())
			for (int i = 0; i < this.personal.size(); i++) 
				if(this.personal.get(i) instanceof PersonalDocente)
					salario += this.personal.get(i).getSalario();
		return salario;
	}

	public double salarioTotalPersonalNoDocente() {
		double salario = 0;
		if(!this.personal.isEmpty())
			for (int i = 0; i < this.personal.size(); i++) 
				if(this.personal.get(i) instanceof PersonalNoDocente)
					salario += this.personal.get(i).getSalario();
		return salario;
	}

	public void listarAlumnos() {
		System.out.println("\nLISTADO DE ALUMNOS:");
		if(!alumnosU.isEmpty()) {
			for (int i = 0; i < alumnosU.size(); i++) 
				System.out.println("\t- " + alumnosU.get(i).getNombre() + " " + alumnosU.get(i).getApellido() + " : " + alumnosU.get(i).getRol());
		}else
			System.out.println("ERROR: No hay alumnos asociados a esta universidad.");
	}
	
	public void listarAlumnosPreGrado() {
		System.out.println("\nLISTADO DE ALUMNOS PREGRADO:");
		if(!alumnosU.isEmpty()) {
			for (int i = 0; i < alumnosU.size(); i++) 
				if(alumnosU.get(i) instanceof AlumnoPreGrado)
					System.out.println("\t- " + alumnosU.get(i).getNombre() + " " + alumnosU.get(i).getApellido() + " : " + alumnosU.get(i).getRol());
		}else
			System.out.println("ERROR: No hay alumnos de pregrado asociados a esta universidad.");
	}
	
	public void listarAlumnosPostGrado() {
		System.out.println("\nLISTADO DE ALUMNOS POSTGRADO:");
		if(!alumnosU.isEmpty()) {
			for (int i = 0; i < alumnosU.size(); i++) 
				if(alumnosU.get(i) instanceof AlumnoPostGrado)
					System.out.println("\t- " + alumnosU.get(i).getNombre() + " " + alumnosU.get(i).getApellido() + " : " + alumnosU.get(i).getRol());
		}else
			System.out.println("ERROR: No hay alumnos de pregrado asociados a esta universidad.");
	}
	
	
	public boolean darDeBajaAlumno(Alumno alumno) {
		boolean baja = false;
		if(alumno != null)
			for (int i = 0; i < alumnosU.size(); i++) {
				if(alumno.equals(alumnosU.get(i))) {
					alumnosU.removeElement(alumnosU.get(i));
					baja = true;
				}
			}
		return baja;
	}

	public double calcularIngresoTotalAlumnos() {
		double ingreso = 0;
		if(!alumnosU.isEmpty())
			ingreso = this.calcularIngresoAlumnoPreGrado() + this.calcularIngresoAlumnoPostGrado();
		return ingreso;
	}
	
	public double calcularIngresoAlumnoPreGrado() {
		double ingreso = 0;
		if(!alumnosU.isEmpty())
			for (int i = 0; i < alumnosU.size(); i++) 
				if(alumnosU.get(i) instanceof AlumnoPreGrado) 
					ingreso += alumnosU.get(i).getFactura();
		return ingreso;
	}
	
	public double calcularIngresoAlumnoPostGrado() {
		double ingreso = 0;
		if(!alumnosU.isEmpty())
			for (int i = 0; i < alumnosU.size(); i++) 
				if(alumnosU.get(i) instanceof AlumnoPostGrado) 
					ingreso += alumnosU.get(i).getFactura();
		return ingreso;
	}
	
	
	public double balancePerdidasYGanancias() {
		double resultado = 0;
		resultado = this.calcularIngresoTotalAlumnos() - this.salarioTotalPersonal();
		if(resultado >= 0)
			System.out.println("\nLa universidad " + this.getNombreUniversidad().toUpperCase() + " ha obtenido unos beneficios de " + resultado + " €");
		else
			System.out.println("\nLa universidad " + this.getNombreUniversidad().toUpperCase() + " ha obtenido unas perdidas de " + resultado + " €");

		return resultado;
	}
	
	public void listarGastosUniversidad() {
		System.out.println("\nDESGLOSE DE GATOS:");
		System.out.println("\t- Gastos de personal docente: " + this.salarioTotalPersonalDocente() + "€");
		System.out.println("\t- Gastos de personal no docente: " + this.salarioTotalPersonalNoDocente() + "€");
		System.out.println("\t- GASTO TOTAL: " + this.salarioTotalPersonal() + "€\n");
	}
	
	public void listarIngresosUniversidad() {
		System.out.println("\nDESGLOSE DE INGRESOS:");
		System.out.println("\t- Ingresos de alumnos de PreGrado: " + this.calcularIngresoAlumnoPreGrado() + "€");
		System.out.println("\t- Gastos de personal de PostGrado: " + this.calcularIngresoAlumnoPostGrado() + "€");
		System.out.println("\t- GASTO TOTAL: " + this.calcularIngresoTotalAlumnos() + "€\n");
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


	public static Vector<Alumno> getAlumnos() {
		return alumnosU;
	}


	public void setAlumnos(Vector<Alumno> alumnos) {
		alumnosU = alumnos;
	}


}
