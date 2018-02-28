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

	public boolean añadirPersonal(Personal empleado) {
		boolean añadido = false;
		if(empleado != null) {
			this.personal.add(empleado);
			añadido = true;
		}
		return añadido;
	}

	public void listarPersonal() {
		System.out.println("\nLISTADO DE PERSONAL:");
		if(!this.personal.isEmpty())
			for (int i = 0; i < this.personal.size(); i++) 
				System.out.println("\t- " + this.personal.get(i).getNombre() + " " + this.personal.get(i).getApellidos());
		else
			System.out.println("\tERROR: No hay personal asociado a esta universidad.");

			
	}

	public void listarPersonalDocente() {
		System.out.println("\nLISTADO DE DOCENTE:");
		if(!this.personal.isEmpty()) {
			for (int i = 0; i < this.personal.size(); i++) 
				if (this.personal.get(i) instanceof Docente) {
					Docente docente = (Docente)this.personal.get(i);
					System.out.println("\t- " + docente.getNombre() + " " + docente.getApellidos() + ", con rol " + docente.getRol());
				}
		} else
			System.out.println("\tERROR: No hay personal docente asociado a esta universidad.");
	}

	public void listarPersonalNoDocente() {
		System.out.println("\nLISTADO DE PERSONA NO DOCENTE:");
		if(!this.personal.isEmpty()) {
			for (int i = 0; i < this.personal.size(); i++) 
				if (this.personal.get(i) instanceof NoDocente) {
					NoDocente noDocente = (NoDocente)this.personal.get(i);
					System.out.println("\t- " + noDocente.getNombre() + " " + noDocente.getApellidos() + ", trabajando en el area " + noDocente.getArea());
				}
		} else
			System.out.println("\tERROR: No hay personal no docente asociado a esta universidad.");
	}

	public double salarioTotalPersonal() {
		System.out.println("\nSALRIO TOTAL PERSONAL:");
		double salario = 0;
		if(!this.personal.isEmpty())
			for (int i = 0; i < this.personal.size(); i++) 
				salario += this.personal.get(i).getSalario();
		return salario;
	}

	public double salarioTotalPersonalDocente() {
		System.out.println("\nSALRIO TOTAL PERSONAL DOCENTE:");
		double salario = 0;
		if(!this.personal.isEmpty())
			for (int i = 0; i < this.personal.size(); i++) 
				if(this.personal.get(i) instanceof Docente)
					salario += this.personal.get(i).getSalario();
		return salario;
	}

	public double salarioTotalPersonalNoDocente() {
		System.out.println("\nSALRIO TOTAL PERSONAL DOCENTE:");
		double salario = 0;
		if(!this.personal.isEmpty())
			for (int i = 0; i < this.personal.size(); i++) 
				if(this.personal.get(i) instanceof NoDocente)
					salario += this.personal.get(i).getSalario();
		return salario;
	}

	public void listarAlumnos() {
		System.out.println("\nLISTADO DE ALUMNOS:");
		if(!alumnosU.isEmpty())
			for (int i = 0; i < alumnosU.size(); i++) 
				System.out.println("\t- " + alumnosU.get(i).getNombre() + " " + alumnosU.get(i).getApellido() + " : " + alumnosU.get(i).getRol());
		else
			System.out.println("ERROR: No hay alumnos asociados a esta universidad.");
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
			for (int i = 0; i < alumnosU.size(); i++) 
				ingreso += alumnosU.get(i).getFactura();
		return ingreso;
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


	public static void setAlumnos(Vector<Alumno> alumnos) {
		alumnosU = alumnos;
	}


}
