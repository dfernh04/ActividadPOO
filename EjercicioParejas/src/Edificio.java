import java.util.Vector;

public class Edificio {

	private String nombre;
	private String area;
	private Vector<Clase> clases;

	/**Constructor de la clase Edificio sin vector de clases para que te genere automaticamente las clases
	 * @param nombre
	 * @param area
	 */
	public Edificio(String nombre, String area) {
		this.nombre = nombre;
		this.area = area;
		this.clases = crearclases();
	}

	/**Constructor de la clase Edificio con opcion de añadir el vector de clases de forma manual
	 * @param nombre
	 * @param area
	 * @param clases
	 */
	public Edificio(String nombre, String area, Vector<Clase> clases) {
		this.nombre = nombre;
		this.area = area;
		this.clases = crearclases();
	}

	public Vector<Clase> crearclases() {
		Vector<Clase> clases = new Vector<Clase>();
		for(int i = 0; i < 30; i++) {
			Clase clase = new Clase((i+1), 0, false, false, 0, false);
			if(i < 10) 
				clase.setPiso(1);
			else if(i < 20) 
				clase.setPiso(2);
			else if(i < 30) 
				clase.setPiso(3);
			clases.add(clase);
		}
		return clases;
	}


	public boolean reservarClase(Clase clase) {
		boolean reservada = false;
		boolean encontrado = false;
		int i = 0;
		while(!encontrado && i < clases.size()) {
			if(clase.equals(clases.get(i))) {
				if(!clases.get(i).isReservar()) {
					clases.get(i).setReservar(true);
					System.out.println("\nReservado el aula " + this.getClases().get(i).getNumero() + " satisfactoriamente");
					reservada = true;
					encontrado = true;
				} else {
					System.out.println("ERROR AL RESERVAR CLASE: La clase ya esta reservada");
					encontrado = true;
				}
			}
			i++;
		}

		if(!encontrado)
			System.out.println("ERROR AL RESERVAR CLASE: Esa clase no existe");

		return reservada;
	}

	public boolean reservarClase(int numClase) {
		boolean reservada = false;
		boolean encontrado = false;
		int i = 0;

		while(!encontrado && i < this.clases.size()) {
			if(numClase == this.clases.get(i).getNumero()) {
				if(!this.clases.get(i).isReservar()) {
					this.clases.get(i).setReservar(true);
					System.out.println("\nReservado el aula " + this.getClases().get(i).getNumero() + " satisfactoriamente");
					reservada = true;
					encontrado = true;
				} else {
					System.out.println("ERROR AL RESERVAR CLASE: La clase ya esta reservada");
					encontrado = true;
				}
			}
			i++;
		}

		if(!encontrado)
			System.out.println("ERROR AL RESERVAR CLASE: Esa clase no existe");

		return reservada;
	}
	
	public boolean quitarReservaClase(int numClase) {
		boolean noReservada = false;
		boolean encontrado = false;
		int i = 0;

		while(!encontrado && i < this.clases.size()) {
			if(numClase == this.clases.get(i).getNumero()) {
				if(this.clases.get(i).isReservar()) {
					this.clases.get(i).setReservar(false);
					System.out.println("\nQuitada la reserva del aula " + this.getClases().get(i).getNumero() + " satisfactoriamente");
					noReservada = true;
					encontrado = true;
				} else {
					System.out.println("ERROR AL QUITAR RESERVA DE CLASE: La clase ya esta sin reservar");
					encontrado = true;
				}
			}
			i++;
		}

		if(!encontrado)
			System.out.println("ERROR AL QUITAR RESERVA DE CLASE: Esa clase no existe");

		return noReservada;
	}


	public void listarClases() {
		System.out.println("\nCLASES DEL EDIFICIO " + this.getNombre().toUpperCase() + ":");
		for (int i = 0; i < clases.size(); i++) 
			System.out.println("\tAula " + clases.get(i).getNumero() + " en planta " + clases.get(i).getPiso());

		System.out.println();
	}

	public void listarClasesReservadas() {
		System.out.println("\nCLASES RESERVADAS DE EDIFICIO " + this.getNombre().toUpperCase() + ":");
		for (int i = 0; i < clases.size(); i++) 
			if(clases.get(i).isReservar())
				System.out.println("\tAula " + clases.get(i).getNumero());

		System.out.println();
	}


	//------------GETTERS Y SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Vector<Clase> getClases() {
		return clases;
	}

	public void setClases(Vector<Clase> clases) {
		this.clases = clases;
	}


}
