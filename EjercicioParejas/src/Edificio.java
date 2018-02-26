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
		this.clases = clases;
	}
	
	public boolean reservarClase(Clase clase) {
		boolean reservada = false;
		
		for (int i = 0; i < clases.size(); i++) {
			if(clase.equals(clases.get(i))) {
				clases.get(i).setReservar(true);
				reservada = true;
			}
		}
		
		if(!reservada)
			System.out.println("Esa clase no existe");
		
		return reservada;
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
