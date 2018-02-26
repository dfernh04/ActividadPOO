import java.util.Vector;

public class Edificio {
	
	private String nombre;
	private String area;
	private Vector<Clase> clases;
	
	/**
	 * @param nombre
	 * @param area
	 * @param clases
	 */
	public Edificio(String nombre, String area, Vector<Clase> clases) {
		this.nombre = nombre;
		this.area = area;
		this.clases = crearclase();
	}
	public Vector<Clase> crearclase() {
		int i=0;
		for(i=0;i<31;i++) {
			this.clases.get(i).setNumero(i);
			this.clases.get(i).setReservar(false);
			if(i<=10) {
				this.clases.get(i).setPiso(1);
			}
			else if(i<=20) {
				this.clases.get(i).setPiso(2);
			}
			else if(i<=30) {
				this.clases.get(i).setPiso(3);
			}
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
					reservada = true;
					encontrado = true;
				} else {
					System.out.println("La clase ya esta reservada");
					encontrado = true;
				}
			}
			i++;
		}
		
		if(!encontrado)
			System.out.println("Esa clase no existe");
		
		/*for (int i = 0; i < clases.size(); i++) {
			if(clase.equals(clases.get(i))) {
				if(!clases.get(i).isReservar()) {
					clases.get(i).setReservar(true);
					reservada = true;					
				} else {
					System.out.println("La clase ya esta reservada");
					reservada = false;
				}
			}
		}*/

		return reservada;
	}
	
	public void listarClasesReservadas() {
		System.out.println("\nCLASES RESERVADAS:");
		for (int i = 0; i < clases.size(); i++) 
			if(clases.get(i).isReservar())
				System.out.println("\t-" + clases.get(i).getNumero());
		
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
