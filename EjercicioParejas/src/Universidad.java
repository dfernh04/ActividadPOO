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
		for (int i = 0; i < this.personal.size(); i++) {
			System.out.println("\t- " + this.personal.get(i).getNombre() + " " + this.personal.get(i).getApellidos());
		}
	}
	
	public void listarPersonalDocente() {
		System.out.println("\nLISTADO DE DOCENTE:");
		for (int i = 0; i < this.personal.size(); i++) {
			if (this.personal.get(i) instanceof Docente) {
				Docente docente = (Docente)this.personal.get(i);
				System.out.println("\t- " + docente.getNombre() + " " + docente.getApellidos() + ", con rol " + docente.getRol());
			}
		}
	}
	
	public void listarPersonalNoDocente() {
		System.out.println("\nLISTADO DE PERSONA NO DOCENTE:");
		for (int i = 0; i < this.personal.size(); i++) {
			if (this.personal.get(i) instanceof NoDocente) {
				NoDocente noDocente = (NoDocente)this.personal.get(i);
				System.out.println("\t- " + noDocente.getNombre() + " " + noDocente.getApellidos() + ", trabajando en el area " + noDocente.getArea());
			}
		}
	}
	
	public double salarioTotalPersonal() {
		System.out.println("\nSALRIO TOTAL PERSONAL:");
		double salario = 0;
		for (int i = 0; i < this.personal.size(); i++) 
			salario += this.personal.get(i).getSalario();
		return salario;
	}
	
	public double salarioTotalDocente() {
		System.out.println("\nSALRIO TOTAL PERSONAL DOCENTE:");
		double salario = 0;
		for (int i = 0; i < this.personal.size(); i++) 
			if(this.personal.get(i) instanceof Docente)
				salario += this.personal.get(i).getSalario();
		return salario;
	}
	
	public double salarioTotalNoDocente() {
		System.out.println("\nSALRIO TOTAL PERSONAL DOCENTE:");
		double salario = 0;
		for (int i = 0; i < this.personal.size(); i++) 
			if(this.personal.get(i) instanceof NoDocente)
				salario += this.personal.get(i).getSalario();
		return salario;
	}
	
	public void listarAlumnos() {
		System.out.println("\nLISTADO DE ALUMNOS:");
		for (int i = 0; i < this.alumnos.size(); i++) {
			System.out.println("\t- " + this.alumnos.get(i).getNombre() + " " + this.alumnos.get(i).getApellido());
		}
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
